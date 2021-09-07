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
| `accountingCode` | `String` | Optional | An active accounting code from your chart of accounts. | String getAccountingCode() |
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a price such as `interval`. | Recurring getRecurring() |
| `timing` | [`Enum`](/doc/models/timing.md) | Optional | You can choose to bill in advance or in arrears for recurring prices. This field is not used with one-time or usage-based prices. | String getTiming() |
| `type` | [`Enum`](/doc/models/type.md) | Optional | Describes how to compute the price per period. Either per unit, one time or based on usage. | String getType() |
| `ends` | [`Ends`](/doc/models/ends.md) | Optional | Defines when to stop charging after the price start date. | Ends getEnds() |
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. | String getStartEvent() |
| `taxCode` | `String` | Optional | The price tax code. | String getTaxCode() |
| `taxInclusive` | `Boolean` | Optional | If `true`, indicates that the amounts supplied are tax inclusive. | String getTaxInclusive() |
| `createdBy`| `String` | ReadOnly | Identifier of the user who created the price. |  String getCreatedBy() |
| `createTime`| `ZonedDateTime` | ReadOnly | The time when the price was created. | ZonedDateTime getCreateTime() |
| `updatedBy`| `String` | ReadOnly | Identifier of the user who last updated the price. | String getUpdatedBy() |
| `updateTime`| `ZonedDateTime` | ReadOnly | The time when the price was last updated. | ZonedDateTime getUpdateTime() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
