
# Create Plan Item Request

Describes a request to create a plan item using [CreatePlanItem](/doc/plan-item-api.md#create-plan-item).

## Structure

`CreatePlanItemRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `name` | `String` | Required | The name of the plan item. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `plan` | `String` | Required | The identifier of the plan that this plan item will belong to. | String getPlan() |
| `accountingCode` | `String` | Optional | An accounting code that is active in your Zuora chart of accounts. | String getAccountingCode() |
| `chargeModel` | [`ChargeModelInterface`](/doc/models/charge-model-interface.md) | Required | The charge model for the plan item. | ChargeModelInterface getChargeModel() |
| `recurring` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a plan item such as `interval`. | Recurring getRecurring() |
| `timing` | [`Enum`](/doc/models/timing.md) | Optional | You can choose to bill in advance or in arrears for recurring plan items. This field is not used with one-time or usage-based plan items. | String getTiming() |
| `type` | [`Enum`](/doc/models/type.md) | Optional | Describes how to compute the price per period. Either per_unit, one_time or based on usage. | String getType() |
| `ends` | [`Ends`](/doc/models/ends.md) | Optional | Defines when the charge ends after the plan item start date. | Ends getEnds() |
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. | String getStartEvent() |
| `unitOfMeasure` | `String` | Optional | A configured unit of measure. | String getUnitOfMeasure() |
| `taxCode` | `String` | Optional | The plan item tax code. | String getTaxCode() |
| `taxInclusive` | `Boolean` | Optional | If true, indicates that the amounts supplied are tax inclusive. | String getTaxInclusive() |

## Methods

### recurringBuilder()

Create a new Recurring Plan Item builder which provides fields available only for recurring plan items.

### oneTimeBuilder()

Create a new One-Time Plan Item builder which provides fields available only for one-time plan items.

### usageBuilder()

Create a new Usage Plan Item builder which provides fields available only for usage plan items.



