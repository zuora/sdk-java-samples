
# Create Account Request

Describes a request to create an account using
[CreateAccount](/doc/account.md#create-account).

## Structure

`CreateAccountRequest`

## Fields

| Name | Type | Tags | Description | Getters
|  --- | --- | --- | --- | --- |
| `id` | `String` | Optional | Unique identifier for the object. If not provided, an identifier will be randomly generated.<br>**Constraints**: *Maximum Length*: `50` | String getId() |
| `name` | `String` | Required | The name of the customer account.<br>**Constraints**: *Maximum Length*: `255` | String getName() | `billTo` | [`Contact`](/doc/models/contact.md) | Optional | A customer's billing address. | Contact getBillTo() |
| `soldTo` | [`Contact`](/doc/models/contact.md) | Optional | A customer's soldTo address. | Contact getSoldTo() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() | 
| `crmId` | `String` | Optional | The identifier for this customer account in your CRM. | String getCrmId() |
| `currency` | [`String`](/doc/models/currency.md) | Optional | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | String getCurrency() |
| `parentAccount` | `String` | Optional | The identifier of the customer account that owns this account's invoices. | String getParentAccount() |
| `daysUntilDue` | [`DaysUntilDue`](/doc/models/days-until-due.md) | Optional | Payment terms for this account. |
| `batch` | `String` | Optional | The identifier of a bill run batch. |
| `billCycleDay` | `Integer` | Optional | The day of the month on which your customer will be invoiced. For month end specify 31. |

## Example (as JSON)

```json
{ 
  "id": "VDKXEEKPJN48QDG3BGGFAK05P8",
  "name": "Tien Tzuo",
  "billTo": {
    "firstName": "Tien",
    "lastName": "Tzuo",
    "line1": "680 Folsom Street, Floor 3",
    "city": "San Francisco",
    "state": "CA",
    "postalCode": "94107",
    "country": "US"
  }
}
```
