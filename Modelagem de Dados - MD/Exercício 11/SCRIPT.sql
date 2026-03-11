-- APAGANDO O BANCO DE DADOS CASO EXISTA
drop database if exists dbexercicio11;

-- CRIANDO O BANCO DE DADOS
create database dbexercicio11;

-- CONECTANDO AO BANCO
use dbexercicio11;

-- CRIANDO A TABELA
create table conta (
IDINSCRICAO int not null auto_increment
, NOME varchar(120) not null
, DT_NASCIMENTO date not null
, TELEFONE varchar(17) not null
, PARENTESCO_CONTATO_1 varchar(17)
, TELEFONE_CONTATO_1 varchar(17) not null
, TELEFONE_CONTATO_2 varchar(17)
, EMAIL varchar(120) not null
, ENDERECO varchar(200) not null
, CIDADE varchar(50) not null
, ESTADO char(2) not null
, CURSO varchar(120) not null
, ASSINATURA varchar(120) not null
, DT_CADASTRO date not null
, NOME_CONTATO_1 varchar(120) not null
, NOME_CONTATO_2 varchar(120)
, PARENTESCO_CONTATO_2 varchar(17)
, primary key (IDINSCRICAO)
);