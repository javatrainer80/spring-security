# Spring Security

- spring-web provides build in tomcat

```java
@SpringBootApplication
//if we create controllers outside of parent package
//@ComponentScan("com.tech2java.springsecurity.controller")
```

- http://localhost:8080/hello

# Add spring-security dependency
```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-security</artifactId>
</dependency>
```

- After adding above dependency - re-run the application and hit below url
- http://localhost:8080/hello  -> It will prompt login page
- Password will be generated while starting the application
- Using generated security password: c5c26c5b-e10e-42dd-ab77-7e41c92002d9
- user name: user (default)

- https://docs.spring.io/spring-boot/docs/current/reference/html/application-properties.html

# Configuring username & pwd in applciation.properties
spring.security.user.name=
spring.security.user.password=


