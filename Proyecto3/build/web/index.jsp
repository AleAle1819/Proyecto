<%-- 
    Document   : index
    Created on : 1/05/2023, 1:03:49 p. m.
    Author     : Ale
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro</title>
    <body>
          <h1>Registro de Datos</h1>
        <h2>A continuación ingrese los datos pedidos</h2><p></p>
        
        <form action="Mostrar.jsp" method="post">
            <h3><b>Registro Usuarios</b></h3><p></p>
            <label for="Nombre">Nombre: </label>
            <input type ="text" id="Nombre" name="Nombre" placeholder="Nombre Usuario" required=""><br>
                        
            <label for="Apellido">Apellido: </label>
            <input type ="text" id="Apellido" name="Apellido" placeholder="Apellido del Usuario" required=""><br>
            
            <label for="Edad"> Edad: </label>
            <input type ="number" id="Edad" name="Edad" required=""><p></p>
            
            <label>Rol:</label>
            <input type="radio" name="Rol" value="Paciente"> Paciente
            <input type="radio" name="Rol" value="Asesor"> Asesor<br>
            
            <% String Id =request.getParameter("Id");
            String Nombre = request.getParameter("Nombre");
            String Apellido = request.getParameter("Apellido");
            String Edad = request.getParameter("Edad")  ;
            String Rol = request.getParameter("Rol");
            //User usuario = new User(id, nombre, apellido, edad, rol);
            //user.consultar(); 
            %>        
            <input type="submit" value="Enviar respuesta">            
            
        </form> 
    </body>
</html>
