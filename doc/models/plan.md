
# Plan

A Plan is a container for a collection of [Prices](/doc/models/price.md) and is the response returned by [CreatePlan](/doc/plan-api.md#create-plan), [UpdatePlan](/doc/plan-api.md#update-plan) and [GetPlan](/doc/plan-api.md#get-plan).

## Structure

`Plan`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` | Required | The name of the product. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `active` | `Boolean` | Optional | A boolean to indicate if the current date is within the start and end date. | Boolean isActive() |
| `startDate` | `LocalDate` | Optional | Date on which the plan becomes active. | String getStartDate() |
| `endDate` | `LocalDate` | Optional | Date on which the plan is no longer active. | String getEndDate() |
| `activeCurrencies` | `String` | Optional | A comma seperated string of currencies available for the plan items associated to this plan | String getActiveCurrencies() |
| `product` | `String` | Required | The identifier of the product that this plan will belong to. | String getProduct() |
| `customFields` | `Map<String, Object>` | Optional | A map of custom fields set on the product | Map<String, Object> getCustomFields() |
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the product was created | ZonedDateTime getCreateTime() |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the product was last updated | ZonedDateTime getUpdateTime() |
| `createdBy` | `String` | ReadOnly | The Id of the user that created the product | String getCreatedBy() |
| `updatedBy` | `String` | ReadOnly | The Id of the user that last updated the product | String getUpdatedBy() |
| `prices` | [`List<Price>`](/doc/models/price.md) | Optional | The individual prices that make up the plan. | List<Price> getPrices() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|

## Methods

### Add Plan Item
