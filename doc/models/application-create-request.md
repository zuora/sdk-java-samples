# Application Create Request

Describes a request to apply a credit memo to an invoice or debit memo using [Apply Credit Memo](/doc/billing-document-api.md#apply-credit-memo).

## Fields

| Name | Type | Tags | Description 
|  --- | --- | --- | --- | 
| `billingDocuments` | `String` | Optional | . | 
| `effectiveDate` | `LocalDate` | Required | The application effective date in <code>yyyy-mm-dd</code> format. | 
| `billingDocumentApplicationRequests` | `String` | Required | . | 
