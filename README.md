
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

## See SDK Guides for specific example usage


### Create a client
```
String CLIENT_ID = System.getenv("CLIENT_ID");
String CLIENT_SECRET = System.getenv("CLIENT_SECRET");
String ENDPOINT = System.getenv("ENDPOINT_BASE");
ZuoraClient zuoraClient = new ZuoraClient(CLIENT_ID, CLIENT_SECRET, ENDPOINT);

// fetch an account
Account account = zuoraClient.accounts().get("8ad088957aeb73bf017aeb9873627997");
```