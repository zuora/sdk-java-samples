# Payment Method

PaymentMethod objects represent your customer's payment instruments and must be associated with an Account object. They can be used to collect payments and stored for future payments.

## Class Name

`PaymentMethodAPI`

## Methods

* [Get payment method](/doc/payment-method.md#get-payment-method)



# Get Payment Method

```java
PaymentMethod paymentMethod = zuoraClient.paymentMethods().get({PAYMENT_METHOD_ID});
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the payment method. |

## Response Type

[`PaymentMethod`](/doc/models/payment-method.md)

## Example 

```java
String PAYMENT_METHOD_ID = "2c92c0f872c68b450172dad9c61e436b";

PaymentMethod paymentMethod = zuoraClient.paymentMethods().get(PAYMENT_METHOD_ID);
```