# Tax Certificate

Represents a customer [Account](/doc/account-api.md) tax certificate.

## Structure

`TaxCertificate`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | Required | The tax certificate identifier. | String getId() |
| `companyCode` | `String` | Optional | Unique code that identifies a company account in Avalara. Use this field to calculate taxes based on country of origin and sold-to addresses in Avalara. | String getcompanyCode() |
| `startDate` | `String` | Required | The tax certificate start date, in LocalDate format. | String getStartDate() |
| `endDate` | `String` | Required | The tax certificate end date, in LocalDate format. | String getEndDate() |
| `taxAuthority` | `String` | Optional | Tax authority code. | String getTaxAuthority() |
| `state` | `String` | Optional<br>ReadOnly | If the tax certificate has been verified yet. Either verified or pending. | String getState() |

## Example (as JSON)

```json
{
  "id": "01F9E8XVBT3170FF8E2ATH7XS0",
  "companyCode": "",
  "startDate": "2021-01-01",
  "endDate": "2021-12-31",
  "taxAuthority": "06",
  "state": "verified"
}
```
