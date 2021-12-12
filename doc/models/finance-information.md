# Finance information

Represents payment finance information.

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `transferredToAccounting` | [`Enum`](/doc/models/transferred-to-accounting.md) | Optional | Indicates whether a payment has been transferred to an external accounting system. | String getTransferredToAccounting() |
| `unappliedPaymentAccountingCode` | `String` | Optional | The accounting code for the unapplied payment. | String getUnappliedAccountingCode() |
| `unappliedPaymentAccountingCodeType` | `String` | Optional | The accounting code for the unapplied payment. | String getUnappliedAccountingCodeType() |
| `bankAccountAccountingCode` | `String` | Optional | The type of the accounting code for the unapplied payment. | String getBankAccountAccountingCode() |
| `bankAccountAccountingCodeType` | `String` | Optional | The type of the accounting code that maps to a bank account in your accounting system. | String getBankAccountAccountingCodeType() |
