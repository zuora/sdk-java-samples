
# PaymentMethod

Payment methods represent your customers' payment instruments and is the response returned by [GetPaymentMethod](/doc/payment-method.md#get-payment-method).

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


## Example (as JSON)

```json
{
    "id": "A-000001"
}
```
