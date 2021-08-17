# Plan API

Plans are collections of [Plan Items](/doc/plan-item-api.md) which define the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases of [Products](/doc/product-api.md). While Products help you track inventory or provisioning, plans and plan items help you track payment terms. Different physical goods or levels of service should be represented by products, and pricing and billing cycle options should be represented by plan items grouped together under a plan. This approach lets you change prices without having to change your provisioning scheme.

For example, you might have a single "gold" product that has prices for $100/month, $1000/year, and $50 once with the the alternative billing cycle and pricing options each represented by a different plan and the recurring and one-time prices represented by different plan items

## Class Name

`PlanAPI`

## Methods

* [Create plan](/doc/plan-api.md#create-plan)
* [Get plan](/doc/plan-api.md#get-plan)
* [Update plan](/doc/plan-api.md#update-plan)
* [List plans](/doc/plan-api.md#list-plans)
* [Delete plan](/doc/plan-api.md#delete-plan)


# Create Plan

Creates a new plan.

You must provide at least these values in your request to this endpoint:

- `name`

```java
Plan plan = zuoraClient.products().createPlan(planCreateRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planCreateRequest` | [`PlanCreateRequest`](/doc/models/plan-create-request.md) | Required | Plan request object. |

## Response Type

[`Plan`](/doc/models/plan.md)

## Example

```java
PlanCreateRequest planCreateRequest = PlanCreateRequest.builder()
        .name("Monthly Plan")
        .build();
Plan plan = zuoraClient.products().createPlan(planCreateRequest);
```

# Get Plan

```java
Plan plan = zuoraClient.products().getPlan(planId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a plan. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example 

```java
String PLAN_ID = "plan_id8";

Plan plan = zuoraClient.products().getPlan(PLAN_ID);
```


# Update Plan

```java
Plan plan = zuoraClient.products().updatePlan(updatePlanRequest);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `plan` | [`Plan`](/doc/models/plan.md) | Required | Plan request object. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example 

```java
String PLAN_ID = "plan_id8";
Plan plan = zuoraClient.products().get(PLAN_ID);

Plan updatePlanRequest = plan.toBuilder()
    .name("Plan Y")
    .build();
    
Plan plan = zuoraClient.products().update(updatePlanRequest);
```

# List Plans

```java
Plan plan = zuoraClient.products().getPlans(product);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `product` | `Product` | Required | A product object. |


## Response Type

List<[`Plan`](/doc/models/plan.md)>


## Example 

```java
String PRODUCT_ID = "product_id8";

Product product = zuoraClient.products().getProduct(PRODUCT_ID);

List<Plan> plans = zuoraClient.products().getPlans(product);
```

# Delete Plan

```java
Plan plan = zuoraClient.products().removePlan(planId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a plan. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example 

```java
String PLAN_ID = "plan_id8";

Plan plan = zuoraClient.products().removePlan(PLAN_ID);
```



