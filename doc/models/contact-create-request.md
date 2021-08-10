# Contact

Contacts represent [Account](/doc/models/account.md) contacts as well as billTo and shipTo addresses.

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `firstName` | `String` | Required | The contact's first name. | String getFirstName() |
| `lastName` | `String` | Required | The contact's last name. | String getLastName() |
| `phone` | `String` | Optional | The contact's phone number. | String getPhone() |
| `email` | `String` | Optional | The contact's email address. | String getEmail() |
| `workEmail` | `String` | Optional | The contact's work email address. | String getWorkEmail() |
| `account` | `String` | Optional |  | String getAccount() |
| `address` | [`Address`](/doc/models/address.md) | Optional |  | String getAddress() |
