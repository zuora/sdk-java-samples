
# Account

Accounts represent your customers and are the response returned by [CreateAccount](/doc/account-api.md#create-account), [UpdateAccount](/doc/account-api.md#update-account), [GetAccount](/doc/account-api.md#get-account) and [DeleteAccount](/doc/account-api.md#delete-account).


## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | `String getId()` |
| `accountKey` | `String` | Required | The unique customer account key.<br>**Constraints**: *Maximum Length*: `255` | `String getAccountKey()`
| `name` | `String` | Required | The name of the customer account.<br>**Constraints**: *Maximum Length*: `255` | `String getName()`
| `billCycleDay` | [`Enum`](/doc/models/bill-cycle-day.md) | Optional | The day of the month on which your customer will be invoiced. For month end specify 31. | `String getBillCycleDay()`
| `currency` | [`Enum`](/doc/models/currency.md) | Optional | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | `String getCurrency()` |
| `autoPay` | `Boolean` | Optional | | `String getAutoPay()` |
| `billTo` | [`Contact`](/doc/models/contact.md) | Required | The contact details of the person who shall charged for goods or services. | `Contact getBillTo()` |
| `soldTo` | [`Contact`](/doc/models/contact.md) | Optional | The the contact details of the person who is sold goods and services. If not supplied, the bill to details are applied.  | `Contact getSoldTo()` |
| `parentAccount` | `String` | Optional | The identifier of the customer account that owns this account's invoices. | `String getParentAccount()` |
| `crmId` | `String` | Optional | The identifier for this customer account in your CRM. | `String getCrmId()` |
| `paymentTerms` | `String` | Optional |  | `String getPaymentTerms()` |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | `String getDescription()` |
| `batch` | `String` | Optional | The identifier of a bill run batch. | `String getBatch()` |
| `taxIdentifier` | [`TaxIdentifier`](/doc/models/tax-identifier.md) | Optional || `TaxIdentifier getTaxIdentifier()` |
| `taxCertificate` | [`TaxCertificate`](/doc/models/tax-certificate.md) | Optional || `TaxCertificate getTaxCertificate()` |
| `billingDocument Settings` | [`BillingDocument Settings`](/doc/models/billing-document-settings.md) | Optional | `BillingDocument Settings getBillingDocument Settings()` |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|

## Methods

* [Get invoices](/doc/models/account.md#get-invoices)
* [Get subscriptions](/doc/models/account.md#get-subscriptions)
* [Get payments](/doc/models/account.md#get-payments)
* [Get payment methods](/doc/models/account.md#get-payment-methods)


# Get Invoices

```java
List<BillingDocument> invoices = account.getInvoices();
```

## Response Type

[`List<BillingDocument>`](/doc/models/billing-document.md)


# Get Subscriptions

```java
List<Subscription> subscriptions = account.getSubscriptions();
```

## Response Type

[`List<Subscription>`](/doc/models/subscription.md)


# Get Payments

```java
List<Payment> payments = account.getPayments();
```

## Response Type

[`List<Payment>`](/doc/models/payment.md)


# Get Payment Methods

```java
List<PaymentMethod> paymentMethods = account.getPaymentMethods();
```

## Response Type

[`List<PaymentMethod>`](/doc/models/payment-method.md)
