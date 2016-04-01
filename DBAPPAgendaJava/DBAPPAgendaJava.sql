drop database DBAPPAgendaJava
create database DBAPPAgendaJava;
use DBAPPAgendaJava;

--Los usuarios que accederan al sistema y realizaran las actividades en este
--un usuario va a poder crear una actividad y todos lo amigos podran verlas
create table TUsuario
(
codigoUsuario char(15) not null,
nombre varchar(30) not null,
apellidoPaterno varchar(20) not null,
apellidoMaterno varchar(20) not null,
correoElectronico varchar(30) not null,
contrasenia varchar(700) not null,
fechaNacimiento datetime not null,
sexo char(1) not null,
telefono varchar(20) not null,
fechaRegistro datetime default getdate(),
fechaModificacion datetime default getdate(),
primary key(codigoUsuario)
);

--One to Many
--Los contactos de este amigo. En la que estaran los amigos de un solo amigo.
create table TUsuarioAmigo
(
codigoUsuarioAmigo char(15) not null,
codigoUsuario char(15) not null,
nombre varchar(30) not null,
apellidoPaterno varchar(20) not null,
apellidoMaterno varchar(20) not null,
correoElectronico varchar(30) not null,
contrasenia varchar(700) not null,
fechaNacimiento datetime not null,
sexo char(1) not null,
telefono varchar(20) not null,
fechaRegistro datetime  default  getdate(),
fechaModificacion datetime default  getdate(),
foreign key(codigoUsuario) references TUsuario(codigoUsuario)
on update cascade on delete cascade,
primary key(codigoUsuarioAmigo)
);

--uno de nuestros amigos podria tener mas de un telefono
create table TUsuarioAmigoTelefono
(
codigoUsuarioAmigoTelefono char(15) not null,
codigoUsuarioAmigo char(15) not null,
descripcion varchar(max) not null,
telefono varchar(20) not null,
fechaRegistro datetime  default getdate(),
fechaModificacion datetime  default getdate(),
foreign key(codigoUsuarioAmigo) references TUsuarioAmigo(codigoUsuarioAmigo)
on update cascade on delete cascade,
primary key(codigoUsuarioAmigoTelefono)
);

--medida de los gastos en comida y demas de la tabla TActividadPresupuesto
create table TUnidadMedida
(
codigoUnidadMedida char(15) not null,
nombre varchar(30) not null,
descripcion varchar(max) not null,
fechaRegistro datetime  default getdate(),
fechaModificacion datetime  default getdate(),
primary key (codigoUnidadMedida)
);


create table TActividad
(
codigoActividad char(15) primary key not null,
codigoUsuario char(15) not null,
nombre varchar(700) not null,
descripcion varchar(max) not null,
fechaInicio datetime not null,
fechaFin datetime not null,
presupuestoTotal decimal(8, 2) not null,
estado char(1) not null,
fechaRegistro datetime default getdate(),
fechaModificacion datetime default getdate(),
foreign key(codigoUsuario) references TUsuario(codigoUsuario)

);

--gastos, es decir compras de articulos para actividad
create table TActividadPresupuesto
(
codigoActividadPresupuesto char(15) not null,
codigoActividad char(15) not null,
codigoUnidadMedida char(15) not null,
descripcion varchar(max) not null,
precioUnitario decimal(8, 2) not null,
cantidad float not null,
fechaRegistro datetime  default getdate(),
fechaModificacion datetime  default getdate(),
foreign key(codigoActividad) references TActividad(codigoActividad)
on update cascade on delete cascade,
foreign key(codigoUnidadMedida) references TUnidadMedida(codigoUnidadMedida)
on update cascade on delete cascade,
primary key(codigoActividadPresupuesto)
);

create table TActividadParticipante
(
codigoActividadParticipante char(15) not null,
codigoActividad char(15) not null,
codigoUsuarioAmigo char(15) not null,
fechaRegistro datetime default getdate(),
fechaModificacion datetime default getdate(),
foreign key(codigoActividad) references TActividad(codigoActividad)
on update cascade on delete cascade,
foreign key(codigoUsuarioAmigo) references TUsuarioAmigo(codigoUsuarioAmigo)
on update cascade on delete cascade,
primary key(codigoActividadParticipante)
);

create table TActividadComentario
(
codigoActividadComentario char(15) not null,
codigoActividad char(15) not null,
codigoUsuarioAmigo char(15) not null,
comentario varchar(max) not null,
fechaRegistro datetime  default getdate(),
fechaModificacion datetime  default getdate(),
foreign key(codigoActividad) references TActividad(codigoActividad)
on update cascade on delete cascade,
foreign key(codigoUsuarioAmigo) references TUsuarioAmigo(codigoUsuarioAmigo)
on update cascade on delete cascade,
primary key(codigoActividadComentario)
);

--------------------TRIGGER PARA CREAR CODIGO USUARIO-------------------------
ALTER TRIGGER TG_Codigo_Usuario ON [dbo].[TUsuario]
FOR INSERT
AS
DECLARE @codigo char(15), @part1 char(15), @nombre varchar(50), @apellido varchar(50)

select  @nombre = nombre, @apellido = apellidoPaterno
from inserted 

set @part1 = cast((select COUNT(codigoUsuario) from TUsuario) + 1  as char)
set @codigo = 'COD-'+ @part1

update TUsuario
SET codigoUsuario = @codigo
WHERE nombre = @nombre and apellidoPaterno = @apellido


--------------------TRIGGER PARA FECHA MODIFICADO-------------------------
CREATE TRIGGER TG_Update_Fechas_ ON [dbo].[TUsuario]
FOR INSERT
AS
DECLARE  @fechaMod datetime,  @codigo char(10)

select  @codigo = codigoUsuario
from inserted 

set @fechaMod = GETDATE()

update TUsuario
SET fechaModificacion = @fechaMod
WHERE codigoUsuario = @codigo 

--------------------TRIGGER PARA FECHA PRIMERA CREACION-------------------------
CREATE TRIGGER TG_Insert_Fechas ON [dbo].[TUsuario]
FOR INSERT
AS
DECLARE @fechaReg datetime, @fechaMod datetime, @nombre varchar(50), @apellido varchar(50)

select  @nombre = nombre, @apellido = apellidoPaterno
from inserted 

set @fechaReg = GETDATE()
set @fechaMod = GETDATE()

UPDATE TUsuario
SET fechaRegistro = @fechaReg, fechaModificacion = @fechaMod
WHERE nombre = @nombre and apellidoPaterno = @apellido



select * from TUsuario
