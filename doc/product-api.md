# Product API

Products describe the specific goods or services you offer to your customers. They should be used in conjunction with Plans and Prices to configure pricing.



## Class Name

`ProductAPI`

## Methods

* [Create product](/doc/product-api.md#create-product)
* [Get product](/doc/product-api.md#get-product)
* [Find product by sku](/doc/product-api.md#find-product-by-sku)
* [Delete product](/doc/product-api.md#delete-product)



# Create Product

Creates a new product.

You must provide at least this value in your request to this endpoint:

- `name`


```java
Product product = zuoraClient.products().create(params);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `params` | [`ProductCreateRequest`](/doc/models/product-create-request.md) | Required | Product create request. |

## Response Type

[`Product`](/doc/models/product.md)

## Example

```java
ProductCreateRequest productCreateRequest = ProductCreateRequest.builder()
        .name("Gold")
        .build();
Product product = zuoraClient.products().create(params);
```

# Get Product

```java
Product product = zuoraClient.products().get(productId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a product. |


## Response Type

[`Product`](/doc/models/product.md)


## Example 

```java
String PRODUCT_ID = "product_id8";

Product product = zuoraClient.products().get(PRODUCT_ID);
```

# Find Product by Sku

```java
Product product = zuoraClient.products().findBySku(skuId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `skuId` | `String` | Required | The unique sku identifier of a product. |


## Response Type

[`Product`](/doc/models/product.md)


## Example 

```java
String SKU_ID = "sku_id8";

Product product = zuoraClient.products().findBySku(SKU_ID);
```



# Delete Product

```java
zuoraClient.products().delete(product);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `product` | [`Product`](/doc/models/product.md) | Required | The product to be deleted. |


## Response Type
None


## Example 

```java
String PRODUCT_ID = "product_id8";
Product product = zuoraClient.products().get(PRODUCT_ID);
   
zuoraClient.products().delete(product);
```





