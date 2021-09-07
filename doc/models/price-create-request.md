
# Price Create Request

Describes a request to create a price using [CreatePrice](/doc/price-api.md#create-price).


## Fields

| Name | Type | Tags | Description | 
|  --- | --- | --- | --- | 
| `name` | `String` | Required | The name of the price. | 
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | 
| `plan` | `String` | Required | The identifier of the plan that this price will belong to. | 
| `accountingCode` | `String` | Optional | An accounting code that is active in your Zuora chart of accounts. | 
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a price such as `interval`. | 
| `timing` | [`Enum`](/doc/models/timing.md) | Optional | You can choose to bill in advance or in arrears for recurring prices. This field is not used with one-time or usage-based prices. | 
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. |
| `tiersMode` | [`Enum`](/doc/models/tiers-mode.md) | Optional | Specifies the kind of tiering. One of `GRADUATED`, `HIGHWATERMARK_GRADUATED`, `VOLUME`, or `HIGHWATERMARK_VOLUME`. |
| `tiers` | [`List<Tier>`](/doc/models/tier.md) | Optional | tiers | String getTiers() |
| `unitOfMeasure` | `String` | Optional | A configured unit of measure. | 
| `quantity` | `Double` | Optional | Quantity. | 
| `minQuantity` | `Double` | Optional | Minimum quantity. | 
| `maxQuantity` | `Double` | Optional | Maximum quantity. | 
| `taxCode` | `String` | Optional | The price tax code. | 
| `taxInclusive` | `Boolean` | Optional | If true, indicates that the amounts supplied are tax inclusive. | 
| `customFields` | `Map<String, Object>` | Optional | Custom fields. |

## Methods

### priceBuilder()

Create a new price builder which provides fields available for prices.
