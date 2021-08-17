# Tier

An element representing a pricing tier.

## Class Name

`Tier`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `amount` | [`Money`](/doc/models/money.md) | Optional | The flat billing amount for an entire tier, regardless of the number of units in the tier. | Money getAmount() |
| `tier` | `Integer` | Required | Specifies the level of the tier. | Integer getTier() |
| `upTo` | `Integer` | Optional | Specifies the upper bound of this tier. The lower bound of a tier is the upper bound of the previous tier plus one. | Integer getUpTo() |
