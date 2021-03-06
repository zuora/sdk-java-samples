
# Plan

A Plan is a container for a collection of [Prices](/doc/models/price.md) for a [Product](/doc/models/product.md) and is the response returned by [CreatePlan](/doc/plan-api.md#create-plan), [UpdatePlan](/doc/plan-api.md#update-plan) and [GetPlan](/doc/plan-api.md#get-plan).

## Structure

`Plan`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | `String getId()` |
| `name` | `String` |  | The name of the product. | `String getName()` |
| `description` | `String` |  | An arbitrary string attached to the object. Often useful for displaying to users. | `String getDescription()` |
| `active` | `boolean` | ReadOnly | Whether the plan can be used for new purchases. | `boolean isActive()` |
| `startDate` | `LocalDate` |  | Date on which the plan can start being used. | `String getStartDate()` |
| `endDate` | `LocalDate` |  | Date on which the plan can no longer be used for new purchases. | `String getEndDate()` |
| `activeCurrencies` | `String` |  | A (comma-separated) string of the price currencies available with this plan | `String getActiveCurrencies()` |
| `product` | `String` |  | The identifier of the plan's product. | `String getProduct()` |
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time - based on your tenant timezone - that the product was created | `ZonedDateTime getCreateTime()` |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time - based on your tenant timezone - that the product was last updated | `ZonedDateTime getUpdateTime()` |
| `createdBy` | `String` | ReadOnly | The Id of the user that created the product | `String getCreatedBy()` |
| `updatedBy` | `String` | ReadOnly | The Id of the user that last updated the product | `String getUpdatedBy()` |
| `items` | [`List<Price>`](/doc/models/price.md) |  | The prices for this plan. | `List<Price> getPrices()` |
| `customFields` | `Map<String, Object>` |  | Custom fields. | `Map<String, Object> getCustomFields()`|

## Methods

### Add Price
