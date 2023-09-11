package com.zuora.sdk.core.example;

import com.zuora.sdk.ZuoraClient;

import java.util.Currency;
import java.util.EnumSet;
import java.util.List;

import javax.swing.GroupLayout.Alignment;

import org.openapitools.client.ApiException;
import org.openapitools.client.api.AccountsApi.CreateAccountParams;
import org.openapitools.client.api.ContactsApi.CreateContactParams;
import org.openapitools.client.model.Account;
import org.openapitools.client.model.AccountContactCreateRequest;
import org.openapitools.client.model.AccountCreateRequest;
import org.openapitools.client.model.Address;
import org.openapitools.client.model.Contact;
import org.openapitools.client.model.ContactCreateRequest;
import org.openapitools.client.model.PlanCreateRequest;
import org.openapitools.client.model.PriceCreateRequest;
import org.openapitools.client.model.Product;
import org.openapitools.client.model.ProductCreateRequest;
import org.openapitools.client.model.Recurring;
import org.openapitools.client.model.Tier;
import org.threeten.bp.LocalDate;
import org.w3c.dom.events.Event;


public class PlanItemExamples {
/*
    public static void main(String[] args) throws ApiException {
        String CLIENT_ID = System.getenv("CLIENT_ID");
        String CLIENT_SECRET = System.getenv("CLIENT_SECRET");
        String ENDPOINT = System.getenv("ENDPOINT_BASE");
        ZuoraClient zuoraClient = new ZuoraClient(CLIENT_ID, CLIENT_SECRET, ENDPOINT);

        AccountContactCreateRequest contactCreateRequest = new AccountContactCreateRequest().firstName("Jenny").lastName("Smith")
                .address(new Address().country("USA").state("CA"));

        Account accountResponse = zuoraClient.accounts()
                .create(new CreateAccountParams(new AccountCreateRequest()
                        .name("Name")
                        .billTo(contactCreateRequest)));

        LocalDate todayDate = LocalDate.now();
        PlanCreateRequest plan = new PlanCreateRequest().name("TestRatePlan").activeCurrencies(List.of("USD"))
                .startDate(LocalDate.of(2021, 1, 1)).endDate(LocalDate.of(2121, 1, 1));

        ProductCreateRequest productReq = new ProductCreateRequest().name("Product Name");

        //String accountingCodeName = zuoraClient.priceHelper().getDefaultAccountingCodeName();
        String accountingCodeName = "DefaultAccountingCodeName";

        // Per Unit Pricing includes Unit Amounts and Recurring charges included a Recurring object
        plan.addPrice(new PriceCreateRequest()
                .unitAmount(Currency.getInstance("USD"), 30.0)
                .unitOfMeasure("Each")
                .name("Recurring Per Unit Price")
                .plan(plan.getId())
                .recognizedRevenueAccountingCode(accountingCodeName)
                .deferredRevenueAccountingCode(accountingCodeName)
                .description("Test Description")
                .recurring(Recurring.builder()
                        .timing(BillingTiming.IN_ADVANCE)
                        .interval(Interval.SPECIFIC_MONTH)
                        .intervalCount(6)
                        .durationInterval(DurationInterval.MONTH)
                        .durationIntervalCount(6)
                        .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM)
                        .on(RecurringOn.ACCOUNT_CYCLE_DATE)
                        .build()
                )
                .startEvent(Event.CONTRACT_EFFECTIVE)
                .build());

        //Tiered, Volume, Tiered with Overage, HighWaterMark pricing includes Tiers.
        plan.addPrice(new PriceCreateRequest()
                .unitOfMeasure("Each")
                .name("Graduated(Tiered) Recurring Price")
                .plan(plan.getId())
                .recognizedRevenueAccountingCode(accountingCodeName)
                .deferredRevenueAccountingCode(accountingCodeName)
                .description("Test Description")
                .tiersMode(TiersMode.GRADUATED)
                .tier(Tier.builder().tier(1).upTo(1000.0).unitAmount(Currency.getInstance("USD"), 30.0).build())
                .tier(Tier.builder().tier(2).upTo(2000.0).unitAmount(Currency.getInstance("USD"), 50.0).build())
                .recurring(Recurring.builder()
                        .timing(BillingTiming.IN_ADVANCE)
                        .interval(Interval.SPECIFIC_MONTH)
                        .intervalCount(6)
                        .durationInterval(DurationInterval.MONTH)
                        .durationIntervalCount(6)
                        .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM)
                        .on(RecurringOn.ACCOUNT_CYCLE_DATE)
                        .build()
                )
                .startEvent(Event.CONTRACT_EFFECTIVE)
                .build());

        //Volume Pricing includes tiers with tier Mode set to Volume. No recurring block indicates oneTime
        plan.addPrice(new PriceCreateRequest()
                .unitOfMeasure("Each")
                .name("OneTime Volume Price")
                .plan(plan.getId())
                .recognizedRevenueAccountingCode(accountingCodeName)
                .deferredRevenueAccountingCode(accountingCodeName)
                .description("Test Description")
                //Set tier mode to volume
                .tiersMode(TiersMode.VOLUME)
                .tier(Tier.builder().tier(1).upTo(1000.0).unitAmount(Currency.getInstance("USD"), 30.0).build())
                .tier(Tier.builder().tier(2).upTo(2000.0).unitAmount(Currency.getInstance("USD"), 50.0).build())
                .startEvent(Event.CONTRACT_EFFECTIVE)
                .build());

        //Flat Fee includes Amount and One time includes no recurring object
        plan.addPrice(PriceCreateRequest.builder()
                .amount(Currency.getInstance("USD"), 30.0)
                .name("OneTime Flat Fee Price")
                .plan(plan.getId())
                .recognizedRevenueAccountingCode(accountingCodeName)
                .deferredRevenueAccountingCode(accountingCodeName)
                .description("Test Description")
                .startEvent(Event.CONTRACT_EFFECTIVE)
                .build());

        //Usage pricing includes a recurring object with usage boolean set to true
        plan.addPrice(PriceCreateRequest.builder()
                .unitOfMeasure("Each")
                .name("Volume Usage Price")
                .plan(plan.getId())
                .recognizedRevenueAccountingCode(accountingCodeName)
                .deferredRevenueAccountingCode(accountingCodeName)
                .description("Test Description")
                //Set tier mode to volume
                .tiersMode(TiersMode.VOLUME)
                .tier(Tier.builder().tier(1).upTo(1000.0).unitAmount(Currency.getInstance("USD"), 30.0).build())
                .tier(Tier.builder().tier(2).upTo(2000.0).unitAmount(Currency.getInstance("USD"), 50.0).build())
                .recurring(Recurring.builder()
                        .interval(Interval.SPECIFIC_MONTH)
                        .intervalCount(6)
                        .durationInterval(DurationInterval.MONTH)
                        .durationIntervalCount(6)
                        .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM)
                        .on(RecurringOn.ACCOUNT_CYCLE_DATE)
                        .usage(true)
                        .build()
                )
                .startEvent(Event.CONTRACT_EFFECTIVE)
                .build());

        //Discount Flat amount includes amounts with apply discount to and discount level populated
        plan.addPrice(PriceCreateRequest.builder()
                .amount(Currency.getInstance("USD"), 30.0)
                .discountLevel(DiscountLevel.SUBSCRIPTION)
                .applyDiscountTo(EnumSet.of(ApplyDiscountTo.RECURRING))
                .name("Discount Flat Fee OneTime Price").plan(plan.getId())
                .recognizedRevenueAccountingCode(accountingCodeName)
                .deferredRevenueAccountingCode(accountingCodeName)
                .description("Test Description")
                .recurring(Recurring.builder()
                        .interval(Interval.SPECIFIC_MONTH)
                        .intervalCount(6)
                        .durationInterval(DurationInterval.MONTH)
                        .durationIntervalCount(6)
                        .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM)
                        .on(RecurringOn.ACCOUNT_CYCLE_DATE)
                        .build()
                )
                .startEvent(Event.CONTRACT_EFFECTIVE)
                .build());

        //Discount Percentage includes percent amount, as a decimal, with apply discount to and discount level populated
        plan.addPrice(PriceCreateRequest.builder()
                .percentAmount(.30)
                .discountLevel(DiscountLevel.SUBSCRIPTION)
                .applyDiscountTo(EnumSet.of(ApplyDiscountTo.USAGE))
                .name("Discount Percentage Price")
                .plan(plan.getId())
                .recognizedRevenueAccountingCode(accountingCodeName)
                .deferredRevenueAccountingCode(accountingCodeName)
                .description("Test Description")
                .startEvent(Event.CONTRACT_EFFECTIVE)
                .recurring(Recurring.builder()
                        .interval(Interval.SPECIFIC_MONTH)
                        .intervalCount(6)
                        .durationInterval(DurationInterval.MONTH)
                        .durationIntervalCount(6)
                        .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM)
                        .on(RecurringOn.ACCOUNT_CYCLE_DATE)
                        .build()
                )
                .build());

        productReq.addPlan(plan);
        Product product = zuoraClient.products().create(productReq);

    }
 */
}
