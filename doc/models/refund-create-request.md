# Create Refund Request

Describes a request to create a refund by [CreateRefund](/doc/refund-api.md#create-refund)


## Fields


| Name | Type | Tags | Description | Getters
|  --- | --- | --- | --- | --- |
| `account` | `String` | | Customer account ID. | `String getAccount()`
| `amount` | `Double` | | The refund amount. | `Double getAmount()`
| `description` | `String` | | An arbitrary string attached to the object. Often useful for displaying to users. | `String getDescription()`
| `currency` | `String` | | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | `String getCurrency()`
| `date` | `LocalDate` | | The date of the refund. | `String getDate()`
| `type` | [`Enum`](/doc/models/refund-method-type.md) |  | The type of refund. | `String getType()`
| `paymentMethod` | `String` | | Unique identifier of the payment method used to make the refund. | `String getPaymentMethod()`
| `statementDescriptor` | `String` | | A payment gateway-specific field that maps to Zuora for the gateways Orbital, Vantiv and Verifi. | `String getStatementDescriptor()`
| `external` | `Boolean` | | If `true` the payment is external. | `Boolean isExternal()`
| `reference` | `String` | ReadOnly | The transaction ID returned by the payment gateway for an electronic refund. Use this field to reconcile refunds between your gateway and Zuora Payments. | `String getReference()` |
| `reason` | `String` | | The refund reason. | `String getReason()` |
| `paymentId` | `String` | | ID of the payment with which the refund is associated. | `String getPaymentId()` |
| `customFields` | `Map<String, Object>` |  | Custom fields. | `Map<String, Object> getCustomFields()`|
