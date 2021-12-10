
# Billing Document Item

A Billing Document Item can represent an invoice item, a credit memo item or a debit memo item. These are included in the response returned by [GetBillingDocument](/doc/billing-document-api.md#get-billing-document).

## Structure

`BillingDocumentItem`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | `String getId()` |
| `createTime` | `LocalDateTime` | ReadOnly | Time at which the object was created. | `LocalDateTime getCreateTime()` |
| `quantity` | `Double` | ReadOnly | The number of units for the billing document item. | `Double getQuantity()` |
| `serviceStartTime` | `LocalDateTime` | ReadOnly | The service start time of the billing document item. If not specified, the  start time of the corresponding plan. | `LocalDate getServiceStartTime()` |
| `serviceEndTime` | `LocalDateTime` | ReadOnly | The service end time of the billing document item. If not specified, the end time of the corresponding plan. | `LocalDate getServiceEndTime()` |
| `amount` | `Double` | ReadOnly | The total amount of the billing document item. | `Double getAmount()` |
| `unitAmount` | `Double` | ReadOnly | The unit amount of the billing document item. | `Double getUnitAmount()` |
| `tax` | `Double` | ReadOnly | The tax amount of the billing document item. | `Double getTax()` |
| `taxInclusive` | `Boolean` | ReadOnly | Has the value `true` if the billing document item amounts are inclusive of tax or the value `false` if the billing document item amounts are not inclusive of tax. | `Boolean getTaxInclusive()` |
| `balance` | `Double` | ReadOnly | The balance of the billing document item. | `Double getBalance()` |
| `unitOfMeasure` | `String` | ReadOnly | . | `String getUnitOfMeasure()` |
| `accounts ReceivableAccountingCode` | `String` | ReadOnly | The accounting code for the accounts receivable. | `String getAccountsReceivable AccountingCode()` |
| `recognized RevenueAccountingCode` | `String` | ReadOnly | The accounting code for recognized revenue, such as monthly recurring charges or overage charges. | `String getRecognizedRevenue AccountingCode()` |
| `deferred RevenueAccountingCode` | `String` | ReadOnly | The accounting code for the deferred revenue, such as monthly recurring liability. | `String getDeferredRevenue AccountingCode()` |
| `updateTime` | `LocalDateTime` | ReadOnly | Time at which the object was last updated. | `LocalDateTime getUpdateTime()` |
| `subscription` | `String` | ReadOnly | Unique identifier of the subscription associated with the billing document item. | `String getSubscription()` |
| `subscriptionPlan` | `String` | ReadOnly | Unique identifier of the subscription plan associated with the billing document item. | `String getSubscriptionPlan()` |
| `subscriptionPlanItem` | `String` | ReadOnly | Unique identifier of the subscription plan item associated with the billing document item. | `String getSubscriptionPlanItem()` |
| `product` | `String` | ReadOnly | Unique identifier of the product associated with the billing document item. | `String getProduct()` |
| `plan` | `String` | ReadOnly | Unique identifier of the plan associated with the billing document item. | `String getPlan()` |
| `planItem` | `String` | ReadOnly | Unique identifier of the plan item associated with the billing document item. | `String getPlanItem()` |
