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
| `recognizedRevenue AccountingCode` | `String` | Optional | An active accounting code from your chart of accounts. | String getAccountingCode() |
| `deferredRevenue AccountingCode` | `String` | Optional | An active accounting code from your chart of accounts. | String getAccountingCode() |
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a price such as `interval`. | Recurring getRecurring() |
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. | String getStartEvent() |
| `tiersMode` | [`Enum`](/doc/models/tiers-mode.md) | Optional | Specifies the kind of tiering. One of `GRADUATED`, `HIGHWATERMARK_GRADUATED`, `VOLUME`, or `HIGHWATERMARK_VOLUME`. |
| `tiers` | [`List<Tier>`](/doc/models/tier.md) | Optional | tiers | String getTiers() |
| `taxCode` | `String` | Optional | The price tax code. | String getTaxCode() |
| `taxInclusive` | `Boolean` | Optional | If `true`, indicates that the amounts supplied are tax inclusive. | String getTaxInclusive() |
| `unitOfMeasure` | `String` | Optional | A configured unit of measure. | 
| `quantity` | `Double` | Optional | Quantity. | 
| `minQuantity` | `Double` | Optional | Minimum quantity. | 
| `maxQuantity` | `Double` | Optional | Maximum quantity. | 
| `createdBy`| `String` | ReadOnly | Identifier of the user who created the price. |  String getCreatedBy() |
| `createTime`| `ZonedDateTime` | ReadOnly | The time when the price was created. | ZonedDateTime getCreateTime() |
| `updatedBy`| `String` | ReadOnly | Identifier of the user who last updated the price. | String getUpdatedBy() |
| `updateTime`| `ZonedDateTime` | ReadOnly | The time when the price was last updated. | ZonedDateTime getUpdateTime() |
| `amounts` | [`List<Money>`](/doc/models/money.md) | Optional | Flat billing amounts. | Money getAmounts() |
| `unitAmounts` | [`List<Money>`](/doc/models/money.md) | Optional | Unit billing amounts. | Money getAmounts() |
| `percentAmount` | `Integer` | Optional | Percent amount. | Integer getPercentAmount() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
