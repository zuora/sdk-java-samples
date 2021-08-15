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
* [Refund payment](/doc/payment-api.md#refund-payment)

# Create Payment

Creates a new payment.

```java
Payment payment = paymentAPI.create(paymentCreateRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PaymentCreateRequest`](/doc/models/create-payment-request.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

[`Payment`](/doc/models/payment.md)

## Example

```java
String accountId = "account_id9";
String authCode = "justdoit";
PaymentCreateRequest paymentCreateRequest = PaymentCreateRequest.builder()
        .amount(10.0d)
        .account(accountId)
        .authorisationCode(authCode)
        .currency("USD")
        .external(true).build();

Payment createdPayment = zuoraClient.payments().create(paymentCreateRequest);
```

# Get Payment

Retrieves a payment by ID.

```java
Payment payment = paymentAPI.get(paymentId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `paymentId` | `String` | Required | The unique identifier for the payment. |

## Response Type

[Payment](doc/model/payment.md)

## Example

```java
Payment payment = paymentAPI.get(paymentId);
```

# Refund Payment

Refunds a payment.

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `paymentId` | `String` | Required | The unique identifier for the payment to be refunded. |
| `paymentRefundRequest` | [`PaymentRefundRequest`](/doc/models/payment-refund-request.md) | Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

`String`

## Example

```java
PaymentRefundRequest paymentRefundRequest = PaymentRefundRequest.builder()
        .amount(5.0d)
        .external(true).build();

String refundPaymentTypeId = paymentAPI.refund(paymentId, paymentRefundRequest);
```

