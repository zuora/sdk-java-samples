
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
| `active` | `Boolean` | Optional | A boolean to indicate if the current date is within the start and end date. | Boolean isActive() |
| `type` | `String` | Optional | The type of product, defaulting to `Base Product` | String getType() |
| `customFields` | `Map<String, Object>` | Optional | A map of custom fields set on the product | Map<String, Object> getCustomFields() |
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the product was created | ZonedDateTime getCreateTime() |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the product was last updated | ZonedDateTime getUpdateTime() |
| `createdBy` | `String` | ReadOnly | The Id of the user that created the product | String getCreatedBy() |
| `updatedBy` | `String` | ReadOnly | The Id of the user that last updated the product | String getUpdatedBy() |
| `plans` | [`List<Plan>`](/doc/models/plan.md) | Optional | The array of plans associated with this product. | List<Plan> getPlans() |

## Example (as JSON)

```json
{
    "id": "P-000001",
    "name": "Product X",
    "description": "a product X",
    "startDate": "2021-07-10T13:23:49.154Z",
    "endDate": "2029-01-03T13:23:49.154Z",
    "sku": "SKU-000345",
    "active": true,
    "type": "Base Product",
    "customFields": {
      "region__c": "EMEA"
    },
  "createTime": "2021-07-10T13:23:49.154Z",
  "updateTime": "2021-07-12T15:33:52.183Z",
  "createdBy": "b64adedc-faba-11eb-9a03-0242ac130003",
  "updatedBy": "c4a40c56-faba-11eb-9a03-0242ac130003",
    "plans": [{
        "id": "01F9E8XVBT3170FF8E2ATH7XS0",
        "name": "Plan X",
        "description": "a plan",
        "startDate": "2021-07-10T13:23:49.154Z",
        "endDate" : 
    }]
}
```
