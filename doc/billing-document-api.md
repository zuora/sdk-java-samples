# Billing Document API

Billing Documents represent invoices, credit memos and debit memos.

Invoices are statements of amounts owed by a customer, and are either generated one-off, or generated periodically from a subscription. They contain invoice items, and proration adjustments that may be caused by changes to a subscription.

If your invoice is configured to be charged automatically, Zuora automatically finalizes your invoice and attempts payment otherwise Zuora will email the invoice to your customer and await payment.

Any customer credit on the account may be applied before determining the amount due for the invoice (i.e., the amount that will be charged).


## Class Name

`BillingDocumentAPI`

## Methods

* [Create a billing document](/doc/billing-document-api.md#create-billing-document)
* [Get a billing document](/doc/billing-document-api.md#get-billing-document)
* [Update a billing document](/doc/billing-document-api.md#update-billing-document)
* [Stream billing documents](/doc/billing-document-api.md#stream-billing-documents)
* [Get billing documents by account](/doc/billing-document-api.md#get-billing-documents-by-account)
* [Post an invoice](/doc/billing-document-api.md#post-invoice)
* [Post a credit memo](/doc/billing-document-api.md#post-credit-memo)
* [Post a debit memo](/doc/billing-document-api.md#post-debit-memo)
* [Write off an invoice](/doc/billing-document-api.md#write-off-invoice)
* [Apply a credit memo](/doc/billing-document-api.md#apply-credit-memo)
* [Pay a billing document](/doc/billing-document-api.md#pay-billing-document)



# Create Billing Document

```java
BillingDocument billingDocument = zuoraClient.billingDocuments().create(params);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `params` | `BillingDocumentCreateRequest` | Required | A billing document create request. |


## Response Type

[`BillingDocument`](/doc/models/billing-document.md)


## Example 

```java
BillingDocument billingDocument = zuoraClient.billingDocuments().create(params);
```

# Get Billing Document

```java
BillingDocument billingDocument = zuoraClient.billingDocuments().get({id});
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the billing document. |


## Response Type

[`BillingDocument`](/doc/models/billing-document.md)


## Example 

```java
BillingDocument billingDocument = zuoraClient.billingDocuments().get({id});
```

# Update Billing Document

```java
BillingDocument billingDocument = zuoraClient.billingDocuments().update();
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |


## Response Type

[`BillingDocument`](/doc/models/billing-document.md)


## Example 

```java
BillingDocument billingDocument = zuoraClient.billingDocuments().get({id});
billingDocument.setDocumentDate({date})
billingDocument.update();
```

# Stream Billing Documents

```java
Stream<BillingDocument> billingDocuments = zuoraClient.billingDocuments().stream();
```

## Parameters

| Parameter | Type | Description |
|  --- | --- | --- |

## Response Type

Stream[`<BillingDocument>`](/doc/models/billing-document.md)

## Example

```java
Stream<BillingDocument> billingDocuments = zuoraClient.billingDocuments().stream();
```

# Get Billing Documents By Account

```java
BillingDocument billingDocument = zuoraClient.billingDocuments().findByAccount({accountId});
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `accountId` | `String` | Required | The unique identifier of an account. |


## Response Type

List[`<BillingDocument>`](/doc/models/billing-document.md)


## Example 

```java
List<BillingDocument> billingDocuments = zuoraClient.billingDocuments().findByAccount({accountId});
```

# Post Invoice

```java
BillingDocument invoice = zuoraClient.billingDocuments().post({invoiceId});
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the invoice billing document. |


## Response Type

[`BillingDocument`](/doc/models/billing-document.md)

## Example 

```java
BillingDocument invoice = zuoraClient.billingDocuments().post({invoiceId});
```


# Post Credit Memo

```java
BillingDocument creditMemo = zuoraClient.billingDocuments().post({creditMemoId});
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the credit memo billing document. |


## Response Type

[`BillingDocument`](/doc/models/billing-document.md)

## Example 

```java
BillingDocument creditMemo = zuoraClient.billingDocuments().post({creditMemoId});
```

# Post Debit Memo

```java
BillingDocument debitMemo = zuoraClient.billingDocuments().post({debitMemoId});
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the debit memo billing document. |


## Response Type

[`BillingDocument`](/doc/models/billing-document.md)

## Example 

```java
BillingDocument debitMemo = zuoraClient.billingDocuments().post({debitMemoId});
```

# Write Off Invoice

```java
String creditMemoId = zuoraClient.billingDocuments().writeOff({id}, {writeOffRequest});
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of an invoice billing document. |
| `writeOffRequest` | [`WriteOffRequest`](/doc/models/write-off-request.md) | Required | Invoice write off request. |


## Response Type

`String`

## Example 

```java
String creditMemoId = zuoraClient.billingDocuments().writeOff({id}, {writeOffRequest});
```


# Apply Credit Memo

```java
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |


## Response Type


## Example 

```java
```


# Pay Billing Document

```java
Payment payment = zuoraClient.billingDocuments().pay(key, paymentCreateRequest);
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

Payment payment = zuoraClient.billingDocuments().pay(number, paymentCreateRequest);
```
