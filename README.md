
# Getting Started

## Install the SDK
#### Add the following to your project pom.xml
** Be sure and set or replace `version-string` as the sdk-version you'd like to use!**  
```
<dependency>
    <groupId>com.zuora.sdk</groupId>
    <artifactId>zuora-sdk-java</artifactId>
    <version>{version-string}</version>
</dependency>
```



## Create an API key, secret
TODO - instructions on how to do this & make sure their tenant is configured correctly so all SDK features work. 


### Quick Start
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
