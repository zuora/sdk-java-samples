# Subscription Create Request

Describes a request to create a subscription using [CreateSubscription](/doc/subscription-api.md#create-subscription).


## Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- | 
| `key` | `String` | Optional | Unique identifier for the object. |
| `account` | [`Account`](/doc/models/account.md) | Required | The subscriber account. |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | 
| `startDate` | `LocalDate` | Optional | Date on which the subscription becomes active. | 
| `initialTerm` | [`Term`](/doc/models/term.md) | Optional | The duration of the subscription's initial term. | 
| `renewalTerm` | [`Term`](/doc/models/term.md) | Optional | The duration of the subscription's renewal term. | 
| `plans` | [`List<SubscriptionPlan>`](/doc/models/subscription-plan.md) | Optional | The array of plans associated with this subscription. | 
| `processingOption` | [`ProcessingOption`](/doc/models/processing-option.md) | Optional | The processing options for this subscription. | 
| `contractEffective` | `LocalDate` | Optional | Date on which the subscriber contract is effective. | 
| `serviceActivation` | `LocalDate` | Optional | Date on which the subscribed-to service is activated. | 
| `customerAcceptance` | `LocalDate` | Optional | Date on which all the services or products in the subscription are accepted by the subscriber. | 
| `invoiceAccount` | [`Account`](/doc/models/account.md) | Optional | The invoice owner account. | 
| `invoiceSeparately` | `Boolean` | Optional | If `true`, the subscription is billed separately from other subscriptions. If `false`, the subscription is included with other subscriptions in the account invoice. The default is `false`. | 
| `termStartDate` | `LocalDate` | Optional | Date on which the subscription term starts. | 
| `termEndDate` | `LocalDate` | Optional | Date on which the subscription term ends. | 
| `autoRenew` | `Boolean` | Optional | If true, this subscription automatically renews at the end of the subscription term. This field is only required if the <code>TermType</code> field is <code>TERMED</code>. | 
| `cancelAtPeriodEnd` | `Boolean` | Optional |  | Boolean getCancelAtPeriodEnd() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | 
