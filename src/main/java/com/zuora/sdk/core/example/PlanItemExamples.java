package com.zuora.sdk.core.example;

import com.zuora.sdk.Account;
import com.zuora.sdk.AccountCreateRequest;
import com.zuora.sdk.Address;
import com.zuora.sdk.ContactCreateRequest;
import com.zuora.sdk.PlanCreateRequest;
import com.zuora.sdk.PriceCreateRequest;
import com.zuora.sdk.PriceEnum.Alignment;
import com.zuora.sdk.PriceEnum.DiscountLevel;
import com.zuora.sdk.PriceEnum.DurationInterval;
import com.zuora.sdk.PriceEnum.Event;
import com.zuora.sdk.PriceEnum.Interval;
import com.zuora.sdk.PriceEnum.RecurringOn;
import com.zuora.sdk.PriceEnum.TiersMode;
import com.zuora.sdk.Product;
import com.zuora.sdk.ProductCreateRequest;
import com.zuora.sdk.Recurring;
import com.zuora.sdk.Tier;
import com.zuora.sdk.ZuoraClient;
import com.zuora.sdk.enums.ApplyDiscountTo;
import com.zuora.sdk.internal.models.enums.BillingTiming;

import java.util.Currency;
import java.util.EnumSet;


public class PlanItemExamples {

    public static void main(String[] args) {
        String CLIENT_ID = System.getenv("CLIENT_ID");
        String CLIENT_SECRET = System.getenv("CLIENT_SECRET");
        String ENDPOINT = System.getenv("ENDPOINT_BASE");
        ZuoraClient zuoraClient = new ZuoraClient(CLIENT_ID, CLIENT_SECRET, ENDPOINT);

        ContactCreateRequest contactCreateRequest = ContactCreateRequest.builder().firstName("Jenny").lastName("Smith")
                .address(Address.builder().country("USA").state("CA").build()).build();

        Account accountResponse = zuoraClient.accounts()
                .create(AccountCreateRequest.builder()
                        .name("Name")
                        .billTo(contactCreateRequest).build());

        PlanCreateRequest plan = PlanCreateRequest.builder().name("TestRatePlan").activeCurrencies("USD")
                .startDate("2021-01-01").endDate("2121-01-01").build();

        ProductCreateRequest productReq = ProductCreateRequest.builder().name("Product Name").build();

        String accountingCodeName = zuoraClient.priceHelper().getDefaultAccountingCodeName();

        // Per Unit Pricing includes Unit Amounts and Recurring charges included a Recurring object
        plan.addPrice(PriceCreateRequest.builder()
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
        plan.addPrice(PriceCreateRequest.builder()
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
        plan.addPrice(PriceCreateRequest.builder()
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
}
