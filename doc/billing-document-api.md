# Billing Document API

Billing Documents represent invoices, credit memos and debit memos.

Invoices are statements of amounts owed by a customer, and are either generated one-off, or generated periodically from a subscription. They contain invoice items, and proration adjustments that may be caused by changes to a subscription.

If your invoice is configured to be charged automatically, Zuora automatically finalizes your invoice and attempts payment otherwise Zuora will email the invoice to your customer and await payment.

Any customer credit on the account may be applied before determining the amount due for the invoice (i.e., the amount that will be charged).


## Class Name

`BillingDocumentAPI`

## Methods

* [Get a billing document](/doc/billing-document-api.md#get-billing-document)
* [Pay a billing document](/doc/billing-document-api.md#pay-billing-document)



# Get Billing Document

```java
BillingDocument billingDocument = BillingDocumentAPI.get(BILLING_DOCUMENT_ID);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the billing document. |


## Response Type

[`BillingDocument`](/doc/models/billing-document.md)


## Example 

```java
String BILLING_DOCUMENT_ID = "billing_document_id8";

BillingDocument billingDocument = billingDocumentAPI.get(BILLING_DOCUMENT_ID);
```

# Pay Billing Document

```java
Payment payment = BillingDocumentAPI.pay(key, paymentCreateRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `key` | `String` | Required | The document number of a billing document. |
| `paymentCreateRequest` | [`PaymentCreateRequest`](/doc/models/payment-create-request.md) | Required | Payment for invoice or debit memo. |


## Response Type

[`Payment`](/doc/models/payment.md)


## Example 

```java
PaymentCreateRequest paymentCreateRequest = PaymentCreateRequest.builder()
        .amount(10.0d)
        .account("account_id8")
        .authorisationCode("7368")
        .currency("USD")
        .external(true)
        .build();

Payment payment = billingDocumentAPI.pay(number, paymentCreateRequest);
```
