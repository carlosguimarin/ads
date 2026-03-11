-- APAGANDO O BANCO DE DADOS CASO EXISTA
drop database if exists dbexercicio09;

-- CRIANDO O BANCO DE DADOS
create database dbexercicio09;

-- CONECTANDO AO BANCO
use dbexercicio09;

-- CRIANDO A TABELA
create table conta (
IDCONTA int not null auto_increment
, NOME varchar(120) not null
, EMAIL varchar(120) not null
, SENHA varchar(50) not null
, CPF char(11)
, ENDEREÇO varchar(120) not null
, VINCULO_FACEBOOK varchar(200)
, VINCULO_GOOGLE varchar(200)
, primary key (IDCONTA)
);