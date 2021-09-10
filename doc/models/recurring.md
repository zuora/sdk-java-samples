# Recurring

Recurring price attributes.

## Class Name

`Recurring`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `interval` | [`Enum`](/doc/models/interval.md) | Optional | Specifies billing frequency. One of `WEEK`, `MONTH` or `YEAR`. | String getInterval() |
| `intervalCount` | `Integer` | Optional | The number of intervals between subscription billings. For example, interval=`MONTH` and intervalCount=`3` bills every 3 months. Maximum of one year interval allowed (1 year, 12 months, or 52 weeks). | String getIntervalCount() |
| `alignment` | [`Enum`](/doc/models/alignment.md) | Optional | . | String getAlignment() |
| `on` | [`Enum`](/doc/models/recurring-on.md) | Optional | . | String getRecurringOn() |
| `timing` | [`Enum`](/doc/models/timing.md) | Optional | You can choose to bill `IN_ADVANCE` or `IN_ARREARS` for recurring prices. This field is not used with one-time or usage-based prices. | String getTiming() |
| `durationInterval` | [`Enum`](/doc/models/duration-interval.md) | Optional | Specifies duration frequency. One of `DAY`, `WEEK`, `MONTH` or `YEAR`. | String getDurationInterval() |
| `durationIntervalCount` | `Integer` | Optional | Specifies the how long a customer shall be charged if this is less than the duration of the subscription. | String getDurationIntervalCount() |
| `ratingGroup` | [`Enum`](/doc/models/rating-group.md) | Optional | One of `BILLING_PERIOD`, `USAGE_START_DATE`, `USAGE_RECORD`, `USAGE_UPLOAD` or `CUSTOM_GROUP`. | String getRatingGroup() |
