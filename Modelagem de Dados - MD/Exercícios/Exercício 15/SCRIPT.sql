-- APAGANDO O BANCO DE DADOS CASO EXISTA
drop database if exists dbexercicio15;

-- CRIANDO O BANCO DE DADOS
create database dbexercicio15;

-- CONECTANDO AO BANCO
use dbexercicio15;

-- CRIANDO A TABELA
create table eleitor (
IDELEITOR int not null auto_increment
, NOME varchar(120) not null
, EMAIL varchar(50)
, SEXO varchar(15)
, ANIVERSARIO int
, DDD_CEL int
, NUN_CEL varchar(17)
, DDD_RES int
, NUN_RES varchar(17)
, DDD_REC int
, NUN_REC varchar(17) 
, RUA varchar(50)
, NUMERO int
, CIDADE varchar(50)
, ESTADO char(2)
, BAIRRO varchar(50)
, CEP char(10)
, primary key(IDELEITOR)
);