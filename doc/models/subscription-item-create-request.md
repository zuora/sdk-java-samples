# Subscription Item Create Request

Describes a request to create a subscription plan item using [CreateSubscription](/doc/subscription-api.md#create-subscription).

## Structure

`SubscriptionItem`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `name` | `String` | Required | The name of the item. | `String getName()` |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | `String getDescription()` |
| `plan` | `String` | Required | The identifier of the plan that this item belongs to. | `String getPlan()` |
| `number` | `String` | Required | The number of the subscription plan this item belongs to. | `String getNumber()` |
| `startDate`| `LocalDate` | ReadOnly | the date when the subscription plan item becomes available and can be subscribed to. | `LocalDate startDate()` |
| `endDate`| `LocalDate` | ReadOnly | the date when the subscription plan item expires and can no longer be subscribed to. | `LocalDate endDate()` |
| `invoicedThroughDate`| `LocalDate` | ReadOnly | the date through which the customer has been billed for this item. | `LocalDate invoicedThroughDate()` |
| `processedThroughDate`| `LocalDate` | ReadOnly | the date up to which charges for this item have been processed. | `LocalDate processedThroughDate()` |
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a price such as `interval`. | `Recurring getRecurring()` |
| `maxQuantity` | `Integer` | Optional | Specifies the maximum number of units for this item. | `Integer getMaxQuantity()` |
| `minQuantity` | `Integer` | Optional | Specifies the minimum number of units for this item. | `Integer getMinQuantity()` |
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. | `String getStartEvent()` |
| `unitOfMeasure` | `String` | Optional | A configured unit of measure. | `String getUnitOfMeasure()` |
| `tiersMode` | [`Enum`](/doc/models/tiers-mode.md) |  | Specifies the kind of tiering. One of `GRADUATED`, `HIGHWATERMARK_GRADUATED`, `VOLUME`, or `HIGHWATERMARK_VOLUME`. | `String getTiersMode()` |
| `tiers` | [`List<Tier>`](/doc/models/tier.md) |  | tiers | `String getTiers()` |
| `taxInclusive` | `Boolean` | Optional | If true, indicates that the amounts supplied are tax inclusive. | `String getTaxInclusive()` |
| `quantity` | `Double` |  | Quantity of the subscription item to which the customer should be subscribed. | `Double getQuantity()` |
| `amount` | `Double` |  | The flat billing amount. | `Double getAmount()` |
| `unitAmount` | `Double` |  | The unit billing amount. | `Double getUnitAmount()` |
| `percentAmount` | `Double` |  | Percentage represented as a decimal. | `Double getPercentAmount()` |
| `priceBaseInterval` | [`Enum`](/doc/models/price-base-interval.md) |  | Specifies the base interval of a price. One of `WEEK`, `MONTH`, or `BILLING_PERIOD`. If not provided defaults to `BILLING_PERIOD`. | `String getPriceBaseInterval()`
| `applyDiscountTo` | [`EnumSet<Apply DiscountTo>`](/doc/models/apply-discount-to.md) |  | You can choose any combination of `ONE_TIME` `RECURRING` and `USAGE` for discount prices. | `String getApplyDiscountTo()` |
| `discountLevel` | [`Enum`](/doc/models/discount-level.md) |  | Specifies at what level the discount should be applied: one of `ACCOUNT`, `SUBSCRIPTION` or `PLAN`. | `String getDiscountLevel()` |
| `overage` | [`Overage`](/doc/models/overage.md) |  | Specifies how to handle usage overages. | `Overage getOverage()` |
| `customFields` | `Map<String, Object>` |  | Custom fields. | `Map<String, Object> getCustomFields()`|
