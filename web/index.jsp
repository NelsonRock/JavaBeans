<%-- 
    Document   : index
    Created on : 06-feb-2013, 11:05:01
    Author     : rcerrato
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Incidencias</h1>
        <form action="/Incidencias/registro.jsp" method=POST >
            Mail: <input type="text" name="email" /> <br>
            Software: <select name="aplicaciones"> 
                <option value="xp">Windows XP</option>
                <option value="ubuntu">Ubuntu</option>
                <option value="vista">Windows Vista</option>
            </select><br>
            Descripcion del problema : <br><textarea name="descripcion" rows="3" cols="20" >

            </textarea>
            <input type="submit" value="Enviar" />
        </form>
    </body>
</html>
