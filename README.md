# Add Spring context to Maven project

> This project is based on chapter **2.2. Adding new beans to the Spring context** from book **Spring Starts here (2021)** by Laurentiu Spilca.

## Create Maven project with Intellij Idea

File > New project > Java

## Create entity class

```java
public class Parrot {
    private String name;
    
    public Parrot(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
```

## Add Spring Context dependency

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>6.1.10</version>
</dependency>
```

## Create Spring context

```java
ApplicationContext context = new AnnotationConfigApplicationContext();
```
