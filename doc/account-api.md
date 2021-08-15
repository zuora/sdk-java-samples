# Account API

The AccountAPI gives you access to your Account objects, which store information about your customers, such as their contact details, their billing documents, their payment history and on what day of the month they should be billed.

The API allows you to create, retrieve, update, and delete your customer accounts. 

## Class Name

`AccountAPI`

## Methods

* [Create account](/doc/account-api.md#create-account)
* [Get account](/doc/account-api.md#get-account)
* [Update account](/doc/account-api.md#update-account)
* [Delete account](/doc/account-api.md#delete-account)


# Create Account

```java
Account account = zuoraClient.accounts().create(accountCreateRequest);
```

## Parameters

| Parameter | Type | Description |
|  --- | --- | --- |
| `accountCreateRequest` | [`AccountCreateRequest`](/doc/models/account-create-request.md) | An object containing the fields to POST for the request.<br>See the corresponding object definition for field details. |

## Response Type

[`Account`](/doc/models/account.md)

## Example

```java
ContactCreateRequest billTo = ContactCreateRequest.builder()
    .firstName("Tien")
    .lastName("Tzuo")
    .address(Address.builder().country("USA").state("KY").build())
    .build();

AccountCreateRequest createRequest = AccountCreateRequest.builder()
    .name("Tien Tzuo")
    .billTo(billTo)
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
account.update();
```

[comment]: <> (## Parameters)

[comment]: <> (| Parameter | Type | Tags | Description |)

[comment]: <> (|  --- | --- | --- | --- |)

[comment]: <> (| `account` | `Account` | Required | The hydrated `Account` object you wish to update. |)


## Example 

```java
String accountId = "account_id8";
Account account = accountAPI.get(accountId);
account.setName("Updated Name");
account.update();
```


# Delete Account

```java
accountsAPI.delete(accountId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the account. |


## Example

```java
String accountId = "account_id8";
accountsAPI.delete(accountId);
```




