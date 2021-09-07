# Tiers Mode

Defines if the tiering price should be `GRADUATED`, `HIGHWATERMARK_GRADUATED`, `VOLUME` or `HIGHWATERMARK_VOLUME` based. In volume-based tiering, the maximum quantity within a period determines the per unit price. In graduated tiering, pricing can change as the quantity grows.

## Enumeration

`TiersMode`

## Fields

| Name | Description |
|  --- | --- |
| `GRADUATED` | Pricing can change as the quantity grows. |
| `HIGHWATERMARK_GRADUATED` | Pricing can change as the quantity grows. |
| `VOLUME` | The maximum quantity within a period determines the per unit price. |
| `HIGHWATERMARK_VOLUME` | The maximum quantity within a period determines the per unit price. |
