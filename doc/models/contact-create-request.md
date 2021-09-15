# Contact Create Request

Contacts represent [Account](/doc/models/account.md) contacts and [Account](/doc/models/account.md) billing and shipping addresses.

## Fields

| Name | Type | Tags | Description | 
|  --- | --- | --- | --- | 
| `firstName` | `String` | Required | The contact's first name. | 
| `lastName` | `String` | Required | The contact's last name. | 
| `phone` | `String` | Optional | The contact's phone number. | 
| `email` | `String` | Optional | The contact's email address. | 
| `workEmail` | `String` | Optional | The contact's work email address. | 
| `account` | `String` | Optional |  | 
| `address` | [`Address`](/doc/models/address.md) | Optional |  
| `customFields` | `Map<String, Object>` | Optional | Custom fields used to create a contact. | 
