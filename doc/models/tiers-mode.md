# Tiers Mode

Defines if the tiering price should be `GRADUATED`, `VOLUME` `HIGH_WATERMARK_GRADUATED`, `HIGH_WATERMARK_VOLUME` or `GRADUATED_WITH_OVERAGE` based. In volume-based tiering, the maximum quantity within a period determines the per unit price. In graduated tiering, pricing can change as the quantity grows.

## Enumeration

`TiersMode`

## Fields

| Name | Description |
|  --- | --- |
| `GRADUATED` | Pricing can change as the quantity grows. |
| `VOLUME` | The maximum quantity within a period determines the per unit price. |
| `HIGH_WATERMARK_VOLUME` | . |
| `HIGH_WATERMARK_GRADUATED` | . |
| `GRADUATED_WITH_OVERAGE` | . |
