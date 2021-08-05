# Plan

Plans are collections of [Plan Items](/doc/planitem.md) which define the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases of [Products](/doc/product.md). While Products help you track inventory or provisioning, plans and plan items help you track payment terms. Different physical goods or levels of service should be represented by products, and pricing and billing cycle options should be represented by plan items grouped together under a plan. This approach lets you change prices without having to change your provisioning scheme.

For example, you might have a single "gold" product that has prices for $100/month, $1000/year, and $50 once with the the alternative billing cycle and pricing options each represented by a different plan and the recurring and one-time prices represented by different plan items

## Class Name



 ## Methods

* [Create plan](/doc/plan.md#create-plan)
* [Get plan](/doc/plan.md#get-plan)
* [Update plan](/doc/plan.md#update-plan)



# Create Plan

Creates a new plan.

You must provide at least these values in your request to this endpoint:

- `name`
- `startDate`
- `sku`

```java
Plan plan = productAPI.createPlan(createPlanRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreatePlanRequest`](/doc/models/create-plan-request.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

[`Plan`](/doc/models/plan.md)

## Example

```java
CreatePlanRequest createRequest = new CreatePlanRequest.Builder()
    .name("Plan X")
    .build();
Plan plan = productAPI.create(createRequest);
```

# Get Plan

```java
Plan plan = productAPI.get(planId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the plan. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example 

```java
String planId = "plan_id8";

Plan plan = productAPI.get(planId);
```


# Update Plan

```java
Plan plan = productAPI.update(updateRequest);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Plan`](/doc/models/plan.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example 

```java
String planId = "plan_id8";
Plan plan = productAPI.get(planId);

Plan updateRequest = plan.builder()
    .name("Plan Y")
    .build();
    
Plan plan = productAPI.update(updateRequest);
```


