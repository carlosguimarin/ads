-- APAGANDO O BANCO DE DADOS CASO EXISTA
drop database if exists dbexercicio10;

-- CRIANDO O BANCO DE DADOS
create database dbexercicio10;

-- CONECTANDO AO BANCO
use dbexercicio10;

-- CRIANDO A TABELA
create table conta (
IDFEED int not null auto_increment
, USUARIO varchar(120) not null
, DT_PUBLICACAO datetime not null
, TEXTO varchar(200)
, TAG varchar(100) not null
, URL_IMAGE varchar(200) not null
, primary key (IDFEED)
);
