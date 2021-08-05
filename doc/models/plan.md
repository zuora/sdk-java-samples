
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
| `product` | `String` | Required | The identifier of the product that this plan will belong to. | String getProduct() |
| `items` | [`List<PlanItem>`](/doc/models/plan-item.md) | Optional | The individual plan items that make up the plan. | List<PlanItem> getItems() |

## Example (as JSON)

```json
{
    "id": "PLAN-000001",
    "name": "Plan Y",
    "product" : "P-000001",
    "items": [{
        "id": "01F9E8XVBT3170FF8E2ATH7XS0",
        "x": "",
        "startDate": "2021-01-01",
        "endDate": "2021-12-31"
    }]
}
```
