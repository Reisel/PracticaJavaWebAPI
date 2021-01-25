<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<div align="center">
		<h1>Proyecto-Sessions-Login : : Login</h1>
	</div>
	<hr>
	<div align="center">
		<form method="POST" action="LoginServlet">
			<input type="hidden" name="accion" value="login">
			username:<input type="text" name="username">
			<br><br>
			password:<input type="password" name="password">
			<br>
			<hr>
			
			<input type="submit" value="Login"><br>
			<font color="red">
			<% if (session.getAttribute("error") != null) {
				out.print(session.getAttribute("error"));
			} %>
			</font>
		</form>
	</div>
</body>
</html>