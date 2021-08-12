# PlanItem

A PlanItem defines the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases and is the response returned by [CreatePlanItem](/doc/plan-item.md#create-plan-item), [UpdatePlanItem](/doc/plan-item.md#update-plan-item) and [GetPlanItem](/doc/plan-item.md#get-plan-item).

## Structure

`PlanItem`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` | Required | The name of the plan item. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `plan` | `String` | Required | The identifier of the plan that this plan item will belong to. | String getPlan() |
| `accountingCode` | `String` | Optional | An accounting code that is active in your Zuora chart of accounts. | String getAccountingCode() |
| `chargeModel` | [`ChargeModelInterface`](/doc/models/charge-model-interface.md) | Required | The charge model for the plan item. | ChargeModelInterface getChargeModel() |
| `on` | [`Recurring`](/doc/models/recurring.md) | Optional | The recurring components of a plan item such as `interval`. | Recurring getRecurring() |
| `timing` | [`Enum`](/doc/models/timing.md) | Optional | You can choose to bill in advance or in arrears for recurring plan items. This field is not used with one-time or usage-based plan items. | String getTiming() |
| `type` | [`Enum`](/doc/models/type.md) | Optional | Describes how to compute the price per period. Either per_unit, one_time or based on usage. | String getType() |
| `ends` | [`Ends`](/doc/models/ends.md) | Optional | Defines when the charge ends after the plan item start date. | Ends getEnds() |
| `startEvent` | [`Enum`](/doc/models/start-event.md) | Optional | Specifies when to start billing the customer. | String getStartEvent() |
| `taxCode` | `String` | Optional | The plan item tax code. | String getTaxCode() |
| `taxInclusive` | `Boolean` | Optional | If true, indicates that the amounts supplied are tax inclusive. | String getTaxInclusive() |
| `createdBy`| `String` | ReadOnly | Identifier of the user who created the plan item. |  String getCreatedBy() |
| `createTime`| `ZonedDateTime` | ReadOnly | The date and time when the plan item was created. | ZonedDateTime getCreateTime() |
| `updatedBy`| `String` | ReadOnly | Identifier of the user who last updated the plan item. | String getUpdatedBy() |
| `updateTime`| `ZonedDateTime` | ReadOnly | The date and time when the plan item was last updated. | ZonedDateTime getUpdateTime() |

## Example (as JSON)

```json
{
  "accountingCode": "Professional Services Revenue",
  "startEvent": "CONTRACT_EFFECTIVE",
  "chargeModel": {
    "type": "FLAT_FEE",
    "amounts": {
      "USD": 50.0,
      "EUR": 0.0
    },
    "priceBaseInterval": "PER_BILLING_PERIOD"
  },
  "name": "Recurring",
  "planItemType": "RECURRING",
  "alignment": "SUBSCRIPTION_PLAN_ITEM",
  "interval": "MONTH",
  "timing": "IN_ADVANCE",
  "intervalCount": 1,
  "on": "ACCOUNT_CYCLE_DATE",
  "description": "",
  "taxCode": "",
  "taxInclusive": false,
  "createdBy": "2c92c0f971c65e010171c79a08423ccc",
  "createTime": "2021-07-10T13:23:49.154Z",
  "updateTime": "2021-07-12T15:33:52.183Z",
  "updatedBy": "2c92c0f971c65e010171c79a08423ccc",
  "customFields": {},
  "id": "8ad08c0f7b3a561f017b3aff69606a4a",
  "plan": "8ad084a67b3a5621017b3afe9d77032a"
}
```