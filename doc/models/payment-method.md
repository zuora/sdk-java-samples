
# PaymentMethod

Payment methods represent your customers' payment instruments and are the response returned by [GetPaymentMethod](/doc/payment-method.md#get-payment-method).

## Structure

`PaymentMethod`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `type` | [`Enum`](/doc/models/payment-method-type.md) | Required | The type of the PaymentMethod. | String getType() |
| `soldTo` | [`Contact`](/doc/models/contact.md) | Optional | A customer's soldTo address. | Contact getSoldTo() |
| `name` | `String` | Optional | The customer’s full name or business name. | String getName() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `crmId` | `String` | Optional | The identifier for this customer account in your CRM. | String getCrmId() |
| `currency` | [`String`](/doc/models/currency.md) | Optional | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | String getCurrency() |
| `parentAccount` | `String` | Optional | The identifier of the customer account that is the parent of this account. | String getParentAccount() |
| `paymentTerms` | `String` | Optional | Payment terms for this account. | String getPaymentTerms() |
| `invoices` | [`List<BillingDocument>`](/doc/models/billing-document.md) | Optional | A list of the account's invoices. | `List<BillingDocument>` getInvoices() |
| `subscriptions` | [`List<Subscription>`](/doc/models/subscription.md) | Optional | A list of the account's subscriptions. | `List<Subscription>` getSubscriptions() |
| `batch` | `String` | Optional | The identifier of a bill run batch. | String getBatch() |
| `billCycleDay` | `Integer` | Optional | The day of the month on which your customer will be invoiced. For month end specify 31. | Integer getBillCycleDay() |

## Example (as JSON)

```json
{
    "id": "A-000001",
    "name": "Tien Tzuo",
    "billTo": {
        "firstName": "Tien",
        "lastName": "Tzuo",
        "email": "tien@zuora.com",
        "phone": "888 976 9056",
        "line_1": "680 Folsom Street, Floor 3",
        "city": "San Francisco",
        "postalCode": "94107",
        "state": "CA",
        "country": "US"
    },
    "crmId" : "C-000345",
    "currency" : "USD",
    "parentAccount" : "A-000001",
    "paymentTerms": "30",
    "batch": "2",
    "billCycleDay": 31
}
```
