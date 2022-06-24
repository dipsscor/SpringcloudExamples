# Spring Cloud Servcice Bus Example


# Overview
The example shows how Springcloud service bus is used to update the external configurations to microservices without refreshing the individial endpoints.

# configurations
## App1 is a microservice written in springboot and vaadin -- > http://localhost:9998/myapp
## App2 is a microservice written in springboot and vaadin -- > http://localhost:9999/myapp
## eurekaserver-8090 is a discovery service written in springboot and netflix oss -- > http://localhost:8090
## eurekaserver-8091 is a discovery service written in springboot and netflix oss -- > http://localhost:8091
## cloud-config-server is a config service written in springcloud-- > http://localhost:8888
### cloud-config-server stores the configuration in local classpath -->/common-config--> http://localhost:8888/application-dev.properties


#Refrence
https://www.javainuse.com/spring/cloud-stream-bus


