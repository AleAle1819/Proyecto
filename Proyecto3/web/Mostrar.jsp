<%-- 
    Document   : Mostrar
    Created on : 27/04/2023, 6:28:13 p. m.
    Author     : Ale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Consulta De Datos</title>  

    </head>
    <body> 
        <form action="index.jsp" method="post">
            <% String id =request.getParameter("Id");
                String nombre = request.getParameter("Nombre");
                String apellido = request.getParameter("Apellido");
                String edad = request.getParameter("Edad");
                String rol = request.getParameter("Rol");
                //User usuario = new User(id, nombre, apellido, edad, rol);
                //user.consultar(); 
            %> 
            <table>
                <thead>
                    <tr>
                        <th></th>
                        <th>nombre</th>
                        <th>apellido</th>
                        <th>edad</th>
                        <th>rol</th>
                    </tr>
                </thead>
                <tbody>               
                    <tr>
                        <td></td>
                        <td><%=nombre%> </td>
                        <td><%=apellido%> </td>
                        <td><%=edad%></td>
                        <td><%=rol%></td>
                    </tr>               
                </tbody>
            </table>
            <input type="submit" value="Regresar">            

        </form> 
    </body>
</html>
