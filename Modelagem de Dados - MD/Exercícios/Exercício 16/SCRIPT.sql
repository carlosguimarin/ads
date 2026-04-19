-- APAGANDO O BANCO DE DADOS CASO EXISTA
drop database if exists dbexercicio16;

-- CRIANDO O BANCO DE DADOS
create database dbexercicio16;

-- CONECTANDO AO BANCO
use dbexercicio16;

-- CRIANDO A TABELA
create table coleta (
IDCOLETA int not null auto_increment
, LOCAL_COLETA varchar(120)
, PONTO varchar(15)
, REFERENCIA varchar(120)
, DATA_COLETA date
, SITUACAO varchar(9)
, primary key(IDCOLETA)
);