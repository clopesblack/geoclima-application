# Geoclima

Project to manage customers and their associated climates.

## What was used in this project:
* Maven
* Spring Cloud & Spring Boot
* Rest Services
* Lombok
* Embedded Mongo
* ModelMapper
* Swagger

## Why this tools was choosen

* Initially, the project was made with Gradle, but I had some problems with Lombok and Gradle. Then, I decided to change to Maven.
* Spring Boot, because it is the most framework used and was solicited for the test.
* Lombok and ModelMapper, because would let the code to be more clean and fast, besides to reduce some developing time.
* MongoDB was chosen because of the simplicity of the project and for the velocity to consult a client by his id.
* Embedded Mongo, it was used outside of the test scope to facilitate the reviewers, since that way they don't need to configure the environment.
* Swagger, it was used for the documentation to the API's and to be a good option for the reviewers to consume the API's easily.

## Swagger - How to use

* With the application started, use this link: http://localhost:8080/swagger-ui.html

## Executando o projeto

To run the project just run the Spring Boot plugin command

```bash
$ ./mvnw spring-boot:run

```
