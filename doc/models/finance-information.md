# Finance information

Represents payment finance information.

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `transferredToAccounting` | [`Enum`](/doc/models/transferred-to-accounting.md) | Optional | Indicates whether a payment has been transferred to an external accounting system. | String getTransferredToAccounting() |
| `unappliedPaymentAccountingCode` | `String` | Optional | The accounting code for the unapplied payment. | String getUnappliedAccountingCode() |
| `bankAccountAccountingCode` | `String` | Optional | The accounting code that maps to a bank account in your accouting system. | String getBankAccountAccountingCode() |
