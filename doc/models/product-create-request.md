
# Create Product Request

Product represents your products and are the response returned by [CreateProduct](/doc/product-api.md#create-product), [UpdateProduct](/doc/product-api.md#update-product) and [GetProduct](/doc/product-api.md#get-product).


## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- | 
| `name` | `String` | Required | The name of the product. | 
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | 
| `startDate` | `LocalDate` | Optional | Date on which the product becomes active. | 
| `endDate` | `LocalDate` | Optional | Date on which the product is no longer active. | 
| `sku` | `String` | Optional | The sku identifier of the product. | 
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | 
