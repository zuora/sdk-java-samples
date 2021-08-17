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
PlanItem planitem = zuoraClient.products().createPlanItem(planItemCreateRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `planItemCreateRequest` | [`PlanItemCreateRequest`](/doc/models/plan-item-create-request.md) | Required | Plan item request object. |

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
PlanItem planItem = zuoraClient.products().createPlanItem(planItemCreateRequest);
```


# Get Plan Item

```java
PlanItem planItem = zuoraClient.products().getPlanItem(planItemId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a plan item. |


## Response Type

[`PlanItem`](/doc/models/plan-item.md)


## Example 

```java
String PLAN_ITEM_ID = "plan_item_id8";

PlanItem planItem = zuoraClient.products().getPlanItem(PLAN_ITEM_ID);
```

# Update Plan Item

```java
PlanItem planItem = zuoraClient.products().updatePlanItem(planItem);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`PlanItem`](/doc/models/plan-item.md) | Required | Plan item object. |


## Response Type

[`PlanItem`](/doc/models/plan-item.md)


## Example 

```java
String PLAN_ITEM_ID = "plan_item_id8";
PlanItem planItem = zuoraClient.products().getPlanItem(PLAN_ITEM_ID);

planItem.setName("Plan Item B")   
PlanItem planItem = zuoraClient.products().updatePlanItem(planItem);
```
