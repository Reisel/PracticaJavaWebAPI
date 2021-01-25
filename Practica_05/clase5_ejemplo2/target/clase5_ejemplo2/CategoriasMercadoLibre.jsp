<%-- 
    Document   : CategoriasMercadoLibre
    Created on : 08/08/2020, 16:27:46
    Author     : rafaeli
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="com.eduit.entities.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Categorias Mercado Libre</h1>
        <%
            ArrayList<Categoria> categorias = (ArrayList<Categoria>) request.getAttribute("categorias");
            out.println("<table align='center' style='width:80%'>");
            out.println("<tr>");
            out.println("<th>Codigo</th>");
            out.println("<th>Descripcion</th>");
            out.println("</tr>");
            
            for (Categoria categoria : categorias) {
                out.println("<tr align='center'>");
                out.println("<td>"+ categoria.getCodigo() +"</td>");
                out.println("<td>"+ categoria.getDescripcion() +"</td>");
                out.println("</tr>");
            }
            out.println("</table>");
        %>
        
    </body>
</html>

