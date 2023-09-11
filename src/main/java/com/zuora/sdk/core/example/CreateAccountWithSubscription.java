package com.zuora.sdk.core.example;

import com.zuora.sdk.ZuoraClient;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import org.openapitools.client.ApiException;
import org.openapitools.client.api.AccountsApi.CreateAccountParams;
import org.openapitools.client.api.PlansApi.CreatePlanParams;
import org.openapitools.client.api.PricesApi.CreatePriceParams;
import org.openapitools.client.api.ProductsApi.CreateProductParams;
import org.openapitools.client.api.SubscriptionsApi.CancelSubscriptionParams;
import org.openapitools.client.api.SubscriptionsApi.CreateSubscriptionParams;
import org.openapitools.client.model.Account;
import org.openapitools.client.model.AccountContactCreateRequest;
import org.openapitools.client.model.AccountCreateRequest;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.BillingDocument;
import org.openapitools.client.model.CancelSubscriptionRequest;
import org.openapitools.client.model.Plan;
import org.openapitools.client.model.PlanCreateRequest;
import org.openapitools.client.model.Price;
import org.openapitools.client.model.PriceCreateRequest;
import org.openapitools.client.model.ProcessingOptions;
import org.openapitools.client.model.Product;
import org.openapitools.client.model.ProductCreateRequest;
import org.openapitools.client.model.Recurring;
import org.openapitools.client.model.StartOn;
import org.openapitools.client.model.Subscription;
import org.openapitools.client.model.SubscriptionCreateRequest;
import org.openapitools.client.model.SubscriptionPlanCreateRequest;
import org.openapitools.client.model.CancelSubscriptionRequest.CancelAtEnum;
import org.openapitools.client.model.PriceCreateRequest.StartEventEnum;
import org.openapitools.client.model.ProcessingOptions.CollectionMethodEnum;
import org.openapitools.client.model.Recurring.AlignmentBehaviorEnum;
import org.openapitools.client.model.Recurring.DurationIntervalEnum;
import org.openapitools.client.model.Recurring.IntervalEnum;
import org.openapitools.client.model.Recurring.RecurringOnEnum;
import org.openapitools.client.model.Recurring.TimingEnum;
import org.threeten.bp.LocalDate;

public class CreateAccountWithSubscription {

        public static final String CURRENCY_USD = "USD";

        public static void main(String[] args) {

                // 0. Create a client

                String CLIENT_ID = System.getenv("CLIENT_ID");
                String CLIENT_SECRET = System.getenv("CLIENT_SECRET");
                String ENDPOINT = "https://rest.apisandbox.zuora.com"; // System.getenv("ENDPOINT_BASE");
                // String ENDPOINT = System.getenv("ENDPOINT_BASE");
                ZuoraClient zuoraClient = new ZuoraClient(CLIENT_ID, CLIENT_SECRET, ENDPOINT);
                zuoraClient.initialize();

                // 1. Create an account
                AccountContactCreateRequest contactCreateRequest = new AccountContactCreateRequest().firstName("Jenny")
                                .lastName("Smith")
                                .address(new Address().country("USA").state("CA"));

                AccountCreateRequest accountCreateRequest = new AccountCreateRequest().name("Jenny Smith")
                                .billTo(contactCreateRequest)
                                .currency("USD");

                Account account = null;
                try {
                        account = zuoraClient.accounts().create(new CreateAccountParams(accountCreateRequest));
                } catch (ApiException e) {
                        throw new IllegalStateException(e);
                }

                // 2. Create a product
                // - Create a plan (immediate billing)
                // - Create a plan item

                ProductCreateRequest productCreateRequest = new ProductCreateRequest().name("Gold");
                Product product = null;
                try {
                        product = zuoraClient.products().create(new CreateProductParams(productCreateRequest));
                } catch (ApiException e) {
                        throw new IllegalStateException(e);
                }

                PlanCreateRequest planCreateRequest = new PlanCreateRequest().name("Monthly Plan")
                                .productId(product.getId());
                Plan plan = null;
                try {
                        plan = zuoraClient.plans().create(new CreatePlanParams(planCreateRequest));
                } catch (ApiException e) {
                        throw new IllegalStateException(e);
                }

                // String defaultAccountingCodeName =
                // zuoraClient.priceHelper().getDefaultAccountingCodeName();
                String defaultAccountingCodeName = "CodeName";

                PriceCreateRequest planItemCreateRequest = new PriceCreateRequest()
                                .planId(plan.getId())
                                .unitAmounts(Map.of("USD", new BigDecimal(30.0)))
                                .unitOfMeasure("Each")
                                .name("Recurring Per Unit Price")
                                .recognizedRevenueAccountingCode(defaultAccountingCodeName)
                                .deferredRevenueAccountingCode(defaultAccountingCodeName)
                                .description("Test Description")
                                .recurring(new Recurring()
                                                .timing(TimingEnum.ADVANCE)
                                                .interval(IntervalEnum.MONTH)
                                                .intervalCount(6)
                                                .durationInterval(DurationIntervalEnum.MONTH)
                                                .durationIntervalCount(6)
                                                .alignmentBehavior(AlignmentBehaviorEnum.SUBSCRIPTION_START)
                                                .recurringOn(RecurringOnEnum.ACCOUNT_CYCLE_DATE))
                                .startEvent(StartEventEnum.CONTRACT_EFFECTIVE);
                Price price = null;
                try {
                        price = zuoraClient.prices().create(new CreatePriceParams(planItemCreateRequest));
                } catch (ApiException e) {
                        throw new IllegalStateException(e);
                }

                // 3. Create a subscription

                LocalDate todayDate = LocalDate.now();

                SubscriptionCreateRequest subscriptionCreateRequest = new SubscriptionCreateRequest()
                                .accountId(account.getId())
                                .subscriptionPlans(List.of(new SubscriptionPlanCreateRequest().planId(plan.getId())))
                                .startOn(new StartOn()
                                                .serviceActivation(todayDate)
                                                .customerAcceptance(todayDate)
                                                .contractEffective(todayDate))
                                .processingOptions(new ProcessingOptions()
                                                .collectionMethod(CollectionMethodEnum.CREATE_INVOICE)
                                                .documentDate(todayDate));

                Subscription subscription = null;
                try {
                        subscription = zuoraClient.subscriptions()
                                        .create(new CreateSubscriptionParams(subscriptionCreateRequest));
                } catch (ApiException e) {
                        throw new IllegalStateException(e);
                }

                // 4. Retrieve a list of billing documents

                List<BillingDocument> billingDocuments = null;
                try {
                        billingDocuments = zuoraClient.billingDocuments().getBillingDocuments().getData();
                } catch (ApiException e) {
                        throw new IllegalStateException(e);
                }
                // .findByAccount(account, BillingDocumentTypeEnum.INVOICE);

                for (BillingDocument billingDocument : billingDocuments) {
                        System.out.printf("%s %s %f %f\n", billingDocument.getId(), billingDocument.getCreatedTime(),
                                        billingDocument.getAmountPaid(), billingDocument.getAmountRefunded());
                }

                // 5. Cancel subscription
                try {
                        zuoraClient.subscriptions().cancel(
                                        new CancelSubscriptionParams(subscription.getId(),
                                                        new CancelSubscriptionRequest()
                                                                        .cancelAt(CancelAtEnum.INVOICE_PERIOD_END)));
                } catch (ApiException e) {
                        throw new IllegalStateException(e);
                }
        }
}
