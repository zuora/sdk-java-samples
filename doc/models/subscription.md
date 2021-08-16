
# Subscription


Subscription allow you to charge a customer on a recurring basis and are the response returned by [CreateSubscription](/doc/subscription-api.md#create-subscription), [AddSubscriptionPlan](/doc/subscription-api.md#add-subscription-plan), [GetSubscription](/doc/subscription-api.md#get-subscription), [RenewSubscription](/doc/subscription-api.md#renew-subscription) and [CancelSubscription](/doc/subscription-api.md#cancel-subscription).

## Structure

`Subscription`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `key` | `String` | ReadOnly | Unique identifier for the object. | String getKey() |
| `account` | [`Account`](/doc/models/account.md) | Required | The subscriber account. | String getAccount() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `startDate` | `LocalDate` | Optional | Date on which the subscription becomes active. | LocalDate getStartDate() |
| `endDate` | `LocalDate` | Optional | Date on which the subscription is no longer active. | LocalDate getEndDate() |
| `state` | [`Enum`](/doc/models/subscription-status.md) | ReadOnly | Possible values are `draft`, `pending_activation`, `pending_acceptance`, `active`, `inactive`, `ended`, `canceled`, `suspended`. | String getState() |
| `initialTerm` | [`Term`](/doc/models/term.md) | Optional | The duration of the subscription's initial term. | Term getInitialTerm() |
| `renewalTerm` | [`Term`](/doc/models/term.md) | Optional | The duration of the subscription's renewal term. | Term getRenewalTerm() |
| `currentTerm` | [`Term`](/doc/models/term.md) | Optional |  | Term getCurrentTerm() |
| `plans` | [`List<SubscriptionPlan>`](/doc/models/subscription-plan.md) | Required | The array of plans associated with this subscription. | `List<SubscriptionPlan>` getPlans() |
| `contractEffective` | `LocalDate` | Required | Date on which the subscriber contract is effective. | LocalDate getContractEffective() |
| `serviceActivation` | `LocalDate` | Optional | Date on which the subscribed-to service is activated. | LocalDate getServiceActivation() |
| `customerAcceptance` | `LocalDate` | Optional | Date on which all the services or products in the subscription are accepted by the subscriber. | LocalDate getCustomerAcceptance() |
| `invoiceAccount` | [`Account`](/doc/models/account.md) | Optional | The invoice owner account. | Account getInvoiceAccount() |
| `invoiceSeparately` | `Boolean` | Optional | If `true`, the subscription is billed separately from other subscriptions. If `false`, the subscription is included with other subscriptions in the account invoice. The default is `false`. | Boolean getInvoiceSeparately() |
| `termStartDate` | `LocalDate` | Optional | Date on which the subscription term starts. | LocalDate getTermStartDate() |
| `termEndDate` | `LocalDate` | Optional | Date on which the subscription term ends. | LocalDate getTermEndDate() |
| `autoRenew` | `Boolean` | Optional | If true, this subscription automatically renews at the end of the subscription term. This field is only required if the <code>TermType</code> field is <code>TERMED</code>. | Boolean getAutoRenew() |
| `mrr` | `Double` | Optional | Monthly recurring revenue of the subscription. | Double getMrr() |
| `tcv` | `Double` | Optional |  | Double getTcv() |
| `version` | `Integer` | Optional | The version number of the subscription. It is a read-only field. | Integer getVersion() |
| `cancelAtPeriodEnd` | `Boolean` | Optional |  | Boolean getCancelAtPeriodEnd() |
| `canceledDate` | `LocalDate` | Optional | The date on which the subscription was canceled. | LocalDate getCanceledDate() |
| `suspendedDate` | `LocalDate` | Optional | The date on which the subscription was suspended. | LocalDate getSuspendedDate() |
| `customFields` | `Map<String, Object>` | Optional | Custom fields. | `Map<String, Object> getCustomFields()`|
