# Term

Defines the duration of a term for a given subscription.

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `interval` | [`TermInterval`](/doc/models/term-interval.md) | Required | Specifies subscription term length. Either day, week, month or year. | String getInterval() |
| `intervalCount` | `Integer` | Required | The number of intervals in a term. For example, interval=year and interval_count=1 represents a 1 year term. | String getIntervalCount() |
| `type` | [`TermType`](/doc/models/term-type.md) | Optional | The term type, one of `EVERGREEN` or `TERMED` | TermType getType() |
| `startDate` | `LocalDate` | Optional | Date on which the subscription becomes active. | LocalDate getStartDate() |
| `endDate` | `LocalDate` | Optional | Date on which the subscription is no longer active. | LocalDate getEndDate() |

