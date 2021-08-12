# SubscriptionAPI

A subscription is a product or service that has recurring charges, such as a monthly flat fee or charges based on usage. Subscriptions can also include one-time
charges, such as activation fees. Every subscription must be associated with an account.

The Subscription object contains the information needed to create and maintain a subscription associated with an Account object.

```java
SubscriptionAPI subscriptionAPI=zuora.subscriptions();
```

## Methods

* [Create subscription](/doc/subscription-api.md#create-subscription)

* [Get Subscription](/doc/subscription-api.md#get-subscription)

* [Get Subscription Plans](/doc/subscription-api.md#get-subscription-plans)

* [Add Subscription Plan](/doc/subscription-api.md#add-subscription-plan)

* [Update Subscription Plan Item](/doc/subscription-api.md#update-subscription-plan-item)

* [Transfer Owner](/doc/subscription-api.md#transfer-owner)

* [Renew Subscription](/doc/subscription-api.md#cancel-subscription)

* [Cancel Subscription](/doc/subscription-api.md#cancel-subscription)

* [Remove Subscription Plan](/doc/subscription-api.md#cancel-subscription)

# Create Subscription

Creates a new subscription.

```java
Subscription subscription=subscriptionAPI.create(createSubscriptionRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionCreateRequest` | [`SubscriptionCreateRequest`](/doc/models/subscription-create-request.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
SubscriptionCreateRequest subscriptionCreateRequest=SubscriptionCreateRequest.builder()
        .account(accountInstance)
        .build();
Subscription subscription=subscriptionAPI.create(subscriptionCreateRequest);
```

# Get Subscription

```java
Subscription subscription=SubscriptionAPI.get(subscriptionId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the subscription. |

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
String subscriptionId="subscription_id8";
Subscription subscription=subscriptionAPI.get(subscriptionId);
```

# Get Subscription Plans

```java
List<SubscriptionPlan> subscriptionPlans=SubscriptionAPI.getSubscriptionPlans(subscriptionId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the subscription. |

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
String subscriptionId="subscription_id8";

        Subscription subscription=subscriptionAPI.get(subscriptionId);
```

# Add Subscription Plan

```java
Subscription updatedSubscription=subscriptionAPI.addPlan(subscription,plan,LocalDate.now(),LocalDate.now(),LocalDate.now());
```

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
Account accountResponse=zuora.accounts().create(AccountCreateRequest.builder()
        .name(AccountCreateRequestStub.getMinimumStub().getName())
        .billTo(ContactCreateRequestStub.getMinimumStub())
        .build());

SubscriptionCreateRequest sub=SubscriptionCreateRequest.builder()
        .account(accountResponse)
        .initialTerm(Term.builder().build())
        .contractEffectiveDate(startDate)
        .serviceActivationDate(startDate)
        .customerAcceptanceDate(startDate)
        .build();

Subscription subscriptionV1=zuora.subscriptions().create(sub);

Product product=ProductStub.getSeedProduct("SDK-SEED-PRODUCT-0-"+LocalDate.now());
Plan plan=product.getPlans().get(0);
Subscription subscriptionV2=zuora.subscriptions().addPlan(subscriptionV1,plan,LocalDate.now(),LocalDate.now(),LocalDate.now());
```

# Update Subscription Plan Item

```java
Subscription updatedSubscription=subscriptionAPI.updateSubscriptionPlanItem(subscription,subscriptionPlanItem,LocalDate.now());
```

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
Account accountResponse=zuora.accounts().create(AccountCreateRequest.builder()
        .name(AccountCreateRequestStub.getMinimumStub().getName())
        .billTo(ContactCreateRequestStub.getMinimumStub())
        .build()
);

PlanCreateRequest plan=PlanCreateRequest.builder()
        .name("TestRatePlan")
        .activeCurrencies("USD")
        .startDate("2021-01-01")
        .endDate("2121-01-01")
        .build();

ProductCreateRequest productReq=ProductCreateRequestStub.getMinimumStub();

String accountingCodeName=zuora.planItemHelper().getDefaultAccountingCodeName();

//recurringPerUnit
plan.addPlanItem(
        PlanItemCreateRequest.recurringBuilder()
        .chargeModel(PerUnit.builder()
        .unitAmount(Currency.getInstance("USD"),30.0)
        .unitAmount(Currency.getInstance("EUR"),45.0)
        .quantity(50.0)
        .unitOfMeasure("Each")
        .build())
        .name("Test Recurring Per Unit")
        .plan(plan.getId())
        .accountingCode(accountingCodeName)
        .description("Test Description")
        .timing(BillingTiming.IN_ADVANCE)
        .interval(Interval.SPECIFIC_MONTH)
        .intervalCount(6)
        .duration(Interval.MONTH,6)
        .startEvent(Event.CONTRACT_EFFECTIVE)
        .alignment(Alignment.SUBSCRIPTION_PLAN_ITEM)
        .on(RecurringOn.ACCOUNT_CYCLE_DATE)
        .build()
);

productReq.addPlan(plan);
Product product=zuora.products().create(productReq);

Subscription sub=zuora.subscriptions().create(SubscriptionCreateRequest.builder()
        .account(accountResponse)
        .initialTerm(Term.builder().type(TermType.EVERGREEN).build())
        .contractEffectiveDate(startDate.minusMonths(1))
        .serviceActivationDate(startDate.minusMonths(1))
        .customerAcceptanceDate(startDate.minusMonths(1))
        .plans(product.getPlans())
        .build()
);

SubscriptionPlanItem subscriptionPlanItem=sub.getSubscriptionPlans().get(0).getSubscriptionPlanItems().get(0);
PerUnit perUnit=(PerUnit)subscriptionPlanItem.getChargeModel();
perUnit.setQuantity(60.0);
SubscriptionPlanItem subPlanItem=subscriptionPlanItem.toBuilder().chargeModel(perUnit).build();
Subscription newSub=zuora.subscriptions().updateSubscriptionPlanItem(sub,subPlanItem,LocalDate.now());
SubscriptionPlanItem updatedSubPlanItem=newSub.getSubscriptionPlans().get(0).getSubscriptionPlanItems().get(0);
```

# Transfer Owner

```java
Subscription updatedSubscription=subscriptionsAPI.ownerTransfer(subscription,currentAccountKey,newAccountKey);
```

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
AccountCreateRequest account=AccountCreateRequest.builder()
        .name(AccountCreateRequestStub.getMinimumStub().getName())
        .billTo(ContactCreateRequestStub.getMinimumStub())
        .build();
Account accountResponse=zuora.accounts().create(account);
Product product=ProductStub.getSeedProduct("SDK-SEED-PRODUCT-2"+LocalDate.now().toString());

Subscription subscriptionResponse=zuora.subscriptions().create(
        SubscriptionCreateRequest.builder()
        .account(accountResponse)
        .initialTerm(
                Term.builder()
                .intervalCount(12)
                .type(TermType.TERMED)
                .interval("Month")
                .build()
        )
        .renewalTerm(
                Term.builder()
                .intervalCount(24)
                .type(TermType.TERMED)
                .interval("Month")
                .build()
        )
        .plans(product.getPlans())
        .contractEffectiveDate(startDate.minusYears(1))
        .serviceActivationDate(startDate.minusYears(1))
        .customerAcceptanceDate(startDate.minusYears(1))
        .build()
);

AccountCreateRequest newAccount=AccountCreateRequest.builder()
        .name("testAccount")
        .billTo(ContactCreateRequestStub.getMinimumStub())
        .build();
Account newAccountResponse=zuora.accounts().create(newAccount);
AccountCreateRequest newInvoiceAccount=AccountCreateRequest.builder()
        .name("testInvoiceAccount")
        .billTo(ContactCreateRequestStub.getMinimumStub())
        .build();
Account newInvoiceAccountResponse=zuora.accounts().create(newInvoiceAccount);
Subscription baseSub=zuora.subscriptions().get(subscriptionResponse.getId());
Subscription ownertransferSub=subscriptionAPI.ownerTransfer(baseSub,newAccountResponse.getAccountKey(),newInvoiceAccountResponse.getAccountKey());
```

# Renew Subscription

```java
Subscription subscription = subscriptionAPI.renew(subscription.getId());
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the subscription. |

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
AccountCreateRequest account = AccountCreateRequest.builder()
                .name(AccountCreateRequestStub.getMinimumStub().getName())
                .billTo(ContactCreateRequestStub.getMinimumStub())
                .build();
Account accountResponse = zuora.accounts().create(account);
Product product = ProductStub.getSeedProduct("SDK-SEED-PRODUCT-0-" + LocalDate.now().toString());
Subscription subscription = zuora.subscriptions().create(
        SubscriptionCreateRequest.builder()
                .account(accountResponse)
                .initialTerm(Term.builder()
                        .intervalCount(12)
                        .type(TermType.TERMED)
                        .interval("Month")
                        .build())
                .renewalTerm(
                        Term.builder()
                                .intervalCount(24)
                                .type(TermType.TERMED)
                                .interval("Month")
                                .build()
                )
                .plans(product.getPlans())
                .contractEffectiveDate(startDate.minusYears(1))
                .serviceActivationDate(startDate.minusYears(1))
                .customerAcceptanceDate(startDate.minusYears(1))
                .build()
);

zuora.subscriptions().renew(subscription.getId());
```

# Cancel Subscription

```java
Subscription canceledSubcription = subscriptionAPI.cancel(subscription);
```

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
Account accountResponse = zuora.accounts().create(AccountCreateRequest.builder()
                .name(AccountCreateRequestStub.getMinimumStub().getName())
                .billTo(ContactCreateRequestStub.getMinimumStub())
                .build());
Product product = ProductStub.getSeedProduct("SDK-SEED-PRODUCT-0-" + LocalDate.now().toString());

Subscription sub = zuora.subscriptions().create(SubscriptionCreateRequest.builder()
        .account(accountResponse)
        .initialTerm(Term.builder().type(TermType.TERMED).interval("Month").intervalCount(12).build())
        .renewalTerm(Term.builder().type(TermType.EVERGREEN).build())
        .contractEffectiveDate(startDate)
        .serviceActivationDate(startDate)
        .customerAcceptanceDate(startDate)
        .cancelAtPeriodEnd(true)
        .plans(product.getPlans())
        .build());

Subscription canceledSub = zuora.subscriptions().cancel(sub);
```


# Remove Subscription Plan

```java
subscriptionAPI.removeSubscriptionPlan(subscription, subscriptionPlan);
```

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
Account accountResponse = zuora.accounts().create(AccountCreateRequest.builder()
                .name(AccountCreateRequestStub.getMinimumStub().getName())
                .billTo(ContactCreateRequestStub.getMinimumStub())
                .build());
Product product = ProductStub.getSeedProduct("SDK-SEED-PRODUCT-1" + LocalDate.now().toString());

Subscription sub = zuora.subscriptions().create(SubscriptionCreateRequest.builder()
        .account(accountResponse)
        .initialTerm(Term.builder().type(TermType.EVERGREEN).build())
        .contractEffectiveDate(startDate)
        .serviceActivationDate(startDate)
        .customerAcceptanceDate(startDate)
        .plans(product.getPlans())
        .build());

List<SubscriptionPlan> originalSubPlans = null;

originalSubPlans = zuora.subscriptions().getSubscriptionPlans(sub.getId());

sub = zuora.subscriptions().removeSubscriptionPlan(sub, originalSubPlans.get(0));
```







