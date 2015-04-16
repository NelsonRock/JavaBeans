<%-- 
    Document   : registro
    Created on : 08-feb-2013, 9:01:34
    Author     : rcerrato
--%>

<%@page contentType="text/html" import=" bbdd.*, Clases.*" session="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<jsp:useBean id="inc" class="Clases.Incidencia" scope="session" />
        <jsp:setProperty name="inc" property="*" />
 <jsp:useBean id="usub" class="Clases.Usuario" scope="session" />
 <jsp:setProperty name="usub" property="*" />
<%--<jsp:useBean id="incMail" class="Clases.Inceidencia" scope="session" />
<jsp:setProperty name="email" property="" />--%>
 <html>
    <head>
        <style>
            table{
                margin-left: auto;
                margin-right: auto;
                border: 1px solid brown;
                
            }
            td{
                border: 1px solid aqua;
                
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1 align="center">DATOS DE INCIDENCIA</h1>
        <% BaseDatos mibase= new BaseDatos("jdbc:odbc:incidencia","sun.jdbc.odbc.JdbcOdbcDriver");
        /* ClassforName("org.gjt.mm.mysqlDriver")   DriverManager.getconnection("jdbc:mysql://localhost/basededatos a usar",""usuario", contraseña"");*/
        boolean exito=false;
        String error=mibase.abrir();
        Usuario usu=null;
        Incidencia mI=null;
        if(error.equals("")){
            exito=BDInc.añadirIncidencia(inc, mibase);
            usu=BDInc.buscarUsuarioObjeto(inc, mibase);
        }
        else{
            %>
            <h1>Problemas con base dedatos</h1>
            <%  
            }
        mI=BDInc.buscarIdIncidencia(inc, mibase);
        if(exito && usu!=null){
            %>
            <table>    
                <tr>
                    <th>Numero de incidencia</th>
                    <th>Nombre</th>
                </tr>
                <tr>
                    <td><%=mI.getIde()%></td>
                    <td> <%= usu.getNombre()%></td>
                </tr>
            </table>  
            <%
        }
        if(usu==null){
            %>
            <jsp:forward page="/formulario.jsp" />
            <%
            }
        if(request.getParameter("reg").equals("Registrar"))
            exito=BDInc.añadirUsuario(usub, mibase);
        
        if(exito){
            %>
            <table>    
                <tr>
                    <th>Numero de incidencia</th>
                    <th>Nombre</th>
                </tr>
                <tr>
                    <td><%=mI.getIde()%></td>
                    <td><jsp:getProperty name="usub" property="nombre" /></td>
                </tr>
            </table>  
            
            <%
        }
         else{
            %>
            <h1>No se pudo insertar usuario</h1>
            <%
        }
        mibase.cerrar();
        %>
    </body>
</html>
