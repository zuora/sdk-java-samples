
# Create Product Request

Product represents your products and are the response returned by [CreateProduct](/doc/product-api.md#create-product), [UpdateProduct](/doc/product-api.md#update-product) and [GetProduct](/doc/product-api.md#get-product).

## Structure

`CreateProductRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `name` | `String` | Required | The name of the product. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `startDate` | `LocalDate` | Optional | Date on which the product becomes active. | String getStartDate() |
| `endDate` | `LocalDate` | Optional | Date on which the product is no longer active. | String getEndDate() |
| `sku` | `String` | Optional | The sku identifier of the product. | String getSku() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
