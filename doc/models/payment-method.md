
# PaymentMethod

Payment methods represent your customers' payment instruments and are the response returned by [GetPaymentMethod](/doc/payment-method-api.md#get-payment-method).

## Structure

`PaymentMethod`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `type` | [`Enum`](/doc/models/payment-method-type.md) | Required | The type of the PaymentMethod. | String getType() |
| `accountKey` | `String` | Optional | A customer account key. | String getAccountKey() |
| `billingDetails` | [`BillingDetails`](/doc/models/billing-details.md) | Optional | . | String getBillingDetails() |
| `card` | [`CreditCard`](/doc/models/credit-card.md) | Optional | . | CreditCard getCard() |
| `isDefault` | `Boolean` | Optional | Indicates whether this is the default payment method for a customer account. | Boolean getIsDefault() |
| `mitConsentAgreementRef` | `String` | Optional | Your reference for the stored credential consent agreement that you have established with your customer. | String getMitConsentAgreementRef() |
| `mitConsentAgreementSrc` | `String` | Optional | . | String getMitConsentAgreementSrc() |
| `mitNetworkTransactionId` | `String` | Optional | . | String getMitNetworkTransactionId() |
| `mitProfileAction` | [`Enum`](/doc/models/mit-profile-action.md) | Optional | . | String getMitProfileAction() |
| `mitProfileAgreementOn` | `String` | Optional | . | String getMitProfileAgreementOn() |
| `mitProfileType` | [`Enum`](/doc/models/mit-profile-type.md) | Optional | . | String getMitProfileType() |
| `IBAN` | `String` | Optional | International Bank Account Number used to create SEPA_DEBIT payment methods. | String getIBAN() |
| `accountNumber` | `String` | Optional | The number of the customer's bank account. Used with Direct Debit payment methods. | String getaccountNumber() |
| `bankCode` | `String` | Optional | The sort code or number that identifies the bank. | String getbankCode() |
| `bankName` | `String` | Optional | The name of the bank where the ACH payment account is held. | String getbankName() |
| `branchCode` | `String` | Optional | The branch code of the bank. Used with Direct Debit payment methods. | String getbranchCode() |
| `businessIdentificationCode` | `String` | Optional | The BIC code. Used with SEPA_DEBIT payment methods. | String getbusinessIdentificationCode() |
| `identityNumber` | `String` | Optional | The identity number used for bank transfer. | String getIdentityNumber() |
| `accountName` | `String` | Optional | The name on the Direct Debit bank account or ACH. Use this field for Direct Debit or ACH payment methods. | String getAccountName() |
| `accountType` | [`BankAccountType`](/doc/models/bank-account-type.md) | Optional | The type of bank account associated with an ACH payment. | String getAccountType() |
| `BAID` | `String` | Optional | ID of a PayPal billing agreement. For example, I-1TJ3GAGG82Y9. | String getBAID() |
| `email` | `String` | Optional | Email address associated with the payment method. This is required with a PayPal Express Checkout or a PayPal Adaptive payment method. | String getEmail() |
| `preapprovalKey` | `String` | Optional | The PayPal preapproval key. | String getPreapprovalKey() |
| `mandateId` | `String` | Optional | The mandate id. | String getMandateId() |
| `mandateReceivedStatus` | `String` | Optional | Indicates whether the mandate has been received from the gateway. Possible values `true` or `false`. | String getMandateReceivedStatus() |
| `existingMandateStatus` | `String` | Optional | Indicates whether the mandate is an existing mandate. Possible values `true` or `false`. | String getExistingMandateStatus() |
| `mandateCreationDate` | `String` | Optional | The date on which the mandate was updated. | String getMandateCreationDate() |
| `mandateStatus` | `String` | Optional | The gateway status of the mandate. | String getMandateStatus() |
| `mandateReason` | `String` | Optional | The gateway mandate reason. | String getMandateReason() |
| `state` | [`Enum`](/doc/models/payment-method-state.md)  | Optional | . | PaymentMethodState getState() |
