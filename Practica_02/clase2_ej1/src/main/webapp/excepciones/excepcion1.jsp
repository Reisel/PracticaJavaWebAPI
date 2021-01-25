<%-- 
    Document   : excepcion1
    Created on : 24/07/2020, 20:21:49
    Author     : rafaeli
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="/excepciones/captura-excepcion1.jsp"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Excepcion1</h1>
        <%
            // genera la excepcion NullPointerException
            String x = null;
            
            x.concat("Algo");
        %>
    </body>
</html>
