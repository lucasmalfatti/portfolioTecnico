create table cliente(
	cod int primary key,
	endereço varchar(40),
	telefone varchar (10),
	cpf varchar (20)
);

insert into cliente(cod, endereço, telefone, cpf)
values
(1, 'rua malfatti', '9823-2736', '123.456.789-10'),
(2, 'rua macarrão', '9674-9584', '456.789.101-11'),
(3, 'rua banana', '9711-2398', '462.396.312-08');

create table editoras(
	cod int primary key,
	endereço varchar(40),
	telefone varchar (10),
	gerente varchar (30)
);

insert into editoras(cod, endereço, telefone, gerente)
values
(20, 'rua das maçãs', '9982-3445', 'Malfattão'),
(21, 'rua das uvas', '9682-2192', 'Macarronada');

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
(1002, 'J. K Token', 'Aventura', 21, 28);

create table compras(
	data date,
	cod_cliente int,
	foreign key(cod_cliente)references cliente(cod),
	cod_livro int,
	foreign key(cod_livro)references livros(isbn)
);

insert into compras(data, cod_cliente, cod_livro)
values
('2021-10-28', 3, 1001),
('2021-02-26', 1, 1002),
('2021-11-05', 2, 1001);
