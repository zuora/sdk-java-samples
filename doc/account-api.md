# Account API

The Account API gives you access to your [Account](/doc/models/account.md) objects, which store information about your customers, including their contact details, payment methods, billing documents, payment history and on what day of the month they will be billed.

The Account API allows you to create, retrieve, update, and delete your customer accounts. 

## Class Name

`AccountAPI`

## Methods

* [Create account](/doc/account-api.md#create-account)
* [Get account](/doc/account-api.md#get-account)
* [Update account](/doc/account-api.md#update-account)
* [Delete account](/doc/account-api.md#delete-account)


# Create Account

```java
Account account = zuoraClient.accounts().create(params);
```

## Parameters

| Parameter | Type | Description |
|  --- | --- | --- |
| `params` | [`AccountCreateRequest`](/doc/models/account-create-request.md) | Account request object. |

## Response Type

[`Account`](/doc/models/account.md)

## Example

```java
ContactCreateRequest contactParams = ContactCreateRequest.builder()
    .firstName("Jenny")
    .lastName("Smith")
    .address(Address.builder().country("USA").state("CA").build())
    .build();

AccountCreateRequest params = AccountCreateRequest.builder()
    .name("Jenny Smith")
    .billTo(contactParams)
    .build();
    
Account account = zuoraClient.accounts().create(params);
```

# Get Account

```java
Account account = zuoraClient.accounts().get(accountId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier for the account. |


## Response Type

[`Account`](/doc/models/account.md)


## Example 

```java
String ACCOUNT_ID = "account_id8";

Account account = zuoraClient.accounts().get(ACCOUNT_ID);
```


# Update Account

```java
Account account = account.update();
```

[comment]: <> (## Parameters)

[comment]: <> (| Parameter | Type | Tags | Description |)

[comment]: <> (|  --- | --- | --- | --- |)

[comment]: <> (| `account` | `Account` | Required | The hydrated `Account` object you wish to update. |)


## Example 

```java
String ACCOUNT_ID = "account_id8";
Account account = zuoraClient.accounts().get(ACCOUNT_ID);

account.setName("New Name");
account.update();
```


# Delete Account

```java
zuoraClient.accounts().delete(accountId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of an account. |


## Example

```java
String ACCOUNT_ID = "account_id8";

zuoraClient.accounts().delete(ACCOUNT_ID);
```




