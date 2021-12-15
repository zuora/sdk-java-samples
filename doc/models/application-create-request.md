# Application Create Request

Describes a request to apply a credit memo to an invoice or debit memo using [Apply Credit Memo](/doc/billing-document-api.md#apply-credit-memo).

## Fields

| Name | Type | Tags | Description 
|  --- | --- | --- | --- | 
| `billingDocuments` | [`List<BillingDocument>`](/doc/models/billing-document.md) | Optional | . | 
| `effectiveDate` | `ZonedDate` | Required | The application effective date in <code>yyyy-mm-dd</code> format. | 
| `billingDocumentApplicationRequests` | [`List<BillingDocumentApplicationRequest>`](/doc/models/billing-document-application-request.md) | Required | . | 
