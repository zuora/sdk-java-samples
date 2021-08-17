# Sequence

These objects represent numbering sequences for billing documents, payments, or refunds. Billing documents include invoices, credit memos, and debit memos.

## Class Name

`Sequence`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `prefix` | `String` | Required | The document number prefix. | String getPrefix() |
| `startNumber` | `Integer` | Required | The starting number in a sequence of document numbers. | Integer getStartNumber() |
