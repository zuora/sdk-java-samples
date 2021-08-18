# ProcessingOption

Represents the processing options for a subscription.

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `documentDate` | `String` | Optional | The date used as the contract effective date if a contract effective date is not supplied. | String getDocumentDate() |
| `paymentMethod` | `String` | Optional | Represents the payment method used to pay for this subscription. | String getPaymentMethod() |
| `collectionMethod` | [`Enum`](collect-method.md) | Optional | The collection method for this subscription, one of `COLLECT_PAYMENT` or `CREATE_INVOICE`. | String getCollectionMethod() |
