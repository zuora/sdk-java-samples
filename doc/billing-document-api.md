# Billing Document API

Billing Documents represent invoices, credit memos and debit memos.

Invoices are statements of amounts owed by a customer, and are either generated one-off, or generated periodically from a subscription. They contain invoice items, and proration adjustments that may be caused by changes to a subscription.

If your invoice is configured to be charged automatically, Zuora automatically finalizes your invoice and attempts payment otherwise Zuora will email the invoice to your customer and await payment.

Any customer credit on the account may be applied before determining the amount due for the invoice (i.e., the amount that will be charged).


## Class Name

`BillingDocumentAPI`

## Methods

* [Get a billing document](/doc/billing-document-api.md#get-billing-document)


# Create Billing Document

```java
BillingDocument billingDocument = BillingDocumentAPI.get(creditMemoCreateRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `creditMemoCreateRequest` | [`CreditMemoCreateRequest`](/doc/models/credit-memo-create-request.md) | Required | Billing document request object. |


## Response Type

[`BillingDocument`](/doc/models/billing-document.md)


## Example 

```java
BillingDocument billingDocument = billingDocumentAPI.create(createMemoCreateRequest);
```


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





