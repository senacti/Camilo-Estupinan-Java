create database ejercicio_2;
use ejercicio_2;

create table pacientes (
PacIdentificacion char(10) not null,
PacNombres varchar(50) not null,
PacApellidos varchar(50) not null,
PacFechaNacimiento date not null,
PacSexo char(1),
primary key (PacIdentificacion)
);

create table medicos (
MedIdentificacion char(10) not null,
MedNombres varchar(50) not null,
MedApellidos varchar(50) not null,
primary key (MedIdentificacion)
);

create table Consultorios (
ConNumero int(3) not null,
ConNombre varchar(50) not null,
primary key (ConNumero)
);

create table Tratamientos (
TraNumero int auto_increment,
TraFechaAsignado date not null,
TraDescripcion text not null,
TraFechaInicio date not null,
TraFechaFin date not null,
TraObservaciones text not null,
TraPaciente char(10) not null,
primary key (TraNumero)
);

create table citas (
CitNumero int not null,
CitFecha date not null,
CitHora datetime not null,
CitPaciente varchar(50) not null,
CitMedico varchar(50) not null,
CitConsultorio int(4) not null,
CitEstado char(45) not null,
CitObservaciones varchar(200), 
primary key (CitNumero)	
);

insert into pacientes values
('1098765678', 'Carolina', 'Rojas Zabala', '1984-06-28'),
('77191950', 'Carlos Jose', 'Arias Rojas', '1980-04-12'),
('37821203', 'Mari Fernanda', 'Rodriguez Perez', '1970-07-28'),
('63502720', 'Carolina', 'Rojas Perez', '1980-04-12'),
('1098765678', 'Maria Carolina', 'Rojas Zabala', '1984-06-28'),
('63502730', 'María Alejandra', 'Torres Cañas', '1972-10-15')
;

insert into medicos values
('1019070408', 'Carlos Andres', 'Perez Rodriguez'),
('1287563', 'Maria Fernanda', 'Torres Gonsalez'),
('5634572', 'Cristian Mauricio', 'Diaz Ruiz'),
('1010292376', 'Diana Lucia', 'Ramos');

insert into consultorios values
(123, 'consultorio 1'),
(456, 'consultorio 2'),
(789, 'consultorio 3'),
(212, 'consultorio 4');

insert into citas values
(1, '2022-05-04', '18:00', 'Carlos Jose Arias Rojas', 'Diana Lucia Ramos', 'consultorio 2', 'Agendada', 'ninguna', 1010292376, 456, 77191950),
(2, '2022-05-03', '17:00', 'Carolina Rojas Perez', 'Maria Fernanda Torres Gonsalez', 'consultorio 1', 'Cancelada', 'ninguna', 1287563, 123, 63502720),
(3, '2022-05-05', '15:00', 'Maria Carolina Rojas Zabala', 'Carlos Andres Perez Rodriguez','consultorio 4' , 'Agendada', 'ninguna', 1019070408, 212, 1098765678),
(4, '2022-05-07', '18:00', 'Carlos Jose Arias Rojas', 'Diana Lucia Ramos', 'consultorio 1', 'Cancelada', 'ninguna', 1010292376, 123, 77191950),
(5, '2022-05-09', '16:00', 'Carolina Rojas Perez', 'Cristian Mauricio Diaz Ruiz', 'consultorio 3', 'Agendada', 'ninguna', 5634572, 789, 63502720),
(6, '2022-05-05', '13:00', 'Maria Carolina Rojas Zabala', 'Diana Lucia Ramos', 'consultorio 2', 'Agendada', 'ninguna', 1010292376, 456, 1098765678);

insert into tratamientos values
(1, 2022-04-01, 'laboratorio medico', '2022-04-19', '2022-04-19', '', 'Carlos Jose Arias Rojas', '77191950'),
(2, 2022-04-03, 'ortopedia', '2022-04-11', '2022-04-29', '', 'Carlos Jose Arias Rojas', '77191950'),
(3, 2022-03-10, 'laboratorio medico', '2022-05-03', '2022-05-03', '', 'Maria Carolina Rojas Zabala', '1098765678'),
(4, 2022-02-03, 'laboratorio medico', '2022-04-15', '2022-04-15', '', 'Mari Fernanda', 'Rodriguez Perez', '37821203');


 