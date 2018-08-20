# Geoclima

Projeto para gerenciar clientes e os climas associados a eles.

## O que foi utilizado nesse projeto:
* Maven e Modulos
* Spring Cloud & Spring Boot
* Rest Services
* Lombok
* Embedded Mongo
* ModelMapper
* Swagger e Swagger UI


## Porque essas ferramentas foram escolhidas

* O projeto inicialmente foi feito com Gradle, porém, tive alguns problemas com o Gradle e o Lombok, então decidi mudar para o Maven.
* Spring Boot, pois é mais utilizado no mercado e foi solicitado no teste.
* Lombok e ModelMapper, pois deixaria o código mais simples e mais limpo.
* Embedded Mongo foi utilizado pois o projeto é apenas para um teste e queria algo simples e rápido, principalmente ao testar a aplicação.
* Swagger UI, facilitou a documentação e a utilização da api de clientes nos testes.

## Swagger UI - Utilização

* Com a aplicação iniciada, colocar no browser : http://localhost:8080/swagger-ui.html
* Nesse link temos a api de clientes e os models existentes.
* Na api, temos todos os métodos e o request e response de exemplo, podendo executar chamadas na aplicação.

## Building

```bash
$ sudo mvn clean install
```
```
