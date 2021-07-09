

### 1. Install jar 
```
mvn install:install-file -Dfile=/Users/wqu/Downloads/zuora-sdk-java-1.0-SNAPSHOT.jar -DgroupId=com.zuora.sdk -DartifactId=zuora-sdk-java -Dversion=1.0-SNAPSHOT -Dpackaging=jar
```

[more..](https://mkyong.com/maven/how-to-include-library-manully-into-maven-local-repository/)


### 2. Configure .env file
create a .env file in your classpath, e.g. `src/main/java/resources`  
please use it 
```
CLIENT_ID=xxx
CLIENT_SECRET=yyy
ENDPOINT_BASE=https://rest.apisandbox.zuora.com
```
### 3. Add Dependencies into your pom.xml

```
       <dependency>
            <groupId>com.zuora.sdk</groupId>
            <artifactId>zuora-sdk-java</artifactId>
            <version>1.0-SNAPSHOT</version>
        </dependency>

        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>1.4.2.Final</version>
        </dependency>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.2</version>
        </dependency>
        <dependency>
            <groupId>com.squareup.okhttp3</groupId>
            <artifactId>okhttp</artifactId>
            <version>3.12.12</version>
        </dependency>
        <dependency>
            <groupId>com.google.guava</groupId>
            <artifactId>guava</artifactId>
            <version>20.0</version>
        </dependency>
        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-lang3</artifactId>
            <version>3.2.1</version>
        </dependency>
        <dependency>
            <groupId>io.github.cdimascio</groupId>
            <artifactId>java-dotenv</artifactId>
            <version>5.2.2</version>
        </dependency>
        <dependency>
            <groupId>org.jetbrains.kotlin</groupId>
            <artifactId>kotlin-stdlib</artifactId>
            <version>1.4.21</version>
        </dependency>

        <dependency>
            <groupId>com.jayway.jsonpath</groupId>
            <artifactId>json-path</artifactId>
            <version>2.6.0</version>
        </dependency>
        <dependency>
            <groupId>com.wavefront</groupId>
            <artifactId>wavefront-dropwizard-metrics-sdk-java</artifactId>
            <version>1.3.2</version>
        </dependency>
        <dependency>
            <groupId>net.bytebuddy</groupId>
            <artifactId>byte-buddy</artifactId>
            <version>1.11.2</version>
        </dependency>
```