# Invoice Write Off Request

Describes a request to write off an invoice using [CreatePayment](/doc/payment-api.md#create-payment).

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
| `financeInformation` | [`FinanceInformation`](/doc/models/finance-information.md) | Optional | Payment finance information. | 
| `paymentMethod` | `String` | Optional | Unique identifier of the payment method used to make the payment. |
| `gatewayOrderId` | `String` | Optional | A merchant-specified natural key value that can be passed to the payment gateway when a payment is created. If not specified, a payment number will be passed in instead. | 
| `reference` | `String` | Optional | Transaction identifier returned by your payment gateway. Use this field to reconcile payments between your gateway and Zuora Payments. | 
| `statementDescriptor` | `String` | Optional | A payment gateway-specific field that maps to Zuora for the gateways Orbital, Vantiv and Verifi. | 
| `softDescriptorPhone` | `String` | Optional | A payment gateway-specific field that maps to Zuora for the gateways Orbital, Vantiv and Verifi. | 
| `external` | `Boolean` | Required | If `true` the payment is external. | 
| `customFields` | `Map<String, Object>` | Optional | Custom fields used to create a payment. | 
