# Recurring

The recurring components of a price such as interval.

## Class Name
`Recurring`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `interval` | [`Interval`](/doc/models/interval.md) | Optional | Specifies billing frequency. Either WEEK, MONTH or YEAR. | String getInterval() |
| `intervalCount` | `Integer` | Optional | The number of intervals between subscription billings. For example, interval=month and interval_count=3 bills every 3 months. Maximum of one year interval allowed (1 year, 12 months, or 52 weeks). | String getIntervalCount() |
| `alignment` | [`Alignment`](/doc/models/alignment.md) | Optional | . | String getAlignment() |
| `on` | [`RecurringOn`](/doc/models/recurring-on.md) | Optional | . | String getRecurringOn() |
