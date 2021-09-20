# Overage Type

Represents the type of smoothing to apply to overages.

## Enumeration

`OverageType`

## Fields

| Name | Description |
|  --- | --- |
| `ROLLING_WINDOW` | Rolling window. This spreads the usage over a smoothing period longer than the billing period. |
| `ROLLOVER` | Rollover. This carries unused units forward from one window to another, and expires them if they are not used by the end of the rollover period. |
