
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
String CLIENT_ID = System.getenv("CLIENT_ID");
String CLIENT_SECRET = System.getenv("CLIENT_SECRET");
String ENDPOINT = System.getenv("ENDPOINT_BASE");
ZuoraClient zuoraClient = new ZuoraClient(CLIENT_ID, CLIENT_SECRET, ENDPOINT);

// fetch an account
Account account = zuoraClient.accounts().get("8ad088957aeb73bf017aeb9873627997");
```

## See SDK Guides for specific example usage

If you're not sure where to start, [this minimal end to end example](src/main/java/com/zuora/sdk/core/example/CreateAccountWithSubscription.java)  shows how to create an `Account` and then make it subscribe to a `Product`'s `Plan`, demonstrating the minimal components required to implement a subscription in Zuora. 
<hr />

## SDK Guides
[Minimal end to end example](src/main/java/com/zuora/sdk/core/example/CreateAccountWithSubscription.java)

<!-- [Link to SDK Guides](https://www.zuora.com/sdk-guides) -->

<hr />

## API Reference
[Account](doc/account.md)

[Product](doc/product.md)

[Plan](doc/plan.md)

[Plan Item](doc/plan-item.md)

[Subscription](doc/subscription.md)

[Billing Document](doc/billing-document.md)

[Exception](doc/exception.md)

[Payment](doc/payment.md)

[Payment Method](doc/payment-method.md)

[Feature](doc/feature.md)

[Refund](doc/refund.md)

[Taxation Item](doc/taxation-item.md)

[Transaction](doc/transaction.md)


