#Spring Boot Microservice
This project is about implementing a microservice with spring boot. There are some dependencies and services that build 
the project. On this project build two services that are `User Service` and `Department Service`.  Furthermore, 
we implement API Gateway using Spring Cloud and Config the server on GitHub repositories. Also, we can monitor the traffic 
using hystrix dependency to monetize our traffic app. And last but not least we use the Zepkin service to track the service that we used on this microservice app.

## Dependency
> - Spring Web
> - Lombok
> - Spring H2
> - Spring Cloud Eureka Server
> - Spring Cloud Eureka Client
> - Spring Cloud Gateway
> - Spring Cloud Sleuth
> - Spring Cloud Bootstrap
> - Spring Cloud Config

## How to Start
> Open the `service registry` then open the main method and start it, then after the service start you can start the
> `cloud-config server` project, and then you can start the `cloud-gateway`. After those three services start, 
>you can start the `user-service` and `department-service`. If you want to monitor the traffic start the
> `hystrix-dashboard` project.


### Additional Resource
>- If you want to monitor the service you can use zipkin. You can download it on : https://zipkin.io/
>- Config server : https://github.com/fatihk25/spring-microservice-config-server