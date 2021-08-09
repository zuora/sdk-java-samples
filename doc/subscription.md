# Subscription

A subscription is a product or service that has recurring charges, such as a monthly flat fee or charges based on usage. Subscriptions can also include one-time charges, such as activation fees. Every subscription must be associated with an account. 

The Subscription object contains the information needed to create and maintain a subscription associated with an Account object. 


## Class Name

`SubscriptionAPI`

## Methods

* [Create subscription](/doc/subscription.md#create-subscription)
* [Get subscription](/doc/subscription.md#get-subscription)
* [Update subscription](/doc/subscription.md#update-subscription)
* [Cancel subscription](/doc/subscription.md#cancel-subscription)

# Create Subscription

Creates a new subscription.

```java
Subscription subscription = SubscriptionAPI.create(createSubscriptionRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateSubscriptionRequest`](/doc/models/create-subscription-request.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

[`Subscription`](/doc/models/subscription.md)

## Example

```java
CreateSubscriptionRequest createRequest = new CreateSubscriptionRequest.Builder()
    .name("Subscription X")
    .build();
Subscription subscription = subscriptionAPI.create(createRequest);
```

# Get Subscription

```java
Subscription subscription = SubscriptionAPI.get(subscriptionId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the subscription. |


## Response Type

[`Subscription`](/doc/models/subscription.md)


## Example 

```java
String subscriptionId = "subscription_id8";

Subscription subscription = subscriptionAPI.get(subscriptionId);
```



# Update Subscription

```java
Subscription subscription = subscriptionAPI.update(updateRequest);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Subscription`](/doc/models/subscription.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |


## Response Type

[`Subscription`](/doc/models/subscription.md)


## Example 

```java
String subscriptionId = "subscription_id8";
Subscription subscription = subscriptionAPI.get(subscriptionId);

Subscription updateRequest = subscription.builder()
    .name("Subscription X")
    .build();
    
Subscription subscription = subscriptionAPI.update(updateRequest);
```

# Cancel Subscription

```java
Subscription subscription = subscriptionAPI.cancel(subscription);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Subscription`](/doc/models/subscription.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |


## Response Type

[`Subscription`](/doc/models/subscription.md)


## Example 

```java
String subscriptionId = "subscription_id8";
Subscription _subscription = subscriptionAPI.get(subscriptionId);

Subscription subscription = subscriptionAPI.cancel(_subscription);
```







