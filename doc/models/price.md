# Price

A Price defines the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases and is the response returned by [CreatePrice](/doc/price-api.md#create-price), [UpdatePrice](/doc/price-api.md#update-price) and [GetPrice](/doc/price-api.md#get-price).

## Class Name

`Price`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` | Required | The name of the price. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `plan` | `String` | Required | The identifier of the plan that this price will belong to. | String getPlan() |
| `recognizedRevenue AccountingCode` | `String` | Optional | An active accounting code from your chart of accounts. | String getRecognizedRevenue AccountingCode() |
| `deferredRevenue AccountingCode` | `String` | Optional | An active accounting code from your chart of accounts. | String getDeferredRevenue AccountingCode() |
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a price such as `interval`. | Recurring getRecurring() |
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. | String getStartEvent() |
| `tiersMode` | [`Enum`](/doc/models/tiers-mode.md) | Optional | Specifies the kind of tiering. One of `GRADUATED`, `HIGHWATERMARK_GRADUATED`, `VOLUME`, or `HIGHWATERMARK_VOLUME`. |
| `tiers` | [`List<Tier>`](/doc/models/tier.md) | Optional | tiers | String getTiers() |
| `taxCode` | `String` | Optional | A tax code identifier. | String getTaxCode() |
| `taxInclusive` | `Boolean` | Optional | If `true`, indicates that the amounts supplied are tax inclusive. | String getTaxInclusive() |
| `unitOfMeasure` | `String` | Optional | A configured unit of measure. | String getUnitOfMeasure() |
| `quantity` | `Double` | Optional | Quantity. |  Double getQuantity() |
| `minQuantity` | `Double` | Optional | Minimum quantity. |  Double getMinQuantity() |
| `maxQuantity` | `Double` | Optional | Maximum quantity. | Double getMaxQuantity() |
| `createdBy`| `String` | ReadOnly | Identifier of the user who created the price. |  String getCreatedBy() |
| `createTime`| `ZonedDateTime` | ReadOnly | The time when the price was created. | ZonedDateTime getCreateTime() |
| `updatedBy`| `String` | ReadOnly | Identifier of the user who last updated the price. | String getUpdatedBy() |
| `updateTime`| `ZonedDateTime` | ReadOnly | The time when the price was last updated. | ZonedDateTime getUpdateTime() |
| `amounts` | `Map<Currency, Double>` | Optional | Flat billing amounts. | Map<Currency, Double> getAmounts() |
| `unitAmounts` | `Map<Currency, Double>` | Optional | Unit billing amounts. | Map<Currency, Double> getAmounts() |
| `percentAmount` | `Double` | Optional | Percentage represented as a decimal. | Double getPercentAmount() |
| `priceBaseInterval` | [`Enum`](/doc/models/price-base-interval.md) | Optional | Specifies the base interval of a price. One of `WEEK`, `MONTH`, or `BILLING_PERIOD`. If not provided defaults to `BILLING_PERIOD`. |
| `applyDiscountTo` | [`EnumSet<Apply DiscountTo>`](/doc/models/apply-discount-to.md) | Optional | You can choose any combination of `ONE_TIME` `RECURRING` and `USAGE` for discount prices. | String getApplyDiscountTo() |
| `discountLevel` | [`Enum`](/doc/models/discount-level.md) | Optional | Specifies at what level the discount should be applied: one of `ACCOUNT`, `SUBSCRIPTION` or `PLAN`. | String getDiscountLevel() |
| `overage` | [`Overage`](/doc/models/overage.md) | Optional | Specifies how to handle usage overages. | Overage getOverage() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
| `chargeModel` | [`Enum`](/doc/models/charge-model.md) | ReadOnly | Price model. | String getChargeModel() |
| `chargeType` | [`Enum`](/doc/models/charge-type.md) | ReadOnly | Price model. | String getChargeType() |