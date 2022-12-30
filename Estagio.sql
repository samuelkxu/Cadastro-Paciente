create database cadastro;
use cadastro;
#drop database cadastro;

#Cria tabela para especialidade
create table Especialidades(IDEspecialidade integer NOT NULL auto_increment primary key,
nomeEspecialidade varchar(30)
);

#Cria tabela para plano de saude
create table PlanosDeSaude(IDPlanosDeSaude integer NOT NULL auto_increment primary key,
nomePlanosDeSaude varchar(30)
);

#Cria tabela para ficha dos pacientes
create table FichaPaciente(IDPaciente integer NOT NULL auto_increment primary key,
nome varchar(30),
nmrCarteiraPlano integer,
f_IDEspecialidade integer,
foreign key(f_IDEspecialidade) references Especialidades(IDEspecialidade),
f_IDPlanosDeSaude integer,
foreign key(f_IDPlanosDeSaude) references PlanosDeSaude(IDPlanosDeSaude)
);


#drop table FichaPaciente;

#Testa para ver se esta pegando os valores para o banco de dados
select *from Especialidades;
select *from PlanosDeSaude;
select *from FichaPaciente;