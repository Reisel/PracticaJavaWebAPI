<%-- 
    Document   : captura-excepcion1
    Created on : 24/07/2020, 20:26:13
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
        <h1>Captura de excepcion via directiva de pagina</h1>
        <br>
        <%
            out.println("<b>Excepcion: </b>" + exception + "<hr>");
            out.println("<b>Mensaje Excepcion: </b>" + exception.getMessage());
        %>
    </body>
</html>
