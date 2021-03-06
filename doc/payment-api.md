# Payment API

A payment is the money that customers send to pay for billing documents related to their subscriptions.

The Payment object holds all of the information about an individual payment, including the payment amount, to which billing documents the payment was applied to, and so on.

## Class Name

```java
PaymentAPI
```

## Methods

* [Create payment](/doc/payment-api.md#create-payment)
* [Get payment](/doc/payment-api.md#get-payment)
* [Update payment](/doc/payment-api.md#update-payment)

# Create Payment

Creates a new payment.

```java
Payment payment = zuoraClient.payments().create(params);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `params` | [`PaymentCreateRequest`](/doc/models/payment-create-request.md) | Required | Payment create request. |

## Response Type

[`Payment`](/doc/models/payment.md)

## Example

```java
PaymentCreateRequest params = PaymentCreateRequest.builder()
        .amount(10.0d)
        .account("account_id8")
        .authorisationCode("7368")
        .currency("USD")
        .external(true)
        .build();

Payment payment = zuoraClient.payments().create(params);
```

# Get Payment

Retrieves a payment by ID.

```java
Payment payment = zuoraClient.payments().get(id);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a payment. |

## Response Type

[Payment](doc/model/payment.md)

## Example

```java
Payment payment = zuoraClient.payments().get(id);
```

# Update Payment

```java
Payment payment = payment.update();
```

[comment]: <> (## Parameters)

[comment]: <> (| Parameter | Type | Tags | Description |)

[comment]: <> (|  --- | --- | --- | --- |)

[comment]: <> (| `payment` | `Payment` | Required | The hydrated `Payment` object you wish to update. |)


## Example 

```java
String Payment_ID = "payment_id8";
Payment payment = zuoraClient.payments().get(PAYMENT_ID);

payment.setName("New Name");
payment.update();
```

