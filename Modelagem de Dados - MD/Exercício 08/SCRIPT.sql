-- APAGANDO O BANCO DE DADOS CASO EXISTA
drop database if exists dbexercicio08;

-- CRIANDO O BANCO DE DADOS
create database dbexercicio08;

-- CONECTANDO AO BANCO
use dbexercicio08;

-- CRIANDO A TABELA
create table conta (
IDCONTA int not null auto_increment
, NOME varchar(120) not null
, EMAIL varchar(120) not null
, SENHA varchar(50) not null
, CELULAR int
, ACEITE char(1) not null
, CURSO varchar(100)
, primary key (IDCONTA)
);
