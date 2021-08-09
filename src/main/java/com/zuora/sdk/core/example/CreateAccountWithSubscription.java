package com.zuora.sdk.core.example;

import com.zuora.sdk.Account;
import com.zuora.sdk.AccountCreateRequest;
import com.zuora.sdk.Address;
import com.zuora.sdk.BillingDocument;
import com.zuora.sdk.ContactCreateRequest;
import com.zuora.sdk.FlatFee;
import com.zuora.sdk.PlanCreateRequest;
import com.zuora.sdk.PlanItemCreateRequest;
import com.zuora.sdk.PlanItemEnum;
import com.zuora.sdk.ProcessingOption;
import com.zuora.sdk.Product;
import com.zuora.sdk.ProductCreateRequest;
import com.zuora.sdk.Subscription;
import com.zuora.sdk.SubscriptionCreateRequest;
import com.zuora.sdk.ZuoraClient;
import com.zuora.sdk.enums.BillingDocumentType;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Currency;
import java.util.List;


public class CreateAccountWithSubscription {
  public static final String CURRENCY_USD = "USD";
  
  public static void main(String[] args) {

    // 0. Create a client

    String CLIENT_ID = System.getenv("CLIENT_ID");
    String CLIENT_SECRET = System.getenv("CLIENT_SECRET");
    String ENDPOINT = System.getenv("ENDPOINT_BASE");
    ZuoraClient zuoraClient = new ZuoraClient(CLIENT_ID, CLIENT_SECRET, ENDPOINT);

    // 1. Create an account

    ContactCreateRequest contactCreateRequest = ContactCreateRequest.builder().firstName("Jenny").lastName("Smith")
        .address(Address.builder().country("USA").state("CA").build()).build();

    AccountCreateRequest accountCreateRequest = AccountCreateRequest.builder().name("Jenny Smith")
        .billTo(contactCreateRequest).build();

    Account account = zuoraClient.accounts().create(accountCreateRequest);

    // 2. Create a product
    // - Create a plan (immediate billing)
    // - Create a plan item

    ProductCreateRequest productCreateRequest = ProductCreateRequest.builder().name("Gold").build();

    PlanCreateRequest planCreateRequest = PlanCreateRequest.builder().name("Monthly Plan").build();

    productCreateRequest.addPlan(planCreateRequest);

    String defaultAccountingCodeName = zuoraClient.planItemHelper().getDefaultAccountingCodeName();

    PlanItemCreateRequest planItemCreateRequest = PlanItemCreateRequest.recurringBuilder().name("Monthly Membership")
        .chargeModel(FlatFee.builder().amount(Currency.getInstance(CURRENCY_USD), 5.00).build())
        .accountingCode(defaultAccountingCodeName).startEvent(PlanItemEnum.Event.CONTRACT_EFFECTIVE)
        .alignment(PlanItemEnum.Alignment.SUBSCRIPTION_PLAN_ITEM).interval(PlanItemEnum.Interval.MONTH)
        .on(PlanItemEnum.RecurringOn.ACCOUNT_CYCLE_DATE).build();

    planCreateRequest.addPlanItem(planItemCreateRequest);

    Product product = zuoraClient.products().create(productCreateRequest);

    // 3. Create a subscription

    LocalDate todayDate = LocalDate.now();
    String todayDateStr = todayDate.format(DateTimeFormatter.ISO_LOCAL_DATE);

    SubscriptionCreateRequest subscriptionCreateRequest = SubscriptionCreateRequest.builder().account(account)
        .plans(product.getPlans()).serviceActivationDate(todayDate).customerAcceptanceDate(todayDate)
        .processingOption(ProcessingOption.builder().runBilling(true).documentDate(todayDateStr).build()).build();

    Subscription subscription = zuoraClient.subscriptions().create(subscriptionCreateRequest);

    // 4. Retrieve a list of billing documents

    List<BillingDocument> billingDocuments = zuoraClient.billingDocuments().findByAccount(account,
        BillingDocumentType.INVOICE);

    for (BillingDocument billingDocument : billingDocuments) {
      System.out.printf("%s %s %f\n", billingDocument.getId(), billingDocument.getCreateTime(),
          billingDocument.getAmount());
    }

    // 5. Cancel subscription

    zuoraClient.subscriptions().cancel(subscription);

  }    
}
