
# Product

Product represents your products and is the response returned by [CreateProduct](/doc/product-api.md#create-product), [UpdateProduct](/doc/product-api.md#update-product) and [GetProduct](/doc/product-api.md#get-product).

## Structure

`Product`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` |  | The name of the product. | String getName() |
| `description` | `String` |  | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `startDate` | `LocalDate` |  | Date on which the product becomes active. | String getStartDate() |
| `endDate` | `LocalDate` |  | Date on which the product is no longer active. | String getEndDate() |
| `sku` | `String` |  | The sku identifier of the product. | String getSku() |
| `active` | `Boolean` |  | A boolean to indicate if the current date is within the start and end date. | Boolean isActive() |
| `type` | `String` |  | The type of product, defaulting to `Base Product` | String getType() |
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the product was created | ZonedDateTime getCreateTime() |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the product was last updated | ZonedDateTime getUpdateTime() |
| `createdBy` | `String` | ReadOnly | The Id of the user that created the product | String getCreatedBy() |
| `updatedBy` | `String` | ReadOnly | The Id of the user that last updated the product | String getUpdatedBy() |
| `plans` | [`List<Plan>`](/doc/models/plan.md) |  | The array of plans associated with this product. | List<Plan> getPlans() |
| `customFields` | `Map<String, Object>` |  | Custom fields. | `Map<String, Object> getCustomFields()`|
