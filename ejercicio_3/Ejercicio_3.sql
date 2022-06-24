DELIMITER //
CREATE PROCEDURE proced_Ejercicio_3 ()
BEGIN
#1. Citas-Pacientes-Medicos
SELECT A.CitNumero
		,B.PacNombres
        ,B.PacApellidos
        ,C.MedNombres
        ,C.MedApellidos
FROM CITAS A
INNER JOIN PACIENTES B
ON A.pacientes_PacIdentificacion = B.PacIdentificacion
INNER JOIN MEDICOS C
ON A.Medicos_MedIdentificacion = C.MedIdentificacion;

#2 citas-consultorio
SELECT A.CitNumero
		,A.CitHora
        ,B.ConNombre
FROM CITAS A
INNER JOIN CONSULTORIOS B
ON A.consultorios_ConNumero = B.conNumero;

#3 Citas-Medicos
SELECT A.CitMedico
		,A.CitFecha
        ,A.CitHora
        ,B.MedIdentificacion
        ,B.MedNombre
        ,B.MedApellidos
FROM CITAS A
INNER JOIN MEDICOS B
ON medicos_MedIdentificacion = MedIdentificacion;

#4 Citas-Pacientes-Tratamientos
SELECT A.CitNumero
		,B.PacIdentificacion
        ,B.PacNombres
        ,B.PacApellidos
        ,C.TraNumero
        ,C.TraFechaInicio
        ,C.TraFechaFin
        ,C.TraDescripcion
FROM CITAS A
INNER JOIN PACIENTES B
ON A.pacientes_PacIdentificacion = B.PacIdentificacion
INNER JOIN TRATAMIENTOS C
ON B.PacIdentificacion = C.pacientes_PacIdentificacion;

#5 Citas-pacientes
SELECT A.CitNumero
		,A.CitFecha
        ,B.PacNombres
        ,B.PacApellidos
        ,B.PacSexo
FROM CITAS A
INNER JOIN PACIENTES B
ON A.pacientes_PacIdentificacion = B.PacIdentificacion;

END //
DELIMITER ;