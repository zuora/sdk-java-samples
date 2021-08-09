
# Product

Product represents your products and are the response returned by [CreateProduct](/doc/product.md#create-product), [UpdateProduct](/doc/product.md#update-product) and [GetProduct](/doc/product.md#get-product).

## Structure

`Product`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` | Required | The name of the product. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `startDate` | `LocalDate` | Optional | Date on which the product becomes active. | String getStartDate() |
| `endDate` | `LocalDate` | Optional | Date on which the product is no longer active. | String getEndDate() |
| `sku` | `String` | Optional | The sku identifier of the product. | String getSku() |
| `plans` | [`List<Plan>`](/doc/models/plan.md) | Optional | The array of plans associated with this product. | List<Plan> getPlans() |

## Example (as JSON)

```json
{
    "id": "P-000001",
    "name": "Product X",
    "startDate": "2021-07-10T13:23:49.154Z",
    "sku" : "SKU-000345",
    "active" : true,
    "plans": [{
        "id": "01F9E8XVBT3170FF8E2ATH7XS0"
    }]
}
```
