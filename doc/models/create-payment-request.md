# Create Payment Request

Describes a request to create a payment using
[CreatePayment](/doc/payment-api.md#create-payment).

## Fields

| Name | Type | Tags | Description | Getters
|  --- | --- | --- | --- | --- |
| `account` | `String` | Optional | The ID of the customer account that the payment is created for. | `String getAccount()` |
| `amount` | `Double` | Required | The total amount of the payment. | `Double getAmount()`|
| `authorisationCode` | `String` | Required | The authorization transaction ID from the payment gateway. Use this field for electronic payments, such as credit cards. | `String getAuthorisationCode()`|
| `description` | `String` | Optional | Additional information related to the payment. | `String getDescription()`|
| `currency` | `String` | Required | A currency defined in the web-based UI administrative settings. | `String getCurrency()`|
| `date` | `Date` | Optional | The date when the payment takes effect, in `yyyy-mm-dd` format. | `String getDate()`|
| `gatewayOptions` | `Map<String, String>` | Optional | The field used to pass gateway-specific parameters and parameter values. | `Map<String, String> getGatewayOptions()`|
| `financeInformation` | `PaymentCreateRequestFinanceInformation` | Optional | Container for the finance information related to the payment. | `PaymentCreateRequestFinanceInformation getFinanceInformation()`|
| `gateway` | `String` | Optional, Required | The ID of the gateway instance that processes the payment. The ID must be a valid gateway instance ID and this gateway must support the specific payment method. When creating electronic payments, this field is required. When creating external payments, this field is optional. | `String getGateway()`|
| `paymentMethod` | `String` | Optional | The unique ID of the payment method that the customer used to make the payment.  If no payment method ID is specified in the request body, the default payment method for the customer account is used automatically. If the default payment method is different from the type of payments that you want to create, an error occurs. | `String getPaymentMethod()`|
| `gatewayOrderId` | `String` | Optional | A merchant-specified natural key value that can be passed to the electronic payment gateway when a payment is created. If not specified, the payment number will be passed in instead. Gateways check duplicates on the gateway order ID to ensure that the merchant do not accidentally enter the same transaction twice. This ID can also be used to do reconciliation and tie the payment to a natural key in external systems. The source of this ID varies by merchant. Some merchants use their shopping cart order IDs, and others use something different. Merchants use this ID to track transactions in their eCommerce systems. | `String getGatewayOrderId`|
| `reference` | `String` | Optional | The transaction ID returned by the payment gateway. Use this field to reconcile payments between your gateway and Zuora Payments. | `String getReference()`|
| `statementDescriptor` | `String` | Optional | A payment gateway-specific field that maps to Zuora for the gateways, Orbital, Vantiv and Verifi. | `String getStatementDescriptor()`|
| `softDescriptorPhone` | `String` | Optional | A payment gateway-specific field that maps to Zuora for the gateways, Orbital, Vantiv and Verifi. | `String getSoftDescriptorPhone()`|
| `external` | `Boolean` | Required | If true the payment is external. | `Boolean isExternal()`
| `customFields` | `Map<String, Object>` | Optional | Custom fields used to create a payment. | `Map<String, Object> getCustomFields()`|
