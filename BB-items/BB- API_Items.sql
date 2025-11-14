CREATE DATABASE api_items;
USE api_items;

CREATE TABLE items (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    descricao VARCHAR(255),
    preco DECIMAL(10,2),
    quantidade INT
);

select * from items;
