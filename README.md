# TicketBox Gateway Service

## General information <hr>
This is Gateway Service for TicketBox project. It is a Spring Boot application that serves as a gateway for other microservices in the Ticket system. The gateway service uses Spring Cloud Gateway to route requests to the appropriate microservices and provides load balancing, security, and other features.

## Requirement <hr>
- requires Java version 17
- docker

## Set up <hr>

### Run project:
#### Run with docker:
```bash
docker-compose up -d
```
#### Run with file jar:
```bash
mvn clean package -DskipTests
java -jar TicketBoxGatewayService-0.0.1-SNAPSHOT.jar
```