
# Create Account Request

Describes a request to create an account using
[CreateAccount](/doc/account-api.md#create-account).

## Fields

| Name | Type | Tags | Description | Getters
|  --- | --- | --- | --- | --- |
| `accountKey` | `String` | Required | The unique customer account key.<br>**Constraints**: *Maximum Length*: `255` | String getAccountKey()
| `name` | `String` | Required | The name of the customer account.<br>**Constraints**: *Maximum Length*: `255` | String getName() 
| `billCycleDay` | `Integer` | Optional | The day of the month on which your customer will be invoiced. For month end specify 31. | Integer getBillCycleDay() 
| `currency` | [`String`](/doc/models/currency.md) | Optional | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | String getCurrency() |
| `autoPay` | `Boolean` | Optional | | String getAutoPay() |
| `billTo` | [`ContactCreateRequest`](/doc/models/contact-create-request.md) | Required | A customer's billing address. | Contact getBillTo() |
| `soldTo` | [`ContactCreateRequest`](/doc/models/contact-create-request.md) | Optional | A customer's soldTo address. (defaults to billTo if none is set) | Contact getSoldTo() |
| `parentAccount` | `String` | Optional | The identifier of the customer account that owns this account's invoices. | String getParentAccount() |
| `crmId` | `String` | Optional | The identifier for this customer account in your CRM. | String getCrmId() |
| `paymentTerms` | `String` | Optional |  | String getPaymentTerms() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `paymentMethod` | `String` | Optional | | String getPaymentMethod() |
| `batch` | `String` | Optional | The identifier of a bill run batch. |
| `taxIdentifier` | [`TaxIdentifier`](/doc/models/tax-identifier.md) | Optional | |
| `taxCertificate` | [`TaxCertificate`](/doc/models/tax-certificate.md) | Optional | |
| `billingDocumentSettings` | [`BillingDocumentSettings`](/doc/models/billing-document-settings.md) | Optional | |
| `customFields` | `Map<String, Object>` | Optional | Custom fields used to create an account. | `Map<String, Object> getCustomFields()`|
