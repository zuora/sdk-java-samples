# Billing Document State

Represents the state of a billing document.

## Enumeration

`BillingDocumentState`

## Fields

| Name | Description |
|  --- | --- |
| `DRAFT` | The starting state for all billing documents - you can still edit the billing document at this point. |
| `POSTED` | The billing document has been posted, and is either awaiting settlement or has been settled - you can no longer edit it.  |
| `CANCELED` | The billing document was a mistake and has been cancelled. |
