-- APAGANDO O BANCO DE DADOS CASO EXISTA
drop database if exists dbexercicio13;

-- CRIANDO O BANCO DE DADOS
create database dbexercicio13;

-- CONECTANDO AO BANCO
use dbexercicio13;

-- CRIANDO A TABELA
create table funcionario (
IDFUNCIONARIO int not null auto_increment
, NOME varchar(120) not null
, TELEFONE_RES varchar(17) not null
, TELEFONE_CEL varchar(17) 
, TELEFONE_REC varchar(17) 
, primary key(IDFUNCIONARIO)
);