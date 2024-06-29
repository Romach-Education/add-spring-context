# Add Spring context to Maven project

> This project is based on chapter **2.2. Adding new beans to the Spring context** from book **Spring Starts here (2021)** by Laurentiu Spilca.

## Create Maven project with Intellij Idea

File > New project > Java

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

## Add tests

### Add dependency for Spring TestContext Framework

```xml
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-test</artifactId>
    <version>6.1.10</version>
    <scope>test</scope>
</dependency>
```

### Add dependency for JUnit

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.11.0-M2</version>
    <scope>test</scope>
</dependency>
```

### Create test to check that application context is created

```java
public class ApplicationTests {

    @Test
    @DisplayName("Checks that Application Context is created")
    public void checkApplicationContextCreated() {
        ApplicationContext context = new AnnotationConfigApplicationContext();

        assertNotNull(context);
    }
}
```
