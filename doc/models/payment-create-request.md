# Payment Create Request

Describes a request to create a payment using
[CreatePayment](/doc/payment-api.md#create-payment).

## Fields

| Name | Type | Tags | Description 
|  --- | --- | --- | --- | 
| `account` | `String` | Optional | Customer account ID. | 
| `amount` | `Double` | Required | The total amount of the payment. | 
| `authorisationCode` | `String` | Required | An authorization transaction ID from the payment gateway. | 
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | 
| `currency` | `String` | Required | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | 
| `date` | `LocalDate` | Optional | Date when the payment takes effect. | 
| `gatewayOptions` | `Map<String, String>` | Optional | Use to pass gateway-specific parameters and parameter values. | 
| `gateway` | `String` | Optional | Identifier of the payment gateway used to process the payment. | 
| `financeInformation` | [`FinanceInformation`](/doc/model/finance-information.md) | Optional | Container for the finance information related to the payment. | 
| `paymentMethod` | `String` | Optional | Unique identifier of the payment method used to make the payment. |
| `gatewayOrderId` | `String` | Optional | A merchant-specified natural key value that can be passed to the electronic payment gateway when a payment is created. If not specified, the payment number will be passed in instead. Gateways check duplicates on the gateway order ID to ensure that the merchant do not accidentally enter the same transaction twice. This ID can also be used to do reconciliation and tie the payment to a natural key in external systems. The source of this ID varies by merchant. Some merchants use their shopping cart order IDs, and others use something different. Merchants use this ID to track transactions in their eCommerce systems. | 
| `reference` | `String` | Optional | Transaction identifier returned by your payment gateway. Use this field to reconcile payments between your gateway and Zuora Payments. | 
| `statementDescriptor` | `String` | Optional | A payment gateway-specific field that maps to Zuora for the gateways Orbital, Vantiv and Verifi. | 
| `softDescriptorPhone` | `String` | Optional | A payment gateway-specific field that maps to Zuora for the gateways Orbital, Vantiv and Verifi. | 
| `external` | `Boolean` | Required | If `true` the payment is external. | 
| `customFields` | `Map<String, Object>` | Optional | Custom fields used to create a payment. | 
