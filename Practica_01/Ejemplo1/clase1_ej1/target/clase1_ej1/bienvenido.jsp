<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1>Proyecto-Session-Login :: Bienvenido</h1>
		<hr>
		Bienvenido, <i><%=session.getAttribute("user") %>></i>
		<br><br>
		<a href="LoginServlet?accion=logout">[Logout]</a>
		<hr>
	</div>
	

</body>
</html>