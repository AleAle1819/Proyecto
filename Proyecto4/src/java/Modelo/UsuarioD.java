/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ale
 */
public class UsuarioD {
    private Connection conexion;

    public UsuarioD() {
        conexion = Conexion.getConnection();
    }

    public boolean agregarUsuario(Usuario usuario) {
        boolean resultado = false;
        try {
            PreparedStatement ps = conexion.prepareStatement("INSERT INTO tablausers (nombre, apellido, edad, rol) VALUES (?, ?, ?, ?)");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setInt(3, usuario.getEdad());
            ps.setString(4, usuario.getRol());
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultado;
    }

    public List<Usuario> seleccionarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        try {
            PreparedStatement ps = conexion.prepareStatement("SELECT nombre, apellido, edad, rol FROM tablausers");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                int edad = rs.getInt("edad");
                String rol = rs.getString("rol");
                Usuario usuario = new Usuario(nombre, apellido, edad, rol);
                usuarios.add(usuario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuarios;
    }
}
