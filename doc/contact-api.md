# Contact API

The Contact API gives you access to your [Contact](/doc/models/contact.md) objects, which store contact details for your customers.

The Contact API allows you to create, retrieve, and update customer contacts. 

## Class Name

`ContactAPI`

## Methods

* [Create contact](/doc/contact-api.md#create-contact)
* [Get contact](/doc/contact-api.md#get-contact)
* [Update contact](/doc/contact-api.md#update-contact)


# Create Contact

```java
Contact contact = zuoraClient.contacts().create(params);
```

## Parameters

| Parameter | Type | Description |
|  --- | --- | --- |
| `params` | [`ContactCreateRequest`](/doc/models/contact-create-request.md) | Contact request object. |

## Response Type

[`Contact`](/doc/models/contact.md)

## Example

```java
ContactCreateRequest params = ContactCreateRequest.builder()
    .firstName("Jenny")
    .lastName("Smith")
    .address(Address.builder().country("USA").state("CA").build())
    .build();
  
Contact contact = zuoraClient.contacts().create(params);
```

# Get Contact

```java
Contact contact = zuoraClient.contacts().get(contactId);
```

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `id` | `String` | Required | The unique identifier of a contact. |


## Response Type

[`Contact`](/doc/models/contact.md)


## Example 

```java
String CONTACT_ID = "contact_id8";

Contact contact = zuoraClient.contacts().get(CONTACT_ID);
```


# Update Contact

```java
Contact contact = contact.update();
```

[comment]: <> (## Parameters)

[comment]: <> (| Parameter | Type | Tags | Description |)

[comment]: <> (|  --- | --- | --- | --- |)

[comment]: <> (| `contact` | `Contact` | Required | The hydrated `Contact` object you wish to update. |)


## Example 

```java
String CONTACT_ID = "contact_id8";
Contact contact = zuoraClient.contacts().get(CONTACT_ID);

contact.setLastName("Jones");
contact.update();
```


