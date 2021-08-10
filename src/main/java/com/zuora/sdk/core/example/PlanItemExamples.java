package com.zuora.sdk.core.example;

import com.zuora.sdk.Account;
import com.zuora.sdk.AccountCreateRequest;
import com.zuora.sdk.Address;
import com.zuora.sdk.ContactCreateRequest;
import com.zuora.sdk.PlanCreateRequest;
import com.zuora.sdk.Product;
import com.zuora.sdk.ProductCreateRequest;
import com.zuora.sdk.ZuoraClient;
import com.zuora.sdk.chargemodels.PerUnit;
import com.zuora.sdk.chargemodels.ChargeModelInterface.ApplyDiscountTo;
import com.zuora.sdk.chargemodels.ChargeModelInterface.Type;
import com.zuora.sdk.planitems.PlanItemCreateRequest;
import com.zuora.sdk.planitems.PlanItemEnum.Alignment;
import com.zuora.sdk.planitems.PlanItemEnum.Event;
import com.zuora.sdk.planitems.PlanItemEnum.Interval;
import com.zuora.sdk.planitems.PlanItemEnum.RecurringOn;
import com.zuora.sdk.chargemodels.Tiered;
import com.zuora.sdk.chargemodels.Tiered.Tier;
import com.zuora.sdk.chargemodels.DiscountAmount;
import com.zuora.sdk.chargemodels.DiscountPercentage;
import com.zuora.sdk.chargemodels.FlatFee;
import com.zuora.sdk.chargemodels.Volume;
import com.zuora.sdk.core.models.enums.BillingTiming;
import com.zuora.sdk.core.models.enums.DiscountLevel;

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

        String accountingCodeName = zuoraClient.planItemHelper().getDefaultAccountingCodeName();

        // recurringPerUnit
        plan.addPlanItem(PlanItemCreateRequest.recurringBuilder()
                .chargeModel(PerUnit.builder().unitAmount(Currency.getInstance("USD"), 30.0)
                        .unitAmount(Currency.getInstance("EUR"), 45.0).unitOfMeasure("Each").build())
                .name("Test Recurring Per Unit").plan(plan.getId()).accountingCode(accountingCodeName)
                .description("Test Description").timing(BillingTiming.IN_ADVANCE).interval(Interval.SPECIFIC_MONTH)
                .intervalCount(6).duration(Interval.MONTH, 6).startEvent(Event.CONTRACT_EFFECTIVE)
                .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM).on(RecurringOn.ACCOUNT_CYCLE_DATE).build());
        // reccuring-tiered
        plan.addPlanItem(PlanItemCreateRequest.recurringBuilder().name("Test Recurring Tiered").plan(plan.getId())
                .chargeModel(Tiered.builder()
                        .tier(Tier.tierBuilder().tier(1).upTo(1000.0).unitAmount(Currency.getInstance("USD"), 30.0)
                                .unitAmount(Currency.getInstance("EUR"), 45.0).build())
                        .tier(Tier.tierBuilder().tier(2).upTo(2000.0).unitAmount(Currency.getInstance("USD"), 50.0)
                                .unitAmount(Currency.getInstance("EUR"), 75.0).build())
                        .unitOfMeasure("Each").build())
                .accountingCode(accountingCodeName).startEvent(Event.CONTRACT_EFFECTIVE)
                .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM).interval(Interval.MONTH).on(RecurringOn.ACCOUNT_CYCLE_DATE)
                .startEvent(Event.CONTRACT_EFFECTIVE).build());

        // oneTimeTiered
        plan.addPlanItem(PlanItemCreateRequest.oneTimePlanItemBuilder().name("Test OneTime Tiered").plan(plan.getId())
                .chargeModel(Tiered.builder()
                        .tier(Tier.tierBuilder().tier(1).upTo(1000.0).unitAmount(Currency.getInstance("USD"), 30.0)
                                .unitAmount(Currency.getInstance("EUR"), 45.0).build())
                        .tier(Tier.tierBuilder().tier(2).upTo(2000.0).unitAmount(Currency.getInstance("USD"), 50.0)
                                .unitAmount(Currency.getInstance("EUR"), 75.0).build())
                        .unitOfMeasure("Each").quantity(100.0).build())
                .accountingCode(accountingCodeName).startEvent(Event.CONTRACT_EFFECTIVE).build());

        // oneTime-perUnit
        plan.addPlanItem(PlanItemCreateRequest.oneTimePlanItemBuilder()
                .chargeModel(PerUnit.builder().unitAmount(Currency.getInstance("USD"), 30.0).unitOfMeasure("Each").build())
                .name("Test Recurring Per Unit").plan(plan.getId()).accountingCode(accountingCodeName)
                .startEvent(Event.CONTRACT_EFFECTIVE).build());

        // Recurring Flat Fee
        plan.addPlanItem(PlanItemCreateRequest.recurringBuilder().name("Test Recurring Flat Fee").plan(plan.getId())
                .chargeModel(FlatFee.builder().amount(Currency.getInstance("USD"), 30.0)
                        .amount(Currency.getInstance("EUR"), 45.0).build())
                .accountingCode(accountingCodeName).startEvent(Event.CONTRACT_EFFECTIVE)
                .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM).interval(Interval.MONTH).on(RecurringOn.ACCOUNT_CYCLE_DATE)
                .build());

        // onetime flat fee
        plan.addPlanItem(PlanItemCreateRequest.oneTimePlanItemBuilder().name("Test Recurring Flat Fee").plan(plan.getId())
                .chargeModel(FlatFee.builder().amount(Currency.getInstance("USD"), 30.0)
                        .amount(Currency.getInstance("EUR"), 45.0).build())
                .accountingCode(accountingCodeName).startEvent(Event.CONTRACT_EFFECTIVE).build());

        // recurring-volume
        plan.addPlanItem(PlanItemCreateRequest.recurringBuilder().name("Test Recurring Volume").plan(plan.getId())
                .chargeModel(Volume.builder()
                        .tier(Tier.tierBuilder().tier(1).amount(Currency.getInstance("USD"), 30.0)
                                .amount(Currency.getInstance("EUR"), 45.0).upTo(1000.0).build())
                        .tier(Tier.tierBuilder().tier(2).upTo(2000.0).amount(Currency.getInstance("USD"), 50.0)
                                .amount(Currency.getInstance("EUR"), 75.0).build())
                        .unitOfMeasure("Each").type(Type.FLAT_FEE).build())
                .accountingCode(accountingCodeName).startEvent(Event.CONTRACT_EFFECTIVE)
                .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM).interval(Interval.MONTH).on(RecurringOn.ACCOUNT_CYCLE_DATE)
                .build());

        // oneTime Volume
        plan.addPlanItem(PlanItemCreateRequest.oneTimePlanItemBuilder().name("Test Recurring Volume").plan(plan.getId())
                .chargeModel(Volume.builder()
                        .tier(Tier.tierBuilder().tier(1).upTo(1000.0).amount(Currency.getInstance("USD"), 30.0)
                                .amount(Currency.getInstance("EUR"), 45.0).build())
                        .tier(Tier.tierBuilder().tier(2).upTo(2000.0).amount(Currency.getInstance("USD"), 50.0)
                                .amount(Currency.getInstance("EUR"), 75.0).build())
                        .unitOfMeasure("Each").build())
                .accountingCode(accountingCodeName).startEvent(Event.CONTRACT_EFFECTIVE).build());

        // discount flat fee
        plan.addPlanItem(PlanItemCreateRequest.recurringBuilder()
                .chargeModel(DiscountAmount.builder().applyDiscountTo(EnumSet.of(ApplyDiscountTo.ONETIME))
                        .discountLevel(DiscountLevel.SUBSCRIPTION).amount(Currency.getInstance("USD"), 50.0).build())
                .name("Test Recurring Per Unit").plan(plan.getId()).accountingCode(accountingCodeName)
                .description("Test Description").interval(Interval.SPECIFIC_MONTH).intervalCount(6)
                .duration(Interval.MONTH, 6).startEvent(Event.CONTRACT_EFFECTIVE)
                .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM).on(RecurringOn.ACCOUNT_CYCLE_DATE).build());

        // discount percentage
        plan.addPlanItem(PlanItemCreateRequest.recurringBuilder()
                .chargeModel(DiscountPercentage.builder().applyDiscountTo(EnumSet.of(ApplyDiscountTo.ONETIME))
                        .discountLevel(DiscountLevel.SUBSCRIPTION).percentage(Currency.getInstance("USD"), .2).build())
                .name("Test Recurring Per Unit").plan(plan.getId()).accountingCode(accountingCodeName)
                .description("Test Description").interval(Interval.SPECIFIC_MONTH).intervalCount(6)
                .duration(Interval.MONTH, 6).startEvent(Event.CONTRACT_EFFECTIVE)
                .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM).on(RecurringOn.ACCOUNT_CYCLE_DATE).build());

        productReq.addPlan(plan);
        Product product = zuoraClient.products().create(productReq);

    }
}
