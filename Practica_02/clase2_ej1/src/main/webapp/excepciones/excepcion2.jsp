<%-- 
    Document   : excepcion2
    Created on : 24/07/2020, 20:31:27
    Author     : rafaeli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Excepcion2</h1>
        <%
            // genera la excepcion NumberFormatException
            Integer.parseInt("esto no es un numero");
        %>
    </body>
</html>
