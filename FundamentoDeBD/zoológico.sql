create table bilheteria(
	cod int primary key,
	preco decimal,
	data date
);

insert into bilheteria (cod, preco, data)
values
(10,15.50,'2022-02-06');

create table pessoas(
	nome varchar,
	data_nasc date,
	contato varchar,
	cod_bilhete int,
	foreign key(cod_bilhete) references bilheteria
);

insert into pessoas(nome, data_nasc, contato, cod_bilhete)
values
('Lucas','2005-02-26','lucas@gmail.com',10);

create table funcionarios(
	salario int,
	cargo varchar,
	carga_horaria int,
	nome varchar,
	cpf int primary key,
	observacoes varchar,
	cod_loja int,
	foreign key(cod_loja) references loja
);

create table loja(
	cod int primary key,
	nome varchar,
	cod_produtos int,
	foreign key (cod_produtos) references produtos
);

insert into loja(cod, nome, cod_produtos)
values
(20,'Sorveteria',60);

create table produtos(
	cod int primary key,
	nome varchar,
	preco int,
	qtd int,
	cod_fornecedor int,
	foreign key(cod_fornecedor) references fornecedor
);

insert into produtos(cod, nome, preco, qtd, cod_fornecedor)
values
(60,'Copo',15,100,50);

create table fornecedor(
	cod int primary key,
	cnpj int,
	nome varchar,
	contato varchar
);

insert into fornecedor(cod, cnpj, nome, contato)
values
(50,123456,'Laura','laura@gmail.com');

create table loja_franquia(
	area_atuacao varchar,
	nome varchar,
	aluguel decimal,
	cnpj int primary key,
	email varchar
);

insert into loja_franquia(area_atuacao,nome,aluguel,cnpj,email)
values
('Alimentos','Barraca do Zé',2500.50,32432,'barracadoze@gmail.com')

create table animais(
	nome varchar,
	ano_nascimento int,
	especie varchar,
	cod int primary key,
	sexo varchar,
	classe_animal varchar,
	cod_habitat int,
	foreign key (cod_habitat) references habitat
);

insert into animais(nome,ano_nascimento,especie,cod,sexo,classe_animal,cod_habitat)
values
('Sapo',2005,'sapies',18,'masculino','Anfíbio',80);

create table habitat(
	nome varchar,
	qtd_comida int,
	qtd_animais int,
	aberto boolean,
	cod int primary key
);

insert into habitat(nome, qtd_comida, qtd_animais, aberto, cod)
values
('Anfíbios',10000,15,true,80);
