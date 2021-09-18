
# Billing Document

A Billing Document can represent an invoice, a credit memo or a debit memo and is the response returned by [GetBillingDocument](/doc/billing-document-api.md#get-billing-document).

## Structure

`BillingDocument`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `createdBy` | `String` | ReadOnly | Unique identifier of the user who created the billing document. | String getCreatedBy() |
| `createTime` | `LocalDateTime` | ReadOnly | Time at which the object was created. | LocalDateTime getCreateTime() |
| `postedBy` | `String` | ReadOnly | Unique identifier of the user who posted the billing document. | String getPostedBy() |
| `postedTime` | `LocalDateTime` | ReadOnly | Time at which the object was posted. | LocalDateTime getPostedTime() |
| `state` | [`Enum`](/doc/models/billing-document-state.md) | ReadOnly | State of this billing document, one of `DRAFT`, `POSTED` or `CANCELED`. | String getState() |
| `type` | [`Enum`](/doc/models/billing-document-type.md) | ReadOnly | The type of billing document. One of `CREDIT_MEMO`, `DEBIT_MEMO` or `INVOICE`.  | String getType() |
| `autoPay` | `Boolean` | ReadOnly | Has the value `true` if payment will be collected automatically in the corresponding payment run or the value `false` if the payment will not automatically be collected. | Boolean getAutoPay() |
| `documentDate` | `LocalDate` | ReadOnly | The date when the  billing document takes effect. | LocalDate getDocumentDate() |
| `dueDate` | `LocalDate` | ReadOnly | The date by which the payment for this invoice is due. | LocalDate getDueDate() |
| `currency` | `String` | Required | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | `String getCurrency()`|
| `amount` | `Long` | ReadOnly | The total amount of the billing document. | Long getAmount() |
| `subtotal` | `Long` | ReadOnly | The total amount of the billing document exclusive of tax. | Long getSubtotal() |
| `tax` | `Long` | ReadOnly | The amount of tax on this billing document. This is the sum of all the tax amounts on this billing document. | Long getTax() |
| `balance` | `Long` | ReadOnly | The remaining balance of the billing document after all payments, adjustments, and refunds are applied. | Long getBalance() |
| `description` | `String` | ReadOnly | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `key` | `String` | ReadOnly | The number of the billing document. | String getKey() |
| `updatedBy` | `String` | ReadOnly | Unique identifier of the user who last updated the billing document. | String getUpdatedBy() |
| `updateTime` | `LocalDateTime` | ReadOnly | Time at which the object was last updated. | LocalDateTime getUpdateTime() |
| `account` | `Account` | ReadOnly | The customer account that this billing document belongs to. | String getAccount() |
| `items` | [`List<BillingDocumentItem>`](/doc/models/billing-document-item.md) | ReadOnly | The billing document items that make up the billing document. | `List<BillingDocumentItem>` getItems() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
