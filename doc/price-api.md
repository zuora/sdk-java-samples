# Price API

Prices define the unit cost, currency, and (optional) billing cycle for both recurring and one-time purchases of products. Products help you track inventory or provisioning, and plans and prices help you track payment terms. Different physical goods or levels of service should be represented by products, and pricing options should be represented by pricess. This approach lets you change prices without having to change your provisioning scheme.

For example, you might have a single "Gold" product that has prices for $100/month, $1000/year, and $50 once.

## Class Name



## Methods

* [Create price](/doc/price-api.md#create-price)
* [Get price](/doc/price-api.md#get-price)
* [Update price](/doc/price-api.md#update-price)



# Create Price

Creates a new price.

```java
Price price = zuoraClient.prices().create(priceCreateRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `priceCreateRequest` | [`PriceCreateRequest`](/doc/models/price-create-request.md) | Required | Price request object. |

## Response Type

[`Price`](/doc/models/price.md)

## Example

```java
PriceCreateRequest priceCreateRequest = PriceCreateRequest.priceBuilder()
        .name("Monthly Membership")
        .accountingCode(defaultAccountingCodeName)
        .startEvent(PriceEnum.Event.CONTRACT_EFFECTIVE)
        .alignment(PriceEnum.Alignment.SUBSCRIPTION_PLAN_ITEM)
        .interval(PriceEnum.Interval.MONTH)
        .on(PriceEnum.RecurringOn.ACCOUNT_CYCLE_DATE)
        .build();
Price price = zuoraClient.prices().create(priceCreateRequest);
```


# Get Price

```java
Price price = zuoraClient.prices().get(priceId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a price. |


## Response Type

[`Price`](/doc/models/price.md)


## Example 

```java
String PRICE_ID = "price_id8";

Price price = zuoraClient.prices().get(PRICE_ID);
```

# Update Price

```java
Price price = zuoraClient.prices().update(price);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Price`](/doc/models/price.md) | Required | Price object. |


## Response Type

[`Price`](/doc/models/price.md)


## Example 

```java
String PRICE_ID = "price_id8";
Price price = zuoraClient.prices().get(PRICE_ID);

price.setName("Price B")   
Price price = zuoraClient.prices().update(price);
```
