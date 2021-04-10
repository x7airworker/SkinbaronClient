# Skinbaron API Client

A Skinbaron API Client for Java  
Based on https://skinbaron.de/misc/apidoc/

# Usage

## Maven

```xml
<repository>
    <id>x7airworker</id>
    <url>https://repo.jakes-co.de</url>
</repository>

<dependency>
    <groupId>de.x7airworker</groupId>
    <artifactId>SkinbaronAPI</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

```java
import de.x7airworker.skinbaron.SkinbaronAPI;

SkinbaronAPI skinbaron=new SkinbaronAPI("Your api key");

System.out.println(skinbaron.getBalance());
```
