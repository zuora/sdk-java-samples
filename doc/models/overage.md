# Overage

Specifies how to charge for units consumed after a customer exceeds a defined number of included units.

## Class Name

`Overage`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `interval` | [`Interval`](/doc/models/interval.md) | Optional | Specifies the interval used to calculate smoothed overage charges. | String getInterval() |
| `intervalCount` | `Integer` | Optional | Specifies the number of intervals used to calculate smoothed overage charges. | String getIntervalCount() |
| `applyAtEndOfSmoothingPeriod` | `Boolean` | Optional | . | Boolean getApplyAtEndOfSmoothingPeriod() |
| `creditUnusedUnits` | `Boolean` | Optional | Specifies whether or not to credit unused units. | Boolean getCreditUnusedUnits() |
| `includedUnits` | `Double` | Optional | Specifies the included units to which overage charges do not apply. | Double getIncludedUnits() |
| `type` | [`Enum`](/doc/models/overage-type.md) | Optional | Represents the overage type: one of `ROLLING_WINDOW` or `ROLLOVER`. | String getType() |
