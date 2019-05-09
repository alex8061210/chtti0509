# Spring boot Git demo
## Last update 2019.05.09

### import gradle proj from [spring starter](https://start.spring.io/)

    *withot import any dependencies
    
### change port
1. application.properties
```
server.port=
``` 
2. java jvm.parameter
```
java -Dserver.port=
```

### enable tomcat web support
1. add dependencies (from starter to start-web)
```
implementation 'org.springframework.boot:spring-boot-starter-web'
```
