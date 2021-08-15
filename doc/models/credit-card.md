# Credit card

Represents the user's card details.

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `last4` | `String` | Optional | The last four digits of the card. | String getLast4() |
| `brand` | [`CardBrand`](/doc/models/card-brand.md) | Optional | The card brand. | String getBrand() |
| `expiryMonth` | `String` | Optional | Two-digit number representing the card’s expiration month. | String getExpiryMonth() |
| `expiryYear` | `String` | Optional | Two-digit number representing the card’s expiration year. | String getExpiryYear() |
