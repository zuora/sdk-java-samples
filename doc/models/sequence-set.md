# Sequence Set

These objects represent distinct numbering sequences for billing documents, payments, and refunds. Billing documents include invoices, credit memos, and debit memos.

## Class Name

`SequenceSet`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `name` | `String` | Required | An arbitrary name for the object. | String getName() |
| `invoice` | [`Sequence`](/doc/models/sequence.md) | Required | Container for the prefix and starting document number of invoices. | String getInvoice() |
| `creditMemo` | [`Sequence`](/doc/models/sequence.md) | Required | Container for the prefix and starting document number of credit memos. | String getCreditMemo() |
| `debitMemo` | [`Sequence`](/doc/models/sequence.md) | Required | Container for the prefix and starting document number of debit memos. | String getDebitMemo() |
| `payment` | [`Sequence`](/doc/models/sequence.md) | Optional | Container for the prefix and starting document number of payments. | String getPayment() |
| `refund` | [`Sequence`](/doc/models/sequence.md) | Optional | Container for the prefix and starting document number of refunds. | String getRefund() |
