# Geoclima

Projeto para gerenciar clientes e os climas associados a eles.

## O que foi utilizado nesse projeto:
* Maven
* Spring Cloud & Spring Boot
* Rest Services
* Lombok
* Embedded Mongo
* ModelMapper
* Swagger

## Porque essas ferramentas foram escolhidas

* O projeto inicialmente foi feito com Gradle, porém, tive alguns problemas com o Gradle e o Lombok, então decidi mudar para o Maven.
* Spring Boot, pois é mais utilizado no mercado e foi solicitado no teste.
* Lombok e ModelMapper, pois deixaria o código mais simples e mais limpo, além de diminuir o tempo de desenvolvimento.
* MongoDB foi utilizado pela simplicidade do projeto e pela velocidade de consulta do cliente pelo id.
* Embedded Mongo, foi utilizado fora do escopo de teste, para facilitar os avaliadores de modo que não precisem configurar o ambiente, instalando um banco para avaliar o projeto.
* Swagger foi utilizado como documentação da api e também por ser uma boa opção que possibilita os avaliadores consumirem a api.

## Swagger - Utilização

* Com a aplicação iniciada, acessar o link: http://localhost:8080/swagger-ui.html

## Executando o projeto

 Para rodar o projeto basta executar o comando do plugin do Spring Boot

```bash
$ ./mvnw spring-boot:run

```
