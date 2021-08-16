
# Subscription Plan

A SubscriptionPlan is a container for a collection of [SubscriptionPlanItems](/doc/models/subscription-plan-item.md) and is the response returned by [CreateSubscriptionPlan](/doc/subscription-plan-api.md#create-subscription-plan), [UpdateSubscriptionPlan](/doc/subscription-plan-api.md#update-subscription-plan) and [GetSubscriptionPlan](/doc/subscription-plan-api.md#get-subscription-plan).

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` | Required | The name of the product. | String getName() |
| `subscription` | `String` | Required | The identifier of the subscription that this plan will belong to. | String getSubscription() |
| `plan` | `String` | Required | The identifier of a plan object. | String getPlan() |
| `subscriptionPlanItems` | [`List<SubscriptionPlanItem>`](/doc/models/subscription-plan-item.md) | Optional | The individual subscription plan items that make up the subscription plan. | List<SubscriptionPlanItem> getItems() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
