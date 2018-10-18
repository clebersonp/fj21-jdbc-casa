/*drop database if exists fj21;
create database fj21;

use fj21;

drop table if exists contatos;

create table contatos (
	id bigint not null auto_increment,
    nome varchar(255),
    email varchar(255),
    endereco varchar(255),
    data_nascimento date,
    primary key (id)
);

drop table if exists funcionarios;

create table funcionarios (
	id bigint not null auto_increment,
    nome varchar(255),
    usuario varchar(255),
    senha varchar(255),
    primary key (id)
);

*/
-- use fj21;

select * from contatos;

select * from funcionarios;
