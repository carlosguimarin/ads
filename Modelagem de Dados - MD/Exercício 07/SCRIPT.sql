-- Verificando se o banco de dados existe
drop database if exists dbexercicio07;

-- Criando banco de dados
create database dbexercicio07;

-- Conectando ao banco de dados
use dbexercicio07;

-- Criando as tabelas
create table HOSPEDE (
     IDHOSPEDE int not null auto_increment
     , NOME varchar(120) not null
     , CPF char(11)
     , EMAIL varchar(120)
     , DT_CHECKIN date
     , DT_CHECKOUT date
     , ASSINATURA char(1)
     , DT_CADASTRO date
     , primary key (IDHOSPEDE)
);