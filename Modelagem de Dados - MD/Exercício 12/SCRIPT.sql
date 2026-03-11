-- APAGANDO O BANCO DE DADOS CASO EXISTA
drop database if exists dbexercicio12;

-- CRIANDO O BANCO DE DADOS
create database dbexercicio12;

-- CONECTANDO AO BANCO
use dbexercicio12;

-- CRIANDO A TABELA
create table conta (
IDLOCATARIO int not null auto_increment
, NOME varchar(120) not null
, TELEFONE varchar(17) not null
, ASSINATURA varchar(120) not null
, DT_CADASTRO date not null
, CPF char(11) not null
, ENDERECO varchar(120) not null
, DT_INICIO_CONTRATO date not null
, DT_FIM_CONTRATO date not null
, VALOR_ALUGUEL decimal(10,2) not null
, NOME_DEPENDENTE varchar(120) not null
, DT_NASCIMENTO_DEPENDENTE_1 date not null
, NOME_DEPENDENTE_2 varchar(120) not null
, DT_NASCIMENTO_DEPENDENTE_2 date not null
, primary key(IDLOCATARIO)
);