# Plan Create Request

Describes a request to create a plan using [CreatePlan](/doc/plan-api.md#create-plan).

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Required | The name of the product. |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | 
| `product` | `String` | Required | The identifier of the product that this plan will belong to. | 
| `startDate` | `LocalDate` | Optional | Date on which the plan becomes active. | 
| `endDate` | `LocalDate` | Optional | Date on which the plan is no longer active. |
| `items` | [`List<PlanItem>`](/doc/models/plan-item.md) | Optional | The individual plan items that make up the plan. | 
| `customFields` | `Map<String, Object>` | Optional | Custom fields. |
