create table generos(
genero varchar (10) primary key);

create table DIRECTORES (
Nombre varchar (10) primary key,
Lugar_de_nacimiento varchar (10),
Fecha_nacimiento date );

create table PELICULAS (
Código number(15)primary key,
Titulo varchar (15),
Año number (4),
Caratula varchar (5),
Genero varchar (10),
Nombre varchar (10),
constraint genero_pel foreign key(genero) references generos,
constraint nom_dir foreign key(nombre) references directores
);

create table ACTORES (
Nombre varchar(12)primary key,
Lugar_de_nacimiento varchar(12),
Fecha_de_nacimiento date,
Sexo varchar (11),
Foto varchar (255));

ACTORES_PELICULAS (
Película varchar (20),
Actor varchar (10),
Foto varchar (255),
Año varchar (4)
constraint xxxxx foreign xxxx references xxx
constraint xxxx foreign key xxxxx references xxx;


create table EJEMPLO1 (
DNI varchar(10) not null,
nombre varchar(30),
fecha date default sysdate);
ñk
drop table ejemplo1;

insert into ejemplo1 values ('1','pepe','01/01/2019');
insert into ejemplo1 (dni, nombre) values ('2', 'ana');

create table EJEMPLO2 (
DNI varchar(10),
nombre varchar(30) default 'no definido',
usuario varchar (15) default uid );

insert into ejemplo2 values (1, 'juanito', '2');
insert into ejemplo2 (dni) values (2);

create table EJEMPLO3 (
DNI varchar2(10) primary key not null,
NOMBRE varchar2 (30) not null check (nombre=upper(nombre)),
EDAD number (2) check (edad between 5 and 20),
CURSO number (1) check (curso between 1 and 3)); 

create table ARTICULOS (
ARTICULO VARCHAR2(20),
COD_FABRICANTE NUMBER(3) references fabricantes ,
PESO NUMBER(3) constraint peso check (peso>0),
CATEGORIA VARCHAR2(10) constraint categoria check (categoria='1' or categoria='2' or categoria='3'),
PRECIO_VENTA NUMBER(6,2) constraint precio_venta check (precio_venta >0) ,
PRECIO_COSTO NUMBER(6,2) constraint precio_costo check (precio_costo > 0),
EXISTENCIAS NUMBER(5),
primary key (articulo, cod_fabricante, peso, categoria));

create table FABRICANTES (
COD_FABRICANTE NUMBER(3) primary key,
NOMBRE VARCHAR2(15) check (nombre=upper(nombre)),
PAIS VARCHAR2(15) check (pais=upper(pais)));

insert into fabricantes values(100,'PEPE', 'FRANCIA');
INSERT INTO FABRICANTES VALUES (101, 'PEPA','FRANCIA');

INSERT INTO ARTICULOS VALUES ('ART1',100,2, '1',5,3,50);


CREATE TABLE EMPLEADOS (
APELLIDO VARCHAR2(20),
NOMBRE VARCHAR2(20) NOT NULL,
DOMICILIO VARCHAR2(30)
);


ALTER TABLE EMPLEADOS  ADD (fecha_Ingreso DATE );

DESCRIBE EMPLEADOS 

ALTER TABLE EMPLEADOS  ADD (SECCION VARCHAR(12) NOT NULL );

ALTER TABLE EMPLEADOS  ADD (SUELDO NUMBER(5) DEFAULT 0 );


create table secciones(
  codigo number(2) primary key,
  nombre varchar(20)
 
 );

 create table empleados2(
  apellido varchar2(20) not null,
  nombre varchar2(20),
  domicilio varchar2(30),
  seccion number(2),
  fechaingreso date,
  telefono number(7),
  constraint emp_sec_fk  foreign key (seccion) references secciones (codigo) on delete set null
 );

 alter table empleados2 modify telefono varchar2 (10);

 alter table empleados2 modify nombre varchar (10);
 
 alter table empleados2 drop constraint  emp_sec_fk;
 
 alter table secciones modify codigo char (2);
 
 create table empleados3(
  documento char(8) not null,
  nombre varchar2(10),
  domicilio varchar2(30),
  ciudad varchar2(20) default 'Buenos Aires'
 );
 
alter table empleados3 add (hijos number (2) constraint max_hijos check (hijos < 30));


alter table empleados3 add (sueldo number (6,2) not null constraint min_sueldo check (sueldo > 0));


desc dba_users;

select username from dba_users;

select username , created from dba_users;

create user prueba identified by prueba;








