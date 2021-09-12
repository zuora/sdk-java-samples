# Plan Create Request

Describes a request to create a plan using [CreatePlan](/doc/plan-api.md#create-plan).

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `name` | `String` | Required | The name of the plan. |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | 
| `product` | `String` | Required | The identifier of the plan's product. | 
| `startDate` | `LocalDate` | Optional | Date on which the plan can start being used. | 
| `endDate` | `LocalDate` | Optional | Date on which the plan can no longer be used for new purchases. |
| `items` | [`List<Price>`](/doc/models/price.md) | Optional | The prices in this plan. | 
| `customFields` | `Map<String, Object>` | Optional | Custom fields. |
