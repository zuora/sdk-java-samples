
# Subscription Plan Item

A Subscription Plan Item defines the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases and is included in the response returned by [CreateSubscription](/doc/subscription.md#create-subscription), [UpdateSubscription](/doc/subscription.md#update-subscription) and [GetSubscription](/doc/subscription.md#get-subscription).

## Structure

`SubscriptionPlanItem`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` | Required | The name of the plan item. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `plan` | `String` | Required | The identifier of the plan that this plan item will belong to. | String getPlan() |
| `accountingCode` | `String` | Optional | An accounting code that is active in your Zuora chart of accounts. | String getAccountingCode() |
| `chargeModel` | [`ChargeModelInterface`](/doc/models/charge-model-interface.md) | Required | The charge model for the plan item. | ChargeModelInterface getChargeModel() |
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a plan item such as `interval`. | Recurring getRecurring() |
| `timing` | [`Enum`](/doc/models/timing.md) | Optional | You can choose to bill in advance or in arrears for recurring plan items. This field is not used with one-time or usage-based plan items. | String getTiming() |
| `formula` | `String` | Optional | . | String getFormula() |
| `type` | [`Enum`](/doc/models/type.md) | Optional | Describes how to compute the price per period. Either per_unit, one_time or based on usage. | String getType() |
| `maxQuantity` | `Integer` | Optional | Specifies the maximum number of units for this plan item. | Integer getMaxQuantity() |
| `minQuantity` | `Integer` | Optional | Specifies the minimum number of units for this plan item. | Integer getMinQuantity() |
| `ends` | [`Ends`](/doc/models/ends.md) | Optional | Defines when the charge ends after the plan item start date. | Ends getEnds() |
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. | String getStartEvent() |
| `unitOfMeasure` | `String` | Optional | A configured unit of measure. | String getUnitOfMeasure() |
| `taxCode` | `String` | Optional | The plan item tax code. | String getTaxCode() |
| `taxInclusive` | `Boolean` | Optional | If true, indicates that the amounts supplied are tax inclusive. | String getTaxInclusive() |
| `smoothing` | [`Smoothing`](/doc/models/smoothing.md) | Optional | . | Smoothing getSmoothing() |
| `baseInterval` | [`Enum`](/doc/models/base-interval.md) | Optional | . | String getBaseInterval() |
| `ratingGroup` | [`Enum`](/doc/models/rating-group.md) | Optional | . | String getRatingGroup() |
| `amounts` | [`List<Amount>`](/doc/models/amount.md) | Optional | The billing amount for this plan item. | `List<Amount>` getAmounts() |

## Example (as JSON)

```json
{
    "id": "PLAN-ITEM-000001",
    "name": "Plan Item Z",
    "plan" : "PLAN-000001"
}
```
