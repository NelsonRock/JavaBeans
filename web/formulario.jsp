<%-- 
    Document   : formulario
    Created on : 08-feb-2013, 11:02:39
    Author     : rcerrato
--%>

<%@page contentType="text/html" session="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            
            form{margin-top: 200px;
                margin-left: 400px;
                margin-right: auto;
                font-size: 21px;
            }
            fieldset{
                width: 300px;
                
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <form action="/Incidencias/registro.jsp" method=POST >
        <fieldset>
            <jsp:useBean id="inc" scope="session" class="Clases.Incidencia" />
            <legend>Datos de Registro</legend>
            Email: <input type="text" name="email" disabled="true" value=<%=inc.getEmail()%> /><br>
             Telefono:<input type="text" name="telefono" /><br>
             Nombre:<input type="text" name="nombre" /><br>
             Apellidos:<input type="text" name="apellidos" /><br>
        </fieldset>
            <input type="submit" name="reg" value="Registrar" />
        </form>
    </body>
</html>
