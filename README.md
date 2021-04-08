# Skinbaron API Client

A Skinbaron API Client for Java  
Based on https://skinbaron.de/misc/apidoc/

# Usage

## Maven

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

<dependency>
<groupId>com.github.x7airworker</groupId>
<artifactId>SkinbaronAPI</artifactId>
<version>Tag</version>
</dependency>
```

```java
import de.x7airworker.skinbaron.SkinbaronAPI;

SkinbaronAPI skinbaron=new SkinbaronAPI("Your api key");

        System.out.println(skinbaron.getBalance());
```
