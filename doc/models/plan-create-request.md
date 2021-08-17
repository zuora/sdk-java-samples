# Plan Create Request

Describes a request to create a plan using [CreatePlan](/doc/plan-api.md#create-plan).

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `name` | `String` | Required | The name of the product. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `product` | `String` | Required | The identifier of the product that this plan will belong to. | String getProduct() |
| `startDate` | `LocalDate` | Optional | Date on which the plan becomes active. | String getStartDate() |
| `endDate` | `LocalDate` | Optional | Date on which the plan is no longer active. | String getEndDate() |
| `items` | [`List<PlanItem>`](/doc/models/plan-item.md) | Optional | The individual plan items that make up the plan. | List<PlanItem> getItems() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
