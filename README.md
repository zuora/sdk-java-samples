
# Getting Started Quickly with Zuora Samples
Zuora Samples are built by Zuora, and provide all of the server code you need for common integration use cases like creating a subscription with Zuora Billing.

You will also find comprehensive [SDK Technical Reference](/README.md#sdk-technical-reference) documentation here.

Go to the [Zuora Developer Community](https://community.zuora.com/communities/community-home?CommunityKey=e2a932b4-50c4-4019-a3e8-362e38714df3) to connect with other developers, report issues or discuss these samples.

## Installation
#### Add the following to the dependencies in your project's pom.xml

```
<dependency>
    <groupId>com.zuora.sdk</groupId>
    <artifactId>zuora-sdk-java</artifactId>
    <version>{version}</version>
</dependency>
```

Latest SDK Version: 1.0.3

[View on Maven Central](https://search.maven.org/artifact/com.zuora.sdk/zuora-sdk-java)

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
1. Create an API User. See [Create an API User](https://knowledgecenter.zuora.com/Billing/Tenant_Management/A_Administrator_Settings/Manage_Users/Create_an_API_User) for details. Note, this step must be performed by a Zuora administrator from your organization with a company email address.

2. Create an OAuth Client for that API User. See [Create an OAuth Client](https://knowledgecenter.zuora.com/Billing/Tenant_Management/A_Administrator_Settings/Manage_Users#Create_an_OAuth_Client_for_a_User).

3. Make a note of the Client ID and Client Secret and add them to the following snippet in your code to authenticate. 

###
```
String CLIENT_ID = "{CLIENT_ID}";
String CLIENT_SECRET = "{CLIENT_SECRET}";
String ENDPOINT = "{ENDPOINT_BASE}";
ZuoraClient zuoraClient = new ZuoraClient(CLIENT_ID, CLIENT_SECRET, ENDPOINT);
```
<hr />

## Samples
If you're not sure where to start [this basic sample](src/main/java/com/zuora/sdk/core/example/CreateAccountWithSubscription.java) demonstrates how to create an `Account`, a `Product` and a `Subscription` to subscribe a customer to your product or service.

[Basic Sample](src/main/java/com/zuora/sdk/core/example/CreateAccountWithSubscription.java)

[Pricing Samples](src/main/java/com/zuora/sdk/core/example/PlanItemExamples.java)
<hr />

## SDK Guide
[SDK Guide](https://www.zuora.com/developer/sdks/)


<hr />

## SDK Technical Reference

This technical reference documents every recommended object and method available in Zuora's SDK for Java.

### Product
* [Product](doc/product-api.md)
* [Plan](doc/plan-api.md)
* [Price](doc/price-api.md)

### Account
* [Account](doc/account-api.md)

### Subscription
* [Subscription](doc/subscription-api.md)

### Billing Document
* [Billing Document](doc/billing-document-api.md)

### Payment
* [Payment Method](doc/payment-method-api.md)
* [Payment](doc/payment-api.md)
