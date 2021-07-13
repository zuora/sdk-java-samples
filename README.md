

Before Zuora releases the SDK jar to a public maven repo, there are two ways for users to add it into your development repo.



### Option 1: Use zuora-sdk-java-{version-string}-with-dependencies.jar with all dependencies packaged
#### 1. Download jar to your development environment from {url}

#### 2. Install this into your local maven repo.
**Replace the download-folder and version-string with actual values.**  
```
mvn install:install-file -Dfile={download-folder}/zuora-sdk-java-{version-string}-with-dependencies.jar -DgroupId=com.zuora.sdk -DartifactId=zuora-sdk-java -Dversion={version-string} -Dpackaging=jar
```
[help document](https://mkyong.com/maven/how-to-include-library-manully-into-maven-local-repository/)

#### 3. Add below Dependency into your project pom.xml
**Replace the version-string with actual value.**  
```
       <dependency>
            <groupId>com.zuora.sdk</groupId>
            <artifactId>zuora-sdk-java</artifactId>
            <version>{version-string}</version>
        </dependency>
```



### Option 2: Use zuora-sdk-java-{version}.jar will dependencies
#### 1. Download jar to your development environment from {url}

#### 2. Install this into your local maven repo.
**Replace the download-folder and version-string with actual values.**  
```
mvn install:install-file -Dfile={download-folder}/zuora-sdk-java-{version-string}.jar -DgroupId=com.zuora.sdk -DartifactId=zuora-sdk-java -Dversion={version-string} -Dpackaging=jar
```
[help document](https://mkyong.com/maven/how-to-include-library-manully-into-maven-local-repository/)

#### 3. Add Below dependencies into your pom.xml
**Replace the version-string with actual value.**  
```
       <dependency>
            <groupId>com.zuora.sdk</groupId>
            <artifactId>zuora-sdk-java</artifactId>
            <version>{version-string}</version>
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
        <dependency>
            <groupId>com.apollographql.apollo</groupId>
            <artifactId>apollo-runtime</artifactId>
            <version>2.5.9</version>
        </dependency>
        <dependency>
            <groupId>com.squareup.okio</groupId>
            <artifactId>okio</artifactId>
            <version>3.0.0-alpha.6</version>
        </dependency>
        <dependency>
            <groupId>io.dropwizard.metrics</groupId>
            <artifactId>metrics-core</artifactId>
            <version>4.0.5</version>
        </dependency>
```
