-- APAGANDO O BANCO DE DADOS CASO EXISTA
drop database if exists dbexercicio14;

-- CRIANDO O BANCO DE DADOS
create database dbexercicio14;

-- CONECTANDO AO BANCO
use dbexercicio14;

-- CRIANDO A TABELA
create table funcionario (
IDFUNCIONARIO int not null auto_increment
, NOME varchar(120) not null
, DDD_RES int
, TELEFONE_RES varchar(17)
, DDD_CEL int
, TELEFONE_CEL varchar(17)
, NOME varchar (120)
, DDD_REC int
, TELEFONE_REC varchar(17) 
, primary key(IDFUNCIONARIO)
);