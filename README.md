# ron-di-container

### developing base code from lecture "더 자바, 코드를 조작하는 다양한 방법"

### addtional function
#### SINGLETON
ex 
```java
@Inject()
public class X { }
```

#### if you don't want to use class as SINGLTON,
```java
@Inject(status="NOT_SINGLETON")
public class Y {}
```

## how to implement this package
### maven: adding this xml
```xml
    <dependency>
      <groupId>com.rooon</groupId>
      <artifactId>reflection-tutorial</artifactId>
      <version>1.0-SNAPSHOT</version>
    </dependency>
```