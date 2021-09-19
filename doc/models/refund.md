# Refund

Refunds are returned by
[CreateRefund](/doc/refund-api.md#create-refund)
and [GetRefund](/doc/refund-api.md#get-refund).


## Fields


| Name | Type | Tags | Description | Getters
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | `String getId()` |
| `account` | `String` | | Customer account ID. | `String getAccount()`
| `amount` | `Double` | | The refund amount. | `Double getAmount()`
| `description` | `String` | | An arbitrary string attached to the object. Often useful for displaying to users. | `String getDescription()`
| `currency` | `String` | | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | `String getCurrency()`
| `date` | `LocalDate` | | The date of the refund. | `String getDate()`
| `name` | `String` | | A refund name. | `String getName()`
| `gateway` | `String` |  | Identifier of the gateway used to process the payment. | `String getGateway()`
| `type` | [`Enum`](/doc/models/method-type.md) |  | The type of refund. | `String getType()`
| `creditMemo` | `String` |  | The credit memo associated with this refund. | `String getCreditMemo()`
| `transferredToAccounting` | [`TransferredToAccounting`](/doc/models/transferred-to-accounting.md) |  | Identifier of the gateway used to process the payment. | `String getGateway()`
| `paymentMethod` | `String` | | Unique identifier of the payment method used to make the refund. | `String getPaymentMethod()`
| `paymentMethodSnapshot` | `String` | | Unique identifier of the payment method used to make the refund. | `String getPaymentMethodSnapshot()`
| `statementDescriptor` | `String` | | A payment gateway-specific field that maps to Zuora for the gateways Orbital, Vantiv and Verifi. | `String getStatementDescriptor()`
| `external` | `Boolean` | | If `true` the payment is external. | `Boolean isExternal()`
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the payment was created. | `ZonedDateTime getCreateTime()` |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the payment was last updated. | `ZonedDateTime getUpdateTime()` |
| `createdBy` | `String` | ReadOnly | Identifier of the user that created the payment. | `String getCreatedBy()` |
| `updatedBy` | `String` | ReadOnly | Identifier of the user that last updated the payment. | `String getUpdatedBy()` |
| `reference` | `String` | ReadOnly | The transaction ID returned by the payment gateway for an electronic refund. Use this field to reconcile refunds between your gateway and Zuora Payments. | `String getReference()` |
| `state` | [`RefundState`](/doc/models/refund-state.md) | | State of the refund. | `String getState()` |
| `cancelTime` | `ZonedDateTime` | ReadOnly | Time the payment was cancelled. | `ZonedDateTime getCancelTime()` |
| `reason` | `String` | | The refund reason. | `String getReason()` |
| `payoutId` | `String` | | The payout ID of the refund from the gateway side. | `String getPayoutId()` |
| `customFields` | `Map<String, Object>` |  | Custom fields. | `Map<String, Object> getCustomFields()`|
