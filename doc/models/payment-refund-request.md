# Payment Refund Request

Describes a request to create a payment refund using
[RefundPayment](/doc/payment-api.md#refund-payment).

## Fields

| Name | Type | Tags | Description | Getters
| --- | --- | --- | --- | --- |
| `amount` | `Double` | Required | The total amount of the refund.   | `Double getAmount()` |
| `currency` | `String` | | A currency defined in the web-based UI administrative settings.  | `String getCurrency()` |
| `account` | `String` | | The billing account id.  | `String getAccount()` |
| `description` | `String` | | The refund description.  | `String getDescription()` |
| `paymentMethod` | `String` | | The unique ID of the payment method that the customer used to make the payment. This field is only required if you create a non-referenced refund. Character limit: 32   | `String getPaymentMethod()` |
| `type` | `MethodType` | Required | Indicates how an external refund was issued to a customer.   | `MethodType getType()` |
| `statementDescriptor` | `String` | | A payment gateway specific field that maps Zuora to other gateways .  | `String getStatementDescriptor()` |
| `external` | `Boolean` | Required | If true the refund is external.  | `Boolean getExternal()` |
| `reference` | `String` | | The transaction ID returned by the payment gateway. Use this field to reconcile refunds between your gateway and Zuora Payments. You can only update the reference ID for external refunds.  | `String getReference()` |
| `date` | `LocalDate` | | The date when the refund takes effect, in `yyyy-mm-dd` format.  | `LocalDate getDate()` |
| `reason` | `String` | | A code identifying the reason for the transaction. The value must be an existing reason code or empty. If you do not specify a value, Zuora uses the default reason code.  | `String getReason()` |
| `paymentId` | `String` | | The payment id which the refund is related to.  | `String getPaymentId()` |
| `customFields` | `MapStringObject` | | The custom fields you want to use in the request.  | `MapStringObject getCustomFields()` |
