
# Subscription Plan

A SubscriptionPlan is a container for a collection of [SubscriptionPlanItems](/doc.models/subscription-plan-item.md) and is the response returned by [CreateSubscriptionPlan](/doc/subscription-plan.md#create-subscription-plan), [UpdateSubscriptionPlan](/doc/subscription-plan.md#update-subscription-plan) and [GetSubscriptionPlan](/doc/subscription-plan.md#get-subscription-plan).

## Structure

`SubscriptionPlan`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` | Required | The name of the product. | String getName() |
| `subscription` | `String` | Required | The identifier of the subscription that this plan will belong to. | String getSubscription() |
| `plan` | `String` | Required | The identifier of a plan object. | String getPlan() |
| `items` | [`List<SubscriptionPlanItem>`](/doc/models/subscription-plan-item.md) | Optional | The individual subscription plan items that make up the subscription plan. | List<SubscriptionPlanItem> getItems() |

## Example (as JSON)

```json
{
    "id": "23R7ED6NRY0Q7FXAXWWMP981W4",
    "name": "Plan Y",
    "subscription" : "S-000001",
    "plan" : "PLAN-000001",
    "items": [{
        "id": "01F9E8XVBT3170FF8E2ATH7XS0",
        "startDate": "2021-01-01",
        "endDate": "2021-12-31"
    }]
}
```
