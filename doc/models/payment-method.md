
# PaymentMethod

Payment methods represent your customers' payment instruments and are the response returned by [GetPaymentMethod](/doc/payment-method.md#get-payment-method).

## Structure

`PaymentMethod`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `type` | [`Enum`](/doc/models/payment-method-type.md) | Required | The type of the PaymentMethod. | String getType() |
| `accountKey` | `String` | Optional | A customer account key. | String getAccountKey() |
| `name` | `String` | Optional | The customer’s full name or business name. | String getName() |


## Example (as JSON)

```json
{
    "id": "A-000001"
}
```
