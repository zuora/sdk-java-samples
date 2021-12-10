
# Subscription Plan

A SubscriptionPlan is a container for a collection of [SubscriptionItems](/doc/models/subscription-item.md) and is the response returned by [CreateSubscriptionPlan](/doc/subscription-plan-api.md#create-subscription-plan), [UpdateSubscriptionPlan](/doc/subscription-plan-api.md#update-subscription-plan) and [GetSubscriptionPlan](/doc/subscription-plan-api.md#get-subscription-plan).

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | `String getId()` |
| `name` | `String` | Required | The name of the product. | `String getName()` |
| `subscription` | `String` | Required | The identifier of the subscription that this plan will belong to. | `String getSubscription()` |
| `plan` | `String` | Required | The identifier of a plan object. | `String getPlan()` |
| `subscriptionItems` | [`List<SubscriptionItem>`](/doc/models/subscription-item.md) | Optional | The individual subscription items that make up the subscription plan. | `List<SubscriptionItem> getItems()` |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the subscription plan was created | ZonedDateTime getCreateTime() |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the subscription plan was last updated | ZonedDateTime getUpdateTime() |
| `createdBy` | `String` | ReadOnly | The Id of the user that created the subscription plan | String getCreatedBy() |
| `updatedBy` | `String` | ReadOnly | The Id of the user that last updated the subscription plan | String getUpdatedBy() |
