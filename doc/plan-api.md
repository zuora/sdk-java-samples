# Plan API

Plans are collections of [Plan Items](/doc/plan-item-api.md) which define the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases of [Products](/doc/product-api.md). While Products help you track inventory or provisioning, plans and plan items help you track payment terms. Different physical goods or levels of service should be represented by products, and pricing and billing cycle options should be represented by plan items grouped together under a plan. This approach lets you change prices without having to change your provisioning scheme.

For example, you might have a single "gold" product that has prices for $100/month, $1000/year, and $50 once with the the alternative billing cycle and pricing options each represented by a different plan and the recurring and one-time prices represented by different plan items

## Class Name



 ## Methods

* [Create plan](/doc/plan-api.md#create-plan)
* [Get plan](/doc/plan-api.md#get-plan)
* [Update plan](/doc/plan-api.md#update-plan)
* Add Plan Item



# Create Plan

Creates a new plan.

You must provide at least these values in your request to this endpoint:

- `name`

```java
Plan plan = productAPI.createPlan(createPlanRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `createPlanRequest` | [`CreatePlanRequest`](/doc/models/plan-create-request.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

[`Plan`](/doc/models/plan.md)

## Example

```java
PlanCreateRequest planCreateRequest = PlanCreateRequest.builder()
        .name("Monthly Plan")
        .build();
Plan plan = productAPI.createPlan(createRequest);
```

# Get Plan

```java
Plan plan = productAPI.getPlan(planId);
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

Plan plan = productAPI.getPlan(planId);
```


# Update Plan

```java
Plan plan = productAPI.updatePlan(updateRequest);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `plan` | [`Plan`](/doc/models/plan.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example 

```java
String planId = "plan_id8";
Plan plan = productAPI.get(planId);

Plan updateRequest = plan.toBuilder()
    .name("Plan Y")
    .build();
    
Plan plan = productAPI.update(updateRequest);
```

# Add Plan Item

```java
plan.addPlanItem(PlanItem planItem)
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planItem` | [`PlanItem`](/doc/models/plan-item.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example

```java
String planId = "plan_id8";
Plan plan = productAPI.get(planId);

Plan updateRequest = plan.toBuilder()
    .name("Plan Y")
    .build();
    
Plan plan = productAPI.update(updateRequest);
```


