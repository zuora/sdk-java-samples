# Address

Represents a physical address.

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `line1` | `String` | Optional | The first line of the address. | String getAddressLine1() |
| `line2` | `String` | Optional | The second line of the address, if any. | String getAddressLine2() |
| `city` | `String` | Optional | The city or town of the address. | String getCity() |
| `state` | `String` | Optional | The state of the address. | String getState() |
| `postalCode` | `String` | Optional | The address's postal code. | String getPostalCode() |
| `country` | [`String`](/doc/models/country.md) | Optional | Indicates the country associated with another entity, such as a business.<br>Values are in [ISO 3166-1-alpha-2 format](http://www.iso.org/iso/home/standards/country_codes.htm). | String getCountry() |
