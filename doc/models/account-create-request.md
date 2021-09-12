
# Create Account Request

Describes a request to create an account using
[CreateAccount](/doc/account-api.md#create-account).

## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- | 
| `accountKey` | `String` | Required | A unique customer account key.<br>**Constraints**: *Maximum Length*: `255` |
| `name` | `String` | Required | The name of the customer account.<br>**Constraints**: *Maximum Length*: `255` | 
| `billCycleDay` | [`Enum`](/doc/models/bill-cycle-day.md) | Optional | The day of the month on which your customer will be invoiced. For month end specify 31. |
| `currency` | [`String`](/doc/models/currency.md) | Optional | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. |
| `autoPay` | `Boolean` | Optional | |
| `billTo` | [`ContactCreateRequest`](/doc/models/contact-create-request.md) | Required | The contact details of the person who shall be charged for goods or services. | 
| `soldTo` | [`ContactCreateRequest`](/doc/models/contact-create-request.md) | Optional | The the contact details of the person who is sold goods and services. If not supplied, the bill to details are applied. |
| `parentAccount` | `String` | Optional | The identifier of the customer account that owns this account's invoices. |
| `crmId` | `String` | Optional | The identifier for this customer account in your CRM. |
| `paymentTerms` | `String` | Optional |  |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | 
| `paymentMethod` | `String` | Optional | |
| `batch` | `String` | Optional | The identifier of a bill run batch. |
| `taxIdentifier` | [`TaxIdentifier`](/doc/models/tax-identifier.md) | Optional | |
| `taxCertificate` | [`TaxCertificate`](/doc/models/tax-certificate.md) | Optional | |
| `billingDocumentSettings` | [`BillingDocumentSettings`](/doc/models/billing-document-settings.md) | Optional | |
| `customFields` | `Map<String, Object>` | Optional | Custom fields used to create an account. | `Map<String, Object> getCustomFields()`|
