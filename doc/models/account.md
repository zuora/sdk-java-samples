
# Account

Accounts represent your customers and are the response returned by [CreateAccount](/doc/account-api.md#create-account), [UpdateAccount](/doc/account-api.md#update-account), [GetAccount](/doc/account-api.md#get-account) and [DeleteAccount](/doc/account-api.md#delete-account).


## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | `String getId()` |
| `accountKey` | `String` |  | A unique customer account key. | `String getAccountKey()`
| `name` | `String` |  | The name of the customer account. | `String getName()`
| `billCycleDay` | [`Enum`](/doc/models/bill-cycle-day.md) |  | The day of the month on which your customer will be invoiced. For month-end specify `_31`. | `String getBillCycleDay()`
| `currency` | [`Enum`](/doc/models/currency.md) |  | Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html). Must be a currency you have enabled. | `String getCurrency()` |
| `autoPay` | `Boolean` |  | | `String getAutoPay()` |
| `billTo` | [`Contact`](/doc/models/contact.md) |  | The contact details of the person who shall be charged for goods or services. | `Contact getBillTo()` |
| `soldTo` | [`Contact`](/doc/models/contact.md) |  | The the contact details of the person who is sold goods and services. If not supplied, the bill to details are applied.  | `Contact getSoldTo()` |
| `parentAccount` | `String` |  | The identifier of the customer account that owns this account's invoices. | `String getParentAccount()` |
| `crmId` | `String` |  | The identifier for this customer account in your CRM. | `String getCrmId()` |
| `paymentTerms` | `String` |  |  | `String getPaymentTerms()` |
| `description` | `String` |  | An arbitrary string attached to the object. Often useful for displaying to users. | `String getDescription()` |
| `batch` | `String` |  | The identifier of a bill run batch. | `String getBatch()` |
| `balance` | `String` |  | The customer's total invoice balance minus credit balance. | `String getBalance()` |
| `contractedMrr` | `String` |  | Future expected MRR that accounts for future upgrades, downgrades, upsells and cancellations. | `String getContractedMrr()` |
| `creditBalance` | `String` |  | Current credit balance. | `String getCreditBalance()` |
| `totalDebitMemoBalance` | `String` |  | Total balance of all posted debit memos. | `String getDebitMemoBalance()` |
| `totalInvoiceBalance` | `String` |  | Total balance of all posted invoices. | `String getInvoiceBalance()` |
| `unappliedCreditMemoAmount` | `String` |  | Total unapplied amount of all posted credit memos. | `String getUnappliedCreditAmount()` |
| `unappliedPaymentAmount` | `String` |  | Total unapplied amount of all payments. | `String getUnappliedPaymentAmount()` |
| `taxIdentifier` | [`TaxIdentifier`](/doc/models/tax-identifier.md) |  || `TaxIdentifier getTaxIdentifier()` |
| `taxCertificate` | [`TaxCertificate`](/doc/models/tax-certificate.md) |  || `TaxCertificate getTaxCertificate()` |
| `billingDocument Settings` | [`BillingDocument Settings`](/doc/models/billing-document-settings.md) |  | `BillingDocument Settings getBillingDocument Settings()` |
| `customFields` | `Map<String, Object>` |  | Custom fields. | `Map<String, Object> getCustomFields()`|

## Methods

* [Get invoices](/doc/models/account.md#get-invoices)
* [Get subscriptions](/doc/models/account.md#get-subscriptions)
* [Get payments](/doc/models/account.md#get-payments)
* [Get payment methods](/doc/models/account.md#get-payment-methods)


# Get Invoices


```java
List<BillingDocument> invoices = account.getInvoices();
```
## Returns

[`List<BillingDocument>`](/doc/models/billing-document.md)



# Get Subscriptions

```java
List<Subscription> subscriptions = account.getSubscriptions();
```

## Returns

[`List<Subscription>`](/doc/models/subscription.md)


# Get Payments

```java
List<Payment> payments = account.getPayments();
```

## Returns

[`List<Payment>`](/doc/models/payment.md)


# Get Payment Methods

```java
List<PaymentMethod> paymentMethods = account.getPaymentMethods();
```

## Returns

[`List<PaymentMethod>`](/doc/models/payment-method.md)
