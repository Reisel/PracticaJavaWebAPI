<%-- 
    Document   : captura-excepcion2
    Created on : 24/07/2020, 20:37:28
    Author     : rafaeli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Captura de excepcion via contenedor</h1>
        <br>
        <%
            out.println("<b>Excepcion: </b>" + exception + "<hr>");
            out.println("<b>Mensaje Excepcion: </b>" + exception.getMessage());
        %>
    </body>
</html>
