
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
Different Zuora environments have different base URLs. You can use environment variables to manage base URLs and the different credentials you have for these environments.

When using the SDK you should select the endpoint base URL you wish to use.

| Tenant | Endpoint Base |
| --- | --- |
| US Production | https://rest.zuora.com |
| US API Sandbox | https://rest.apisandbox.zuora.com |
| US Central Sandbox | https://rest.test.zuora.com |
| US Performance Test | https://rest.pt1.zuora.com |
| US Cloud Production | https://rest.na.zuora.com |
| US Cloud API Sandbox | https://rest.sandbox.na.zuora.com |
| EU Production | https://rest.eu.zuora.com |
| EU Sandbox | https://rest.sandbox.eu.zuora.com |
| EU Central Sandbox | https://rest.test.eu.zuora.com |

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
