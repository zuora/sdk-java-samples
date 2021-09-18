# Overage

Specifies how to charge for units consumed after a customer exceeds a defined number of included units.

## Class Name

`Overage`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `interval` | [`Interval`](/doc/models/interval.md) | Optional | . | String getInterval() |
| `intervalCount` | `Integer` | Optional | . | String getIntervalCount() |
| `applyAtEndOfSmoothingPeriod` | `Boolean` | Optional | . | Boolean getApplyAtEndOfSmoothingPeriod() |
| `creditUnusedUnits` | `Boolean` | Optional | . | Boolean getCreditUnusedUnits() |
| `includedUnits` | `Double` | Optional | . | Double getIncludedUnits() |
| `type` | [`Enum`](/doc/models/overage-type.md) | Optional | . | String getType() |
