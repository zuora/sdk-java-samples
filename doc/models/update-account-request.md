
# Update Account Request

Describes a request to update an account using
[UpdateAccount](/doc/account.md#update-account).

## Structure

`UpdateAccountRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `name` | `String` | Optional | The name of the customer account.<br>**Constraints**: *Maximum Length*: `255` | String getName() |
| `billTo` | [`Contact`](/doc/models/contact.md) | Optional | A customer's billing address. | Contact getBillTo() |
| `soldTo` | [`Contact`](/doc/models/contact.md) | Optional | A customer's soldTo address. | Contact getSoldTo() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `billingDocumentSettings` | [`BillingDocumentSettings`](/doc/models/billing-document-settings.md) | Optional | Settings for billing documents. | BillingDocumentSettings getBillingDocumentSettings() |
| `crmId` | `String` | Optional | The identifier for this customer account in your CRM. | String getCrmId() |
| `currency` | [`String`](/doc/models/currency.md) | Optional | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a supported currency. | String getCurrency() |
| `invoiceOwner` | `String` | Optional | The identifier of the customer account that owns this account's invoices. | String getInvoiceOwner() |
| `daysUntilDue` | [`DaysUntilDue`](/doc/models/days-until-due.md) | Optional | Payment terms for this account. | String getDaysUntilDue() |
| `taxCertificate` | [`TaxCertificate`](/doc/models/tax-certificate.md) | Optional | Tax certificate for this account. | String getTaxCertificate() |
| `taxIdentifier` | [`TaxIdentifier`](/doc/models/tax-identifier.md) | Optional | Tax identifier for this account. | String getTaxIdentifier() |
| `batch` | `String` | Optional | The identifier of a bill run batch. | String getBatch() |
| `recurringOn` | `Integer` | Optional | The day of the month on which your customer will be invoiced. For month end specify 31. | String getRecurringOn() |

## Example (as JSON)

```json
{ 
  "name": "Tien Tzuo",
  "billTo": {
    "firstName": "Tien",
    "lastName": "Tzuo",
    "address": {
      "line1": "680 Folsom Street, Floor 3",
      "city": "San Francisco",
      "state": "CA",
      "postalCode": "94107",
      "country": "US"
    }
  }
}
```
