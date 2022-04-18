create table cliente(
	cod int primary key,
	endereço varchar(40),
	telefone varchar (10),
	cpf varchar (20)
);

insert into cliente(cod, endereço, telefone, cpf)
values
(1, 'Rua das Flores', '9823-2736', '123.456.789-10'),
(2, 'Rua da Lua', '9674-9584', '456.789.101-11'),
(3, 'Rua do Sol', '9711-2398', '462.396.312-08'),
(4, 'Rua de Marte', '9823-9233', '323.321.654-05');

create table editoras(
	cod int primary key,
	endereço varchar(40),
	telefone varchar (10),
	gerente varchar (30)
);

insert into editoras(cod, endereço, telefone, gerente)
values
(20, 'Rua das Maçãs', '9982-3445', 'Darth Vader'),
(21, 'Rua das Uvas', '9682-2192', 'Harry Pother'),
(22, 'Rua das Laranjas', 9856-2198, 'Batman');

create table funcionarios(
	cod int primary key,
	nome varchar,
	salario int,
	contato varchar,
	carga_horaria int
);

insert into funcionarios(cod, nome, salario, contato, carga_horaria)
values
(10, 'Crash', '3000', 'crash@gmail.com', 6),
(11, 'Kratos', '4000', 'kratos@gmail.com', 6),
(12, 'Joel', '5000', 'joel@gmail.com', 6);

create table livros(
	isbn int primary key,
	nome_autor varchar (30),
	assunto varchar (20),
	cod_editora int,
	foreign key(cod_editora)references editoras(cod),
	qtd int 
);

insert into livros(isbn, nome_autor, assunto, cod_editora, qtd)
values
(1001, 'José de Alencar', 'Ficção', 20, 10),
(1002, 'J. K Token', 'Aventura', 21, 28),
(1003, 'George Orwell', 'Ficção', 22, 1984);

create table compras(
	cod_livros int,
	foreign key(cod_livros) references livros,
	cod_cliente int,
	foreign key(cod_cliente) references cliente,
	venda_fun int,
	foreign key(venda_fun) references funcionarios
);

insert into compras(cod_cliente, cod_livros, venda_fun)
values
(3, 1001, 10),
(1, 1002, 11),
(2, 1001, 10);
