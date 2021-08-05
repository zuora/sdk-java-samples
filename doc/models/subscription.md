
# Subscription


Subscription allow you to charge a customer on a recurring basis and are the response returned by [CreateSubscription](/doc/subcription.md#create-subscription), [UpdateSubscription](/doc/subscription.md#update-subscription), [GetSubscription](/doc/subscription.md#get-subscription), [RenewSubscription](/doc/subscription.md#renew-subscription) and [CancelSubscription](/doc/subscription.md#cancel-subscription).

## Structure

`Subscription`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `id` | `String` | ReadOnly | Unique identifier for the object. | String getId() |
| `account` | [`Account`](/doc/models/account.md) | Required | The subscriber account. | String getAccount() |
| `description` | `String` | Optional | An arbitrary string attached to the object. Often useful for displaying to users. | String getDescription() |
| `startDate` | `LocalDate` | Optional | Date on which the subscription becomes active. | LocalDate getStartDate() |
| `endDate` | `LocalDate` | Optional | Date on which the subscription is no longer active. | LocalDate getEndDate() |
| `state` | [`Enum`](/doc/models/subscription-state.md) | ReadOnly | Possible values are `draft`, `pending_activation`, `pending_acceptance`, `active`, `inactive`, `ended`, `canceled`, `suspended`. | String getState() |
| `initialTerm` | [`Term`](/doc/models/term.md) | Optional | The duration of the subscription's initial term. | Term getInitialTerm() |
| `renewalTerm` | [`Term`](/doc/models/term.md) | Optional | The duration of the subscription's renewal term. | Term getRenewalTerm() |
| `plans` | [`List<SubscriptionPlan>`](/doc/models/subscription-plan.md) | Required | The array of plans associated with this subscription. | `List<SubscriptionPlan>` getPlans() |
| `contractEffective` | `LocalDate` | Required | Date on which the subscriber contract is effective. | LocalDate getContractEffective() |
| `serviceActivation` | `LocalDate` | Optional | Date on which the subscribed-to service is activated. | LocalDate getServiceActivation() |
| `customerAcceptance` | `LocalDate` | Optional | Date on which all the services or products in the subscription are accepted by the subscriber. | LocalDate getCustomerAcceptance() |
| `invoiceAccount` | [`Account`](/doc/models/account.md) | Optional | The invoice owner account. | Account getInvoiceAccount() |
| `invoiceSeparately` | `Boolean` | Optional | If `true`, the subscription is billed separately from other subscriptions. If `false`, the subscription is included with other subscriptions in the account invoice. The default is `false`. | Boolean getInvoiceSeparately() |

## Example (as JSON)

```json
{
    "id": "S-000001",
    "name": "Subscription Y",
    "account": {
        "id": "A-000001",
        "name": "Tien Tzuo",
        "billTo": {
            "firstName": "Tien",
            "lastName": "Tzuo",
            "email": "tien@zuora.com",
            "phone": "888 976 9056",
            "line_1": "680 Folsom Street, Floor 3",
            "city": "San Francisco",
            "postalCode": "94107",
            "state": "CA",
            "country": "US"
        },
        "crmId" : "C-000345",
        "currency" : "USD",
        "parentAccount" : "A-000001",
        "paymentTerms": "30",
        "batch": "2",
        "billCycleDay": "31"
    },
    "startDate": "2021-07-10T13:23:49.154Z",
    "state" : "active",
    "plans": [{
        "id": "01F9E8XVBT3170FF8E2ATH7XS0"
    }]
}
```
