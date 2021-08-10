
# Getting Started

## Installation
#### Add the following to the dependencies your project pom.xml
  
```
<dependency>
    <groupId>com.zuora.sdk</groupId>
    <artifactId>zuora-sdk-java</artifactId>
    <version>{version}</version>
</dependency>
```

## Prerequisites

TODO - Prerequisites here

## Base URLs
The base URLs for different Zuora environments are different. You can use environment-based variables to manage base URLs and the different credentials you have for different Zuora environments.

When using the SDK you should select the endpoint base URL you wish to use.

| Tenant | Endpoint Base |
| --- | --- |
| US Production | https://rest.zuora.com |
| US API Sandbox | https://rest.apisandbox.zuora.com |
|||
|||
|||
|||
|||
|||

## Authentication
Create a dedicated user for making API calls. See [Create an API User](https://knowledgecenter.zuora.com/Billing/Tenant_Management/A_Administrator_Settings/Manage_Users/Create_an_API_User) for details. This step must be performed by a Zuora administrator from your organization with a company email address.



### 
```
String CLIENT_ID = System.getenv("{CLIENT_ID}");
String CLIENT_SECRET = System.getenv("{CLIENT_SECRET}");
String ENDPOINT = System.getenv("{ENDPOINT_BASE}");
ZuoraClient zuoraClient = new ZuoraClient(CLIENT_ID, CLIENT_SECRET, ENDPOINT);
```
<hr />

## SDK Guide
[SDK Guide](https://www.zuora.com/developer/sdks/)


<hr />

## SDK Technical Reference

### Product
* [Product](doc/product.md)
* [Plan](doc/plan.md)
* [Plan Item](doc/plan-item.md)

### Account
* [Account](doc/account.md)

### Subscription
* [Subscription](doc/subscription.md)

### Billing Document
* [Billing Document](doc/billing-document.md)

### Payment
* [Payment Method](doc/payment-method.md)
* [Payment](doc/payment.md)
* [Refund](doc/refund.md)
