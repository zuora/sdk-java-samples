# Account

The Account object stores information about your customers, such as their contact details, their billing documents, their payment history and on what day of the month they should be billed.

The API allows you to create, retrieve, and update your customer accounts. 

```java
AccountAPI accountAPI = zuora.accounts();
```

## Class Name

`AccountAPI`

## Methods

* [Create account](/doc/account.md#create-account)
* [Get account](/doc/account.md#get-account)
* [Update account](/doc/account.md#update-account)


# Create Account

Creates a new customer account.

You must provide at least these values in your request to this endpoint:

- `name`
- `billTo.firstName`
- `billTo.lastName`
- `billTo.country`

```java
Account account = accountAPI.create(createAccountRequest);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`CreateAccountRequest`](/doc/models/create-account-request.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

[`Account`](/doc/models/account.md)

## Example

```java
Contact billTo = new Contact.Builder()
    .firstName("Tien")
    .lastName("Tzuo")
    .line1("680 Folsom St Floor 3")
    .city("San Francisco")
    .postalCode("94107")
    .state("CA")
    .country("US")
    .build();
CreateAccountRequest createRequest = new CreateAccountRequest.Builder()
    .billTo(billTo)
    .name("Tien Tzuo")
    .build();
Account account = accountsAPI.create(createRequest);
```

# Get Account

```java
Account account = accountAPI.get(accountId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the account. |


## Response Type

[`Account`](/doc/models/account.md)


## Example 

```java
String accountId = "account_id8";

Account account = accountAPI.get(accountId);
```


# Update Account

```java
Account account = accountAPI.update(updateRequest);
```


## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `body` | [`Account`](/doc/models/account.md) | Body, Required | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |


## Response Type

[`Account`](/doc/models/account.md)


## Example 

```java
String accountId = "account_id8";
Account account = accountAPI.get(accountId);

Account updateRequest = account.builder()
    .name("Tien Tzuo")
    .build();
    
Account account = accountAPI.update(updateRequest);
```




