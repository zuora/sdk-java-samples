# Subscription API

A subscription is a product or service that has recurring charges, such as a monthly flat fee or charges based on usage. Subscriptions can also include one-time charges, such as service activation fees. Every subscription must be associated with an account.

The Subscription object contains the information needed to create and maintain a subscription associated with an Account object.

## Methods

* [Create subscription](/doc/subscription-api.md#create-subscription)

* [Get Subscription](/doc/subscription-api.md#get-subscription)

* [Get Subscription Plans](/doc/subscription-api.md#get-subscription-plans)

* [Add Subscription Plan](/doc/subscription-api.md#add-subscription-plan)

* [Update Subscription Plan Item](/doc/subscription-api.md#update-subscription-plan-item)

* [Transfer Owner](/doc/subscription-api.md#transfer-owner)

* [Renew Subscription](/doc/subscription-api.md#renew-subscription)

* [Cancel Subscription](/doc/subscription-api.md#cancel-subscription)

* [Remove Subscription Plan](/doc/subscription-api.md#remove-subscription-plan)

# Create Subscription

Creates a new subscription.

```java
Subscription subscription=zuoraClient.subscriptions().create(subscriptionCreateRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `subscriptionCreateRequest` | [`SubscriptionCreateRequest`](/doc/models/subscription-create-request.md) | Required | Subscription request object. |

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
SubscriptionCreateRequest subscriptionCreateRequest=SubscriptionCreateRequest.builder()
        .account(account)
        .build();
        
Subscription subscription=zuoraClient.subscriptions().create(subscriptionCreateRequest);
```

# Get Subscription

```java
Subscription subscription=zuoraClient.subscriptions().get(subscriptionId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the subscription. |

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
String SUBSCRIPTION_ID="subscription_id8";

Subscription subscription=zuoraClient.subscriptions().get(SUBSCRIPTION_ID);
```

# Get Subscription Plans

```java
List<SubscriptionPlan> subscriptionPlans=zuoraClient.subscriptions().getSubscriptionPlans(subscriptionId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the subscription. |

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
String SUBSCRIPTION_ID="subscription_id8";

Subscription subscription=zuoraClient.subscriptions().get(SUBSCRIPTION_ID);
```

# Add Subscription Plan

```java
Subscription updatedSubscription=
        zuoraClient.subscriptions().addPlan(subscription,
                plan, LocalDate.now(), LocalDate.now(), LocalDate.now());
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

Subscription subscriptionV1=zuoraClient.subscriptions().create(sub);

Product product=ProductStub.getSeedProduct("SDK-SEED-PRODUCT-0-"+LocalDate.now());
Plan plan=product.getPlans().get(0);
Subscription subscriptionV2=
        zuoraClient.subscriptions().addPlan(subscriptionV1,
                plan, LocalDate.now(), LocalDate.now(), LocalDate.now());
```

# Update Subscription Plan Item

```java
Subscription updatedSubscription=
        zuoraClient.subscriptions().updateSubscriptionPlanItem(subscription,
                subscriptionPlanItem, LocalDate.now());
```

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
final String SUBSCRIPTION_ID = "subscription_id8";

Subscription subscription = zuoraClient.subscriptions().get(SUBSCRIPTION_ID);

SubscriptionPlanItem subscriptionPlanItem =
        subscription.getSubscriptionPlans().get(0).getSubscriptionPlanItems().get(0);
PerUnit perUnit = (PerUnit)subscriptionPlanItem.getChargeModel();
perUnit.setQuantity(60.0);
SubscriptionPlanItem subscriptionPlanItem =
        subscriptionPlanItem.toBuilder().chargeModel(perUnit).build();
Subscription subscription =
        zuoraClient.subscriptions()
                .updateSubscriptionPlanItem(subscription, subscriptionPlanItem, LocalDate.now());
```

# Transfer Owner

```java
Subscription subscription =
        zuoraClient.subscriptions().ownerTransfer(subscription, NEW_ACCOUNT_KEY, NEW_INVOICE_OWNER_KEY);
```

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
final String SUBSCRIPTION_ID = "subscription_id8";

Subscription subscription = zuoraClient.subscriptions().get(SUBSCRIPTION_ID);

final String NEW_ACCOUNT_KEY = "Account_X_Key";
final String NEW_INVOICE_OWNER_KEY = "Account_Y_Key";
Subscription subscription =
        zuoraClient.subscriptions().ownerTransfer(subscription, NEW_ACCOUNT_KEY, NEW_INVOICE_OWNER_KEY);
```

# Renew Subscription

```java
zuoraClient.subscriptions().renew(SUBSCRIPTION_ID);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the subscription. |

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
final String SUBSCRIPTION_ID = "subscription_id8";

zuoraClient.subscriptions().renew(SUBSCRIPTION_ID);
```

# Cancel Subscription

```java
Subscription subscription = zuoraClient.subscriptions().cancel(subscription);
```

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
final String SUBSCRIPTION_ID = "subscription_id8";

Subscription subscription = zuoraClient.subscriptions().get(SUBSCRIPTION_ID);

Subscription subscription = zuoraClient.subscriptions().cancel(subscription);
```


# Remove Subscription Plan

```java
Subscription subcription = zuoraClient.subscriptions().removeSubscriptionPlan(subscription, subscriptionPlan);
```

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
final String SUBSCRIPTION_ID = "subscription_id8";

Subscription subscription = zuoraClient.subscriptions().get(SUBSCRIPTION_ID);
SubscriptionPlan subscriptionPlan = subscription.getPlans().get(0);

subscription = zuoraClient.subscriptions().removeSubscriptionPlan(subscription, subscriptionPlan);
```
