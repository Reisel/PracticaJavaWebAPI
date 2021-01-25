<%@page import="com.eduit.servlets.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>bienvenido</h1>
        <hr>
        <a href="index.jsp">Ir a index.jsp</a>
        <a href="bienvenido.jsp">Ir a bienvenido.jsp</a>
        <a href="otra.jsp">Ir a otra.jsp</a>
        <hr>
        <br><br>
        <b>Datos de la sesion</b><br>
    <%
        String nombre = "<font color =red>VACIO</font>";
        String apellido = "<font color =red>VACIO</font>";
        
        Persona p = (Persona) session.getAttribute("persona");
        if (p != null) {
            nombre = "<font color =green>" + p.getNombre() + "</font>";
            apellido = "<font color =green>" + p.getApellido() + "</font>";
        }
    %>
    
    Nombre: <%=nombre%><br>
    Apellido:<%=apellido%><br>
    SessionId:<%=session.getId()%><br>
    </body>
</html>
