# Billing Document Settings

Represents the billing document configuration settings for a customer [Account](/doc/account-api.md).

## Structure

`BillingDocumentSettings`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `creditMemoTemplate` | `String` | Optional | Unique identifier of a credit memo template. | String getCreditMemoTemplate() |
| `invoiceTemplate` | `String` | Optional | Unique identifier of an invoice template. | String getInvoiceTemplate() |
| `debitMemoTemplate` | `String` | Optional | Unique identifier of a debit memo template. | String getDebitMemoTemplate() |
| `additionalEmail` | `List<String>` | Optional | Additional email addresses. | `List<String>` getAdditionalEmail() |
| `email` | `Boolean` | Optional | If 'true' invoices with payment instructions will be sent by email. | Boolean getEmail() |
| `print` | `Boolean` | Optional | If 'true' printed invoices will be sent by mail. | Boolean getPrint() |
