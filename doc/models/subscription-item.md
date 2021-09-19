
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
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a price such as `interval`. | `Recurring getRecurring()` |
| `maxQuantity` | `Integer` | Optional | Specifies the maximum number of units for this item. | `Integer getMaxQuantity()` |
| `minQuantity` | `Integer` | Optional | Specifies the minimum number of units for this item. | `Integer getMinQuantity()` |
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. | `String getStartEvent()` |
| `unitOfMeasure` | `String` | Optional | A configured unit of measure. | `String getUnitOfMeasure()` |
| `taxInclusive` | `Boolean` | Optional | If true, indicates that the amounts supplied are tax inclusive. | `String getTaxInclusive()` |
| `amounts` | `Map<Currency, Double>` | Optional | The billing amounts for this item. | `Map<Currency, Double> getAmounts()` |
| `unitAmounts` | `Map<Currency, Double>` | Optional | The unit billing amounts for this item. | `Map<Currency, Double> getUnitAmounts()` |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
