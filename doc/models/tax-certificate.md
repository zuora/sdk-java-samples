# Tax Certificate

Represents a customer [Account](/doc/account-api.md) tax certificate.

## Class Name

`TaxCertificate`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | Required | The tax certificate identifier. | String getId() |
| `companyCode` | `String` | Optional | Unique code that identifies a company account in Avalara. Use this field to calculate taxes based on country of origin and sold-to addresses in Avalara. | String getCompanyCode() |
| `startDate` | `String` | Required | The tax certificate start date, in LocalDate format. | String getStartDate() |
| `endDate` | `String` | Required | The tax certificate end date, in LocalDate format. | String getEndDate() |
| `state` | [`TaxCertificateStatus`](/doc/models/tax-certificate-state.md) | Optional<br>ReadOnly | If the tax certificate has been verified. One of `VERIFIED` or `PENDING`. | TaxCertificateStatus getState() |
| `issuingJurisdiction` | `String` | Required | Issuing jurisdiction. | String getIssuingJurisdiction()
