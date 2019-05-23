CREATE TABLE categoria (
codigo bigint(20) primary key auto_increment,
nome varchar (255) not null

) ENGINE=innoDB DEFAULT CHARSET=utf8;

insert into categoria (nome) values ('Venda');
insert into categoria (nome) values ('Troca');
insert into categoria (nome) values ('Outra');
