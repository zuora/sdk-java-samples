
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
| `state` | [`Enum`](/doc/models/billing-document-state.md) | ReadOnly | . | String getState() |
| `type` | [`Enum`](/doc/models/billing-document-type.md) | ReadOnly | . | String getType() |
| `autoPay` | `Boolean` | ReadOnly | . | Boolean getAutoPay() |
| `documentDate` | `LocalDate` | ReadOnly | . | LocalDate getDocumentDate() |
| `dueDate` | `LocalDate` | ReadOnly | . | LocalDate getDueDate() |
| `currency` | `String` | Required | A currency defined in the web-based UI administrative settings. | `String getCurrency()`|
| `amount` | `Long` | ReadOnly | . | Long getAmount() |
| `subtotal` | `Long` | ReadOnly | . | Long getSubtotal() |
| `tax` | `Long` | ReadOnly | . | Long getTax() |
| `balance` | `Long` | ReadOnly | . | Long getBalance() |
| `documentNumber` | `String` | ReadOnly | . | String getDocumentNumber() |
| `description` | `String` | ReadOnly | . | String getDescription() |
| `key` | `String` | ReadOnly | . | String getKey() |
| `updatedBy` | `String` | ReadOnly | Unique identifier of the user who last updated the billing document. | String getUpdatedBy() |
| `updateTime` | `LocalDateTime` | ReadOnly | Time at which the object was last updated. | LocalDateTime getUpdateTime() |
| `account` | `Account` | ReadOnly | The customer account that this billing document belongs to. | String getAccount() |
| `items` | [`List<BillingDocumentItem>`](/doc/models/billing-document-item.md) | ReadOnly | The billing document items that make up the billing document. | `List<BillingDocumentItem>` getItems() |
