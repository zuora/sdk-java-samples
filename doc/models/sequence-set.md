# Sequence Set

These objects represent distinct numbering sequences for billing documents, payments, and refunds. Billing documents include invoices, credit memos, and debit memos.

## Structure

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

## Example (as JSON)

```json
{
  "id": "6c10c7be23f54b8a9f527fcdaec7ae2f",
  "name": "Sequence Set #1",
  "invoice": {
      "prefix": "AA-",
      "startNumber": 1
  },
  "creditMemo": {
      "prefix": "CM-",
      "startNumber": 1
  },
  "debitMemo": {
      "prefix": "DM-",
      "startNumber": 1
  },
  "payment": {
      "prefix": "PAYMENT-",
      "startNumber": 1
  },
  "refund": {
      "prefix": "REFUND-",
      "startNumber": 1
  }
}
```
