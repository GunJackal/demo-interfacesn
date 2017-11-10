<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="com.qualitas.demointerfaces.entities.Cliente"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h1>Catálogo de clientes</h1>
		<h2>
			Clientes encontrados:

			<%
			List<Cliente> clientes = (List<Cliente>) session.getAttribute("clientes");
			out.println(clientes.size());
		%>

			<table class="table table-hover">
				<%
					for (Cliente cliente : clientes) {
						out.println("<tr>");
						out.println("<td>");
						out.println(cliente.getNombre());
						out.println("</td>");
						out.println("<td>");
						out.println(cliente.getDireccion());
						out.println("</td>");
						out.println("<td>");
						out.println(cliente.getPoliza().getNumero());
						out.println("</td>");
						out.println("</tr>");
					}
				%>
			</table>
		</h2>
	</div>
</body>
</html>