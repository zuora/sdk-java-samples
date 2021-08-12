
# Plan

A Plan is a container for a collection of [PlanItems](/doc.models/plan-item.md) and is the response returned by [CreatePlan](/doc/plan.md#create-plan), [UpdatePlan](/doc/plan.md#update-plan) and [GetPlan](/doc/plan.md#get-plan).

## Structure

`Plan`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` | Required | The name of the product. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `active` | `Boolean` | Optional | A boolean to indicate if the current date is within the start and end date. | Boolean isActive() |
| `startDate` | `LocalDate` | Optional | Date on which the plan becomes active. | String getStartDate() |
| `endDate` | `LocalDate` | Optional | Date on which the plan is no longer active. | String getEndDate() |
| `activeCurrencies` | `String` | Optional | A comma seperated string of currencies available for the plan items associated to this plan | String getActiveCurrencies() |
| `product` | `String` | Required | The identifier of the product that this plan will belong to. | String getProduct() |
| `customFields` | `Map<String, Object>` | Optional | A map of custom fields set on the product | Map<String, Object> getCustomFields() |
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the product was created | ZonedDateTime getCreateTime() |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the product was last updated | ZonedDateTime getUpdateTime() |
| `createdBy` | `String` | ReadOnly | The Id of the user that created the product | String getCreatedBy() |
| `updatedBy` | `String` | ReadOnly | The Id of the user that last updated the product | String getUpdatedBy() |
| `items` | [`List<PlanItem>`](/doc/models/plan-item.md) | Optional | The individual plan items that make up the plan. | List<PlanItem> getItems() |

## Example (as JSON)

```json
{
  "id": "PLAN-000001",
  "name": "Plan Y",
  "product" : "P-000001",
  "active": true,
  "description": "a plan Y",
  "activeCurrencies": "GBP,USD",
  "customFields": {
    "region__c": "EMEA"
  },
  "createTime": "2021-07-10T13:23:49.154Z",
  "updateTime": "2021-07-12T15:33:52.183Z",
  "createdBy": "b64adedc-faba-11eb-9a03-0242ac130003",
  "updatedBy": "c4a40c56-faba-11eb-9a03-0242ac130003",
  "items": [{
    "id": "01F9E8XVBT3170FF8E2ATH7XS0",
    "x": "",
    "startDate": "2021-01-01",
    "endDate": "2021-12-31"
  }]
}
```

## Methods

### Add Plan Item
