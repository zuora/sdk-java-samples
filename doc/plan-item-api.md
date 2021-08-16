# Plan Item API

Plan items define the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases of products. Products help you track inventory or provisioning, and plans and plan items help you track payment terms. Different physical goods or levels of service should be represented by products, and pricing options should be represented by plan items. This approach lets you change prices without having to change your provisioning scheme.

For example, you might have a single "enterprise" product that has prices for $100/month, $1000/year, and $50 once.

## Class Name



## Methods

* [Create plan item](/doc/plan-item-api.md#create-plan-item)
* [Get plan item](/doc/plan-item-api.md#get-plan-item)
* [Update plan item](/doc/plan-item-api.md#update-plan-item)



# Create Plan Item

Creates a new plan item.

```java
PlanItem planitem = productAPI.createPlanItem(createPlanItemRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `createPlanItemRequest` | [`CreatePlanItemRequest`](/doc/models/plan-item-create-request.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

[`PlanItem`](/doc/models/plan-item.md)

## Example

```java
PlanItemCreateRequest planItemCreateRequest = PlanItemCreateRequest.recurringBuilder()
        .name("Monthly Membership")
        .chargeModel(FlatFee.builder()
                            .amount(Currency.getInstance(CURRENCY_USD), 5.00)
                            .build())
        .accountingCode(defaultAccountingCodeName)
        .startEvent(PlanItemEnum.Event.CONTRACT_EFFECTIVE)
        .alignment(PlanItemEnum.Alignment.SUBSCRIPTION_PLAN_ITEM)
        .interval(PlanItemEnum.Interval.MONTH)
        .on(PlanItemEnum.RecurringOn.ACCOUNT_CYCLE_DATE)
        .build();
PlanItem planItem = zuoraClient.products().createPlanItem(createRequest);
```


# Get Plan Item

```java
PlanItem planItem = zuoraClient.products().getPlanItem(planItemId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of the plan item. |


## Response Type

[`PlanItem`](/doc/models/plan-item.md)


## Example 

```java
String planItemId = "plan_item_id8";

PlanItem planItem = zuoraClient.products().getPlanItem(planItemId);
```

# Update Plan Item

```java
PlanItem planItem = zuoraClient.products().updatePlanItem(updateRequest);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PlanItem`](/doc/models/plan-item.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |


## Response Type

[`PlanItem`](/doc/models/plan-item.md)


## Example 

```java
String planItemId = "plan_item_id8";
PlanItem planItem = productAPI.getPlanItem(planItemId);

PlanItem updateRequest = planItem.toBuilder()
    .name("Plan Y")
    .build();
    
PlanItem planItem = productAPI.updatePlanItem(updateRequest);
```
