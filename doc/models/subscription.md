
# Subscription


Subscription allow you to charge a customer on a recurring basis and are the response returned by [CreateSubscription](/doc/subscription-api.md#create-subscription), [AddSubscriptionPlan](/doc/subscription-api.md#add-subscription-plan), [RemoveSubscriptionPlan](/doc/subscription-api.md#remove-subscription-plan), [UpdateSubscriptionItem](/doc/subscription-api.md#update-subscription-item), [TransferOwner](/doc/subscription-api.md#transfer-owner), [GetSubscription](/doc/subscription-api.md#get-subscription), [RenewSubscription](/doc/subscription-api.md#renew-subscription) and [CancelSubscription](/doc/subscription-api.md#cancel-subscription).

## Structure

`Subscription`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | `String getId()` |
| `key` | `String` | ReadOnly | Unique identifier for the object. | `String getKey()` |
| `createTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the object was created. | `ZonedDateTime getCreateTime()` |
| `updateTime` | `ZonedDateTime` | ReadOnly | The date and time, based on the tenant timezone, the object was last updated. | `ZonedDateTime getUpdateTime()` |
| `createdBy` | `String` | ReadOnly | Identifier of the user that created the object. | `String getCreatedBy()` |
| `updatedBy` | `String` | ReadOnly | Identifier of the user that last updated the object. | `String getUpdatedBy()` || `account` | [`Account`](/doc/models/account.md) |  | The subscriber account. | `String getAccount()` |
| `description` | `String` |  | An arbitrary string attached to the object. Often useful for displaying to users. | `String getDescription()` |
| `startDate` | `LocalDate` |  | Date on which the subscription becomes active. | `LocalDate getStartDate()` |
| `endDate` | `LocalDate` |  | Date on which the subscription is no longer active. | `LocalDate getEndDate()` |
| `state` | [`Enum`](/doc/models/subscription-status.md) | ReadOnly | Possible values are `DRAFT`, `PENDING_ACTIVATION`, `PENDING_ACCEPTANCE`, `ACTIVE`, `INACTIVE`, `EXPIRED`, `CANCELED`, `SUSPENDED`. | `String getState()` |
| `initialTerm` | [`Term`](/doc/models/term.md) |  | The duration of the subscription's initial term. | `Term getInitialTerm()` |
| `renewalTerm` | [`Term`](/doc/models/term.md) |  | The duration of the subscription's renewal term. | `Term getRenewalTerm()` |
| `currentTerm` | [`Term`](/doc/models/term.md) |  |  | `Term getCurrentTerm()` |
| `plans` | [`List<SubscriptionPlan>`](/doc/models/subscription-plan.md) |  | The array of plans associated with this subscription. | `List<SubscriptionPlan> getPlans()` |
| `contractEffective` | `LocalDate` |  | Date on which the subscriber contract is effective. | `LocalDate getContractEffective()` |
| `serviceActivation` | `LocalDate` |  | Date on which the subscribed-to service is activated. | `LocalDate getServiceActivation()` |
| `customerAcceptance` | `LocalDate` |  | Date on which all the services or products in the subscription are accepted by the subscriber. | `LocalDate getCustomerAcceptance()` |
| `invoiceAccount` | [`Account`](/doc/models/account.md) |  | The invoice owner account. | `Account getInvoiceAccount()` |
| `invoiceSeparately` | `Boolean` |  | If `true`, the subscription is billed separately from other subscriptions. If `false`, the subscription is included with other subscriptions in the account invoice. The default is `false`. | `Boolean getInvoiceSeparately()` |
| `termStartDate` | `LocalDate` |  | Date on which the subscription term starts. | `LocalDate getTermStartDate()` |
| `termEndDate` | `LocalDate` |  | Date on which the subscription term ends. | `LocalDate getTermEndDate()` |
| `autoRenew` | `Boolean` |  | If true, this subscription automatically renews at the end of the subscription term. This field is only required if the <code>TermType</code> field is <code>TERMED</code>. | `Boolean getAutoRenew()` |
| `mrr` | `Double` |  | Monthly recurring revenue of the subscription. | `Double getMrr()` |
| `tcv` | `Double` |  |  | `Double getTcv()` |
| `version` | `Integer` |  | The version number of the subscription. It is a read-only field. | `Integer getVersion()` |
| `cancelAtPeriodEnd` | `Boolean` |  |  | `Boolean getCancelAtPeriodEnd()` |
| `canceledDate` | `LocalDate` |  | The date on which the subscription was canceled. | `LocalDate getCanceledDate()` |
| `suspendedDate` | `LocalDate` |  | The date on which the subscription was suspended. | `LocalDate getSuspendedDate()` |
| `customFields` | `Map<String, Object>` |  | Custom fields. | `Map<String, Object> getCustomFields()`|
