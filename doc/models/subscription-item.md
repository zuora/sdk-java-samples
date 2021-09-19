
# Subscription Item

A Subscription Item defines the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases - in other words, it represents the price - and is included in the response returned by [CreateSubscription](/doc/subscription-api.md#create-subscription), [UpdateSubscription](/doc/subscription-api.md#update-subscription) and [GetSubscription](/doc/subscription-api.md#get-subscription).

## Structure

`SubscriptionItem`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | `String getId()` |
| `name` | `String` | Required | The name of the item. | `String getName()` |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | `String getDescription()` |
| `plan` | `String` | Required | The identifier of the plan that this item belongs to. | `String getPlan()` |
| `accountingCode` | `String` | Optional | An accounting code that is active in your Zuora chart of accounts. | `String getAccountingCode()` |
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a price such as `interval`. | `Recurring getRecurring()` |
| `timing` | [`Enum`](/doc/models/timing.md) | Optional | You can choose to bill in advance or in arrears for recurring items. This field is not used with one-time or usage-based items. | `String getTiming()` |
| `formula` | `String` | Optional | . | `String getFormula()` |
| `type` | [`Enum`](/doc/models/type.md) | Optional | Describes how to compute the price per period. Either per_unit, one_time or based on usage. | `String getType()` |
| `maxQuantity` | `Integer` | Optional | Specifies the maximum number of units for this item. | `Integer getMaxQuantity()` |
| `minQuantity` | `Integer` | Optional | Specifies the minimum number of units for this item. | `Integer getMinQuantity()` |
| `ends` | [`Ends`](/doc/models/ends.md) | Optional | Defines how long to continue charging a customer after the item start date. | `Ends getEnds()` |
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. | `String getStartEvent()` |
| `unitOfMeasure` | `String` | Optional | A configured unit of measure. | `String getUnitOfMeasure()` |
| `taxCode` | `String` | Optional | The price tax code. | `String getTaxCode()` |
| `taxInclusive` | `Boolean` | Optional | If true, indicates that the amounts supplied are tax inclusive. | `String getTaxInclusive()` |
| `smoothing` | [`Smoothing`](/doc/models/smoothing.md) | Optional | . | `Smoothing getSmoothing()` |
| `baseInterval` | [`Enum`](/doc/models/base-interval.md) | Optional | . | `String getBaseInterval()` |
| `ratingGroup` | [`Enum`](/doc/models/rating-group.md) | Optional | . | `String getRatingGroup()` |
| `amounts` | [`List<Amount>`](/doc/models/amount.md) | Optional | The billing amount for this item. | `List<Amount> getAmounts()` |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
