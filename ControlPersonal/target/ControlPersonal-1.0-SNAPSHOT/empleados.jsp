<%-- 
    Document   : empleados
    Created on : 8 jun. 2022, 20:13:12
    Author     : Camilo Estupiñan
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empleados</title>
    </head>
    <body>
        <h1>Lista de empleados</h1>
        <ul>
            <c:forEach var="empleado" items="${empleados}">
                <li>
                    ${empleado.id_empleado} ${empleado.nombres} ${empleado.apellidos} ${empleado.documento_tipo} ${empleado.documento_numero}
                
                </li>    
            
            </c:forEach>
        </ul>

    </body>
</html>
