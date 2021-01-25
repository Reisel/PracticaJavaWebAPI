<%@page import="com.eduit.servlets.Persona"%>
<html>
<body>
    <h2>index.jsp</h2>
    <hr>
    <a href="index.jsp">Ir a index.jsp</a>
    <a href="bienvenido.jsp">Ir a bienvenido.jsp</a>
    <a href="otra.jsp">Ir a otra.jsp</a>
    <hr>
    <br><br>
    <form method="POST" action="CargarDatosServlet">
        Nombre:<input type="text" name="nombre"><br>
        Apellido:<input type="text" name="apellido"><br><br>
        <input type="submit" value="Cargar datos">
    </form>
    <br><br>
    <hr>
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
    <br>
    <a href="destruir-sesion.jsp">Destruir sesion</a>
</body>
</html>
