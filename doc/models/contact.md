# Contact

Contacts represent [Account](/doc/models/account.md) contacts as well as billTo and shipTo addresses.

## Structure

`Contact`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `line1` | `String` | Optional | The first line of the address. | String getAddressLine1() |
| `line2` | `String` | Optional | The second line of the address, if any. | String getAddressLine2() |
| `city` | `String` | Optional | The city or town of the address. | String getCity() |
| `state` | `String` | Optional | The state of the address. | String getState() |
| `postalCode` | `String` | Optional | The address's postal code. | String getPostalCode() |
| `country` | [`String`](/doc/models/country.md) | Optional | Indicates the country associated with another entity, such as a business.<br>Values are in [ISO 3166-1-alpha-2 format](http://www.iso.org/iso/home/standards/country_codes.htm). | String getCountry() |
| `firstName` | `String` | Required | The contact's first name. | String getFirstName() |
| `lastName` | `String` | Required | The contact's last name. | String getLastName() |
| `email` | `String` | Optional | The contact's email address. | String getEmail() |
| `workEmail` | `String` | Optional | The contact's work email address. | String getWorkEmail() |
| `phone` | `String` | Optional | The contact's phone number. | String getPhone() |

## Example (as JSON)

```json
{
  "firstName": "Tien",
  "lastName": "Tzuo",
  "email": "tien@zuora.com",
  "phone": "888 976 9056",
  "line_1": "680 Folsom Street, Floor 3",
  "city": "San Francisco",
  "postalCode": "94107",
  "state": "CA",
  "country": "US"
}
```
