# API Items – Spring Boot + MySQL
API REST desenvolvida com Spring Boot e conectada ao banco MySQL. Permite realizar operações CRUD de itens. Projeto criado para atividade prática envolvendo API, banco de dados, endpoints e testes.

## Tecnologias utilizadas
- Java 21
- Spring Boot 
- MySQL Connector
- Maven
- Postman (testes)

## Endpoints

POST /items  
Body:
{
  "nome": "Teclado",
  "descricao": "Teclado RGB",
  "preco": 199.90
}

GET /items  
Retorna todos os itens.

GET /items/{id}  
Retorna item pelo ID.

PUT /items/{id}  
Body:
{
  "nome": "Teclado Atualizado",
  "descricao": "Switch Azul",
  "preco": 209.90
}

DELETE /items/{id}  
Remove o item pelo ID.

## Como rodar o projeto
git clone [https://github.com/sah524/api-items.git](https://github.com/sah524/API-ITEMS/)
cd api-items
mvn spring-boot:run

API disponível em:
http://localhost:8080

## Autor
Projeto desenvolvido por Sarah Silva – ADS (UCB)

## Status
Concluído.
