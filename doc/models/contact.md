# Contact

Contacts represent [Account](/doc/models/account.md) contacts as well as billTo and shipTo addresses.


## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | The contact's id. | String getId() |
| `firstName` | `String` |  | The contact's first name. | String getFirstName() |
| `lastName` | `String` |  | The contact's last name. | String getLastName() |
| `phone` | `String` |  | The contact's phone number. | String getPhone() |
| `email` | `String` |  | The contact's email address. | String getEmail() |
| `workEmail` | `String` |  | The contact's work email address. | String getWorkEmail() |
| `account` | `String` |  | The customer the contact is associated with. | String getAccount() |
| `address` | [`Address`](/doc/models/address.md) |  | The contact's address. | String getAddress() |
| `customFields` | `Map<String, Object>` |  | Custom fields. | `Map<String, Object> getCustomFields()`|
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the contact was created | ZonedDateTime getCreateTime() |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the contact was last updated | ZonedDateTime getUpdateTime() |
| `createdBy` | `String` | ReadOnly | The Id of the user that created the contact | String getCreatedBy() |
| `updatedBy` | `String` | ReadOnly | The Id of the user that last updated the contact | String getUpdatedBy() |
