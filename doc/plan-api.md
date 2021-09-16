# Plan API

Plans are collections of [Prices](/doc/price-api.md) which define the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases of [Products](/doc/product-api.md). While Products help you track inventory or provisioning, plans and prices help you track payment terms. Different physical goods or levels of service should be represented by products, and pricing and billing cycle options should be represented by prices grouped together in a plan. This approach lets you change prices without having to change your provisioning scheme.

For example, you might have a single "gold" product that has prices for $100/month, $1000/year, and $50 once with the alternative billing cycle and pricing options each represented by a different plan and the recurring and one-time prices represented by different prices

## Class Name

`PlanAPI`

## Methods

* [Create plan](/doc/plan-api.md#create-plan)
* [Get plan](/doc/plan-api.md#get-plan)
* [Update plan](/doc/plan-api.md#update-plan)
* [Delete plan](/doc/plan-api.md#delete-plan)


# Create Plan

Creates a new plan.

You must provide at least these values in your request:

- `name`

```java
Plan plan = zuoraClient.plans().create(params);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `params` | [`PlanCreateRequest`](/doc/models/plan-create-request.md) | Required | Plan request object. |

## Response Type

[`Plan`](/doc/models/plan.md)

## Example

```java
PlanCreateRequest params = PlanCreateRequest.builder()
        .name("Monthly Plan")
        .build();
Plan plan = zuoraClient.plans().create(params);
```

# Get Plan

```java
Plan plan = zuoraClient.plans().get(planId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a plan. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example 

```java
final String PLAN_ID = "plan_id8";

Plan plan = zuoraClient.plans().get(PLAN_ID);
```


# Update Plan

```java
Plan plan = zuoraClient.plans().update(updatePlanRequest);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `plan` | [`Plan`](/doc/models/plan.md) | Required | Plan request object. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example 

```java
final String PLAN_ID = "plan_id8";
Plan plan = zuoraClient.plans().get(PLAN_ID);

plan.setName("Plan Y")
Plan plan = zuoraClient.plans().update(plan);
```

# Delete Plan

```java
final String PLAN_ID = "plan_id8";

Plan plan = zuoraClient.plans().delete(PLAN_ID);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a plan. |


## Response Type

[`Plan`](/doc/models/plan.md)


## Example 

```java
final String PLAN_ID = "plan_id8";

Plan plan = zuoraClient.plans().delete(PLAN_ID);
```



