# Refund

Refunds are returned by
[CreateRefund](/doc/refund-api.md#create-refund)
and [GetRefund](/doc/refund-api.md#get-refund).


## Fields


| Name | Type | Tags | Description | Getters
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `account` | `String` | | Customer account ID. | `String getAccount()`
| `amount` | `Double` | | The total amount of the payment. | `Double getAmount()`
| `amountApplied` | `Double` |  | The applied amount of the payment. | `Double getAmountApplied()`
| `amountUnapplied` | `Double` |  | The unapplied amount of the payment. | `Double getAmountUnapplied()`
| `amountRefunded` | `Double` |  | The amount of the payment that is refunded. | `Double getAmountRefunded()`
| `authorisationCode` | `String` | | An authorization transaction ID from the payment gateway. | `String getAuthorisationCode()`
| `description` | `String` | | An arbitrary string attached to the object. Often useful for displaying to users. | `String getDescription()`
| `currency` | `String` | | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | `String getCurrency()`
| `date` | `LocalDate` | | The date when the payment takes effect. | `String getDate()`
| `name` | `String` | | A unique identification number for the payment. For example, P-00000001. | `String getName()`
| `gatewayOptions` | `Map<String, String>` | | Used to pass gateway-specific parameters and parameter values. | `Map<String, String> getGatewayOptions()`
| `financeInformation` | [`FinanceInformation`](finance-information.md) | | Payment finance information. | `String getFinanceInformation()`
| `gateway` | `String` | Optional | Identifier of the gateway used to process the payment. | `String getGateway()`
| `paymentMethod` | `String` | | Unique identifier of the payment method used to make the payment. | `String getPaymentMethod()`
| `gatewayOrderId` | `String` | | A merchant-specified natural key value that can be passed to the payment gateway when a payment is created. If not specified, a payment number will be passed in instead. | `String getGatewayOrderId`
| `reference` | `String` | | Transaction identifier returned by your payment gateway. Use this field to reconcile payments between your gateway and Zuora Payments. | `String getReference()`
| `statementDescriptor` | `String` | | A payment gateway-specific field that maps to Zuora for the gateways Orbital, Vantiv and Verifi. | `String getStatementDescriptor()`
| `softDescriptorPhone` | `String` | | A payment gateway-specific field that maps to Zuora for the gateways Orbital, Vantiv and Verifi. | `String getSoftDescriptorPhone()`
| `external` | `Boolean` | | If `true` the payment is external. | `Boolean isExternal()`
| `customFields` | `Map<String, Object>` | | Custom fields used to create a payment. | `Map<String, Object> getCustomFields()` |
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the payment was created | `ZonedDateTime getCreateTime()` |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the payment was last updated | `ZonedDateTime getUpdateTime()` |
| `createdBy` | `String` | ReadOnly | Identifier of the user that created the payment | `String getCreatedBy()` |
| `updatedBy` | `String` | ReadOnly | Identifier of the user that last updated the payment | `String getUpdatedBy()` |
| `state` | [`PaymentState`](payment-state.md) | | State of the payment. | `PaymentStatus getState()` |
| `cancelTime` | `ZonedDateTime` | ReadOnly | Time the payment was cancelled. | `ZonedDateTime getCancelTime()` |
| `submitTime` | `ZonedDateTime` | ReadOnly | Time when the payment was submitted. | `ZonedDateTime getSubmitTime()` |
| `secondPayment ReferenceId` | `String` | | The payout ID of the payment from the gateway side. | `String getSecondPaymentReferenceId()`
| `payoutId` | `String` | | The payout ID of the payment from the gateway side. | `String getPayoutId()` |
| `gatewayState` | [`PaymentGatewayState`](payment-gateway-state.md) | | The status of the payment in the gateway; use for reconciliation. | `PaymentGatewayState getGatewayState()` |
| `markedFor SubmissionOn` | `ZonedDateTime` | | Time when the payment was marked and waiting for batch submission to the payment process. | `ZonedDateTime getMarkedForSubmissionOn()` |
| `gatewayResponseCode` | `String` | | The code returned from the payment gateway for the payment. | `String getGatewayResponseCode()` |
| `gatewayResponse` | `String` | | The message returned from the payment gateway for the payment. | `String getGatewayResponse()` |
| `gateway Reconciliation Status` | `String` | | The status of gateway reconciliation. | `String getReconciliationStatus()` |
| `gateway Reconciliation Reason` | `String` | | The reason of gateway reconciliation. | `String getGatewayReconciliationReason()` |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
