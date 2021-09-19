# Refund API


Refund objects allow you to unapply a payment applied to an invoice or debit memo and, in some instances, refund the charge to the credit or debit card that was originally charged.

## Class Name

`RefundAPI`

## Methods

* [Create refund](/doc/refund-api.md#create-refund)
* [Get refund](/doc/refund-api.md#get-refund)

# Create Refund

Creates a new refund.

```java
Refund refund = zuoraClient.refunds().create(params);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `params` | [`RefundCreateRequest`](/doc/models/refund-create-request.md) | Required | Refund create request. |

## Response Type

[`Refund`](/doc/models/refund.md)

## Example

```java
RefundCreateRequest params = RefundCreateRequest.builder()
        .amount(10.0d)
        .account("account_id8")
        .authorisationCode("7368")
        .currency("USD")
        .external(true)
        .build();

Refund refund = zuoraClient.refunds().create(params);
```

# Get Refund

Retrieves a refund by ID.

```java
Refund refund = zuoraClient.refunds().get(id);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a refund. |

## Response Type

[`Refund`](doc/model/refund.md)

## Example

```java
Refund refund = zuoraClient.refunds().get(id);
```
