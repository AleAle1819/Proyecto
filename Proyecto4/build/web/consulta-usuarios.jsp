<%-- 
    Document   : consulta-usuarios
    Created on : 1/05/2023, 7:25:00 p. m.
    Author     : Ale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="Modelo.*" %>
<%@ page import="Controlador.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Consulta de usuarios</title>
</head>
<body>
	<h1>Consulta de usuarios</h1>
	<table>
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Apellido</th>
				<th>Edad</th>
				<th>Rol</th>
			</tr>
		</thead>
		<tbody>
			<% 
    List<Usuario> usuarios = (List<Usuario>) request.getAttribute("usuarios");
    for (Usuario usuario : usuarios) { 
%>
				<tr>
					<td><%= usuario.getNombre() %></td>
					<td><%= usuario.getApellido() %></td>
					<td><%= usuario.getEdad() %></td>
					<td><%= usuario.getRol() %></td>
				</tr>
			<% } %>
                        </tbody>
                </table>
        </body>
</html>
