
# Create Payment Method Request

Describes a request to create a payment method using [CreatePaymentMethod](/doc/payment-method-api.md#create-payment-method).

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- | 
| `type` | [`Enum`](/doc/models/payment-method-type.md) | Required | The type of the PaymentMethod. | 
| `accountKey` | `String` | Optional | A customer account key. | 
| `billingDetails` | [`BillingDetails`](/doc/models/billing-details.md) | Optional | . | 
| `card` | [`CreditCard`](/doc/models/credit-card.md) | Optional | . | 
| `isDefault` | `Boolean` | Optional | Indicates whether this is the default payment method for a customer account. | 
| `mitConsentAgreementRef` | `String` | Optional | Your reference for the stored credential consent agreement that you have established with your customer. | 
| `mitConsentAgreementSrc` | `String` | Optional | . | 
| `mitNetworkTransactionId` | `String` | Optional | . | 
| `mitProfileAction` | [`Enum`](/doc/models/mit-profile-action.md) | Optional | . | 
| `mitProfileAgreementOn` | `String` | Optional | . | 
| `mitProfileType` | [`Enum`](/doc/models/mit-profile-type.md) | Optional | . | 
| `IBAN` | `String` | Optional | International Bank Account Number used to create SEPA_DEBIT payment methods. | 
| `accountNumber` | `String` | Optional | The number of the customer's bank account. Used with Direct Debit payment methods. | 
| `bankCode` | `String` | Optional | The sort code or number that identifies the bank. | 
| `bankName` | `String` | Optional | The name of the bank where the ACH payment account is held. | 
| `branchCode` | `String` | Optional | The branch code of the bank. Used with Direct Debit payment methods. | 
| `businessIdentificationCode` | `String` | Optional | The BIC code. Used with SEPA_DEBIT payment methods. | 
| `identityNumber` | `String` | Optional | The identity number used for bank transfer. | 
| `accountName` | `String` | Optional | The name on the Direct Debit bank account or ACH. Use this field for Direct Debit or ACH payment methods. |
| `accountType` | [`BankAccountType`](/doc/models/bank-account-type.md) | Optional | The type of bank account associated with an ACH payment. | 
| `BAID` | `String` | Optional | ID of a PayPal billing agreement. For example, I-1TJ3GAGG82Y9. | 
| `email` | `String` | Optional | Email address associated with the payment method. This is required with a PayPal Express Checkout or a PayPal Adaptive payment method. | 
| `preapprovalKey` | `String` | Optional | The PayPal preapproval key. | 
| `mandateId` | `String` | Optional | The mandate id. | 
| `mandateReceivedStatus` | `String` | Optional | Indicates whether the mandate has been received from the gateway. Possible values `true` or `false`. | 
| `existingMandateStatus` | `String` | Optional | Indicates whether the mandate is an existing mandate. Possible values `true` or `false`. | 
| `mandateCreationDate` | `String` | Optional | The date on which the mandate was updated. | 
| `mandateStatus` | `String` | Optional | The gateway status of the mandate. | 
| `mandateReason` | `String` | Optional | The gateway mandate reason. | 
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | 
