<%-- 
    Document   : index
    Created on : 1/05/2023, 6:56:52 p. m.
    Author     : Ale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Agregar usuario</title>
</head>
<body>
	<h1>Agregar usuario</h1>
	<% if (request.getAttribute("mensaje") != null) { %>
		<p><%= request.getAttribute("mensaje") %></p>
	<% } %>
	<form method="post" action="AgregarUsuarioServlet">
		<label for="nombre">Nombre:</label>
		<input type="text" id="nombre" name="nombre" required>
		<br>
		<label for="apellido">Apellido:</label>
		<input type="text" id="apellido" name="apellido" required>
		<br>
		<label for="edad">Edad:</label>
		<input type="number" id="edad" name="edad" required>
		<br>
		<label for="rol">Rol:</label>
		<select id="rol" name="rol">
			<option value="paciente">Paciente</option>
			<option value="asesor">Asesor</option>
		</select>
		<br>
		<button type="submit">Agregar</button>
	</form>
</body>
</html>
