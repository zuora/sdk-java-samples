# Product API

Products describe the specific goods or services you offer to your customers. For example, if you offer both a Standard and a Premium version of your service, each version would be a separate Product. They can be used in conjunction with Plans and Plan Items to configure pricing.



## Class Name

`ProductAPI`

## Methods

* [Create product](/doc/product-api.md#create-product)
* [Get product](/doc/product-api.md#get-product)
* [Update product](/doc/product-api.md#update-product)
* [Delete product](/doc/product-api.md#delete-product)



# Create Product

Creates a new product.

You must provide at least these values in your request to this endpoint:

- `name`


```java
Product product = productAPI.create(createProductRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `createProductRequest` | [`CreateProductRequest`](/doc/models/product-create-request.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

[`Product`](/doc/models/product.md)

## Example

```java
ProductCreateRequest productCreateRequest = ProductCreateRequest.builder()
        .name("Gold")
        .build();
Product product = productAPI.create(createRequest);
```

# Get Product

```java
Product product = productAPI.get(productId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the product. |


## Response Type

[`Product`](/doc/models/product.md)


## Example 

```java
String productId = "product_id8";

Product product = productAPI.get(productId);
```


# Update Product

```java
Product product = productAPI.update(product);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `product` | [`Product`](/doc/models/product.md) | Product, Required | The product to update. |


## Response Type

[`Product`](/doc/models/product.md)


## Example 

```java
String productId = "product_id8";
Product product = productAPI.get(productId);

Product updateRequest = product.builder()
    .name("Product Y")
    .build();
    
Product product = productAPI.update(updateRequest);
```


# Delete Product

```java
productAPI.delete(product);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `product` | [`Product`](/doc/models/product.md) | Body, Required | The product to be deleted. |


## Response Type
None


## Example 

```java
String productId = "product_id8";
Product product = productAPI.get(productId);
   
productAPI.delete(product);
```





