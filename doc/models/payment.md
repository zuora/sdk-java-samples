# Payment

Payments are returned by
[CreatePayment](/doc/payment-api.md#create-payment),
and [GetPayment](/doc/payment-api.md#get-payment).


## Fields


| Name | Type | Tags | Description | Getters
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `account` | `String` | | The ID of the customer account that the payment is created for. | `String getAccount()`
| `amount` | `Double` | | The total amount of the payment. | `Double getAmount()`
| `amountApplied` | `Double` |  | The applied amount of the payment. | `Double getAmountApplied()`
| `amountUnapplied` | `Double` |  | The unapplied amount of the payment. | `Double getAmountUnapplied()`
| `amountRefunded` | `Double` |  | The amount of the payment that is refunded. | `Double getAmountRefunded()`
| `authorisationCode` | `String` | | The authorization transaction ID from the payment gateway. Use this field for electronic payments, such as credit cards. | `String getAuthorisationCode()`
| `description` | `String` | | Additional information related to the payment. | `String getDescription()`
| `currency` | `String` | | A currency defined in the web-based UI administrative settings. | `String getCurrency()`
| `date` | `Date` | | The date when the payment takes effect, in `yyyy-mm-dd` format. | `String getDate()`
| `name` | `String` | | The unique identification number of the payment. For example, P-00000001. | `String getName()`
| `gatewayOptions` | `Map<String, String>` | | The field used to pass gateway-specific parameters and parameter values. | `Map<String, String> getGatewayOptions()`
| `financeInformation` | `Payment Create Request Finance Information` | | Container for the finance information related to the payment. | `Payment Create Request Finance Information getFinanceInformation()`
| `gateway` | `String` | Optional, Required | The ID of the gateway instance that processes the payment. The ID must be a valid gateway instance ID and this gateway must support the specific payment method. When creating electronic payments, this field is required. When creating external payments, this field is optional. | `String getGateway()`
| `paymentMethod` | `String` | | The unique ID of the payment method that the customer used to make the payment.  If no payment method ID is specified in the request body, the default payment method for the customer account is used automatically. If the default payment method is different from the type of payments that you want to create, an error occurs. | `String getPaymentMethod()`
| `gatewayOrderId` | `String` | | A merchant-specified natural key value that can be passed to the electronic payment gateway when a payment is created. If not specified, the payment number will be passed in instead. Gateways check duplicates on the gateway order ID to ensure that the merchant do not accidentally enter the same transaction twice. This ID can also be used to do reconciliation and tie the payment to a natural key in external systems. The source of this ID varies by merchant. Some merchants use their shopping cart order IDs, and others use something different. Merchants use this ID to track transactions in their eCommerce systems. | `String getGatewayOrderId`
| `reference` | `String` | | The transaction ID returned by the payment gateway. Use this field to reconcile payments between your gateway and Zuora Payments. | `String getReference()`
| `statementDescriptor` | `String` | | A payment gateway-specific field that maps to Zuora for the gateways, Orbital, Vantiv and Verifi. | `String getStatementDescriptor()`
| `softDescriptorPhone` | `String` | | A payment gateway-specific field that maps to Zuora for the gateways, Orbital, Vantiv and Verifi. | `String getSoftDescriptorPhone()`
| `external` | `Boolean` | | If true the payment is external. | `Boolean isExternal()`
| `customFields` | `Map<String, Object>` | | Custom fields used to create a payment. | `Map<String, Object> getCustomFields()`
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the payment was created | `ZonedDateTime getCreateTime()` |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the payment was last updated | `ZonedDateTime getUpdateTime()` |
| `createdBy` | `String` | ReadOnly | The Id of the user that created the payment | `String getCreatedBy()` |
| `updatedBy` | `String` | ReadOnly | The Id of the user that last updated the payment | `String getUpdatedBy()` |
| `state` | `PaymentStatus` | | The status of the payment. | `PaymentStatus getState()` |
| `cancelTime` | `ZonedDateTime` | ReadOnly | The date and time when the payment was cancelled, in `yyyy-mm-dd hh:mm:ss` format. | `ZonedDateTime getCancelTime()` |
| `submitTime` | `ZonedDateTime` | ReadOnly | The date and time when the payment was submitted, in `yyyy-mm-dd hh:mm:ss` format. | `ZonedDateTime getSubmitTime()` |
| `secondPaymentReferenceId` | `String` | | The payout ID of the payment from the gateway side. | `String getSecondPaymentReferenceId()`
| `payoutId` | `String` | | The payout ID of the payment from the gateway side. | `String getPayoutId()` |
| `gatewayState` | `PaymentGatewayState` | | The status of the payment in the gateway; use for reconciliation. [MarkedForSubmission, Submitted, Settled, NotSubmitted, FailedToSettle] | `PaymentGatewayState getGatewayState()` |
| `markedForSubmissionOn` | `ZonedDateTime` | | The date and time when a payment was marked and waiting for batch submission to the payment process, in `yyyy-mm-dd hh:mm:ss` format. | `ZonedDateTime getMarkedForSubmissionOn()` |
| `gatewayResponseCode` | `String` | | The code returned from the payment gateway for the payment. This code is gateway-dependent. | `String getGatewayResponseCode()` |
| `gatewayResponse` | `String` | | The message returned from the payment gateway for the payment. This message is gateway-dependent. | `String getGatewayResponse()` |
| `gatewayReconciliationStatus` | `String` | | The status of gateway reconciliation. | ` | `getString()` |
| `gatewayReconciliationReason` | `String` | | The reason of gateway reconciliation. | `String getGatewayReconciliationReason()` |
| `financeInformation` | `Payment Finance Information` | | Container for the finance information related to the payment. | `Payment Finance Information getFinanceInformation()` |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
