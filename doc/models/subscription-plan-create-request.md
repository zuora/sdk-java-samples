
# Subscription Plan Create Request

Describes a request to create a subscription plan using [CreateSubscription](/doc/subscription-api.md#create-subscription).

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `name` | `String` | Required | The name of the product. | `String getName()` |
| `subscription` | `String` | Required | The identifier of the subscription that this plan will belong to. | `String getSubscription()` |
| `plan` | `String` | Required | The identifier of a plan object. | `String getPlan()` |
| `subscriptionItems` | [`List<SubscriptionItem>`](/doc/models/subscription-item-create-request.md) | Optional | The individual subscription items that make up the subscription plan. | `List<SubscriptionItem> getItems()` |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
