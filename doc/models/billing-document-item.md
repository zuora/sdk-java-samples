
# Billing Document Item

A Billing Document Item can represent an invoice item, a credit memo item or a debit memo item. These are included in the response returned by [GetBillingDocument](/doc/billing-document-api.md#get-billing-document).

## Structure

`BillingDocumentItem`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `createTime` | `LocalDateTime` | ReadOnly | Time at which the object was created. | LocalDateTime getCreateTime() |
| `owner` | `String` | ReadOnly | . | String getOwner() |
| `discountAppliedTo` | `String` | ReadOnly | . | String getDiscountAppliedTo() |
| `quantity` | `Double` | ReadOnly | . | Double getQuantity() |
| `serviceStartDate` | `LocalDate` | ReadOnly | . | LocalDate getServiceStartTime() |
| `serviceEndDate` | `LocalDate` | ReadOnly | . | LocalDate getServiceEndTime() |
| `amount` | `Double` | ReadOnly | . | Double getAmount() |
| `unitAmount` | `Double` | ReadOnly | . | Double getUnitAmount() |
| `tax` | `Double` | ReadOnly | . | Double getTax() |
| `taxInclusive` | `Boolean` | ReadOnly | . | Boolean getTaxInclusive() |
| `balance` | `Double` | ReadOnly | . | Double getBalance() |
| `unitOfMeasure` | `String` | ReadOnly | . | String getUnitOfMeasure() |
| `accountsReceivableAccountingCode` | `String` | ReadOnly | . | String getAccountsReceivableAccountingCode() |
| `recognizedRevenueAccountingCode` | `String` | ReadOnly | . | String getRecognizedRevenueAccountingCode() |
| `deferredRevenueAccountingCode` | `String` | ReadOnly | . | String getDeferredRevenueAccountingCode() |
| `updateTime` | `LocalDateTime` | ReadOnly | Time at which the object was last updated. | LocalDateTime getUpdateTime() |
| `subscription` | `String` | ReadOnly | . | String getSubscription() |
| `subscriptionPlan` | `String` | ReadOnly | . | String getSubscriptionPlan() |
| `subscriptionPlanItem` | `String` | ReadOnly | . | String getSubscriptionPlanItem() |
| `product` | `String` | ReadOnly | . | String getProduct() |
| `plan` | `String` | ReadOnly | . | String getPlan() |
| `planItem` | `String` | ReadOnly | . | String getPlan() |

## Example (as JSON)

```json
{
    "id": "PLAN-000001",
    "name": "Plan Y",
    "createTime": "2021-07-10T13:23:49.154Z",
    "updateTime": "2021-07-12T15:23:49.154Z",
    "product" : "P-000001",
}
```
