
# Price Create Request

Describes a request to create a price using [CreatePrice](/doc/price-api.md#create-price).


## Fields

| Name | Type | Tags | Description | 
|  --- | --- | --- | --- | 
| `name` | `String` | Required | The name of the price. | 
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | 
| `plan` | `String` | Required | The identifier of the plan that this price will belong to. | 
| `recognizedRevenueAccountingCode` | `String` | Optional | An accounting code that is active in your Zuora chart of accounts. | 
| `deferredRevenueAccountingCode` | `String` | Optional | An accounting code that is active in your Zuora chart of accounts. | 
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a price such as `interval`. | 
| `timing` | [`Enum`](/doc/models/timing.md) | Optional | You can choose to bill `IN_ADVANCE` or `IN _ARREARS` for recurring prices. This field is not used with one-time or usage-based prices. | 
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. |
| `tiersMode` | [`Enum`](/doc/models/tiers-mode.md) | Optional | Specifies the kind of tiering. One of `GRADUATED`, `HIGHWATERMARK_GRADUATED`, `VOLUME`, or `HIGHWATERMARK_VOLUME`. |
| `tiers` | [`List<Tier>`](/doc/models/tier.md) | Optional | tiers | String getTiers() |
| `unitOfMeasure` | `String` | Optional | A configured unit of measure. | 
| `quantity` | `Double` | Optional | Quantity. | 
| `minQuantity` | `Double` | Optional | Minimum quantity. | 
| `maxQuantity` | `Double` | Optional | Maximum quantity. | 
| `taxCode` | `String` | Optional | A tax code identifier. | 
| `taxInclusive` | `Boolean` | Optional | If true, indicates that the amounts supplied are tax inclusive. | 
| `amounts` | `Map<Currency, Double>` | Optional | Flat billing amounts. | Map<Currency, Double> getAmounts() |
| `unitAmounts` | `Map<Currency, Double>` | Optional | Unit billing amounts. | Map<Currency, Double> getAmounts() |
| `percentAmount` | `Double` | Optional | Percent amount. | Double getPercentAmount() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. |

## Methods

### priceBuilder()

Create a new price builder which provides fields available for prices.
