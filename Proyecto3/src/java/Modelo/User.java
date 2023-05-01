/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
import java.util.*;

/**
 *
 * @author Ale
 */
public class User{
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private String rol;

    public User() {}

    public User(int id, String nombre, String apellido,int edad,String rol) {
        this.id= id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad= edad;
        this.rol= rol;
        
    }
    public void insertar() {
        try {
            Connection con= Conectar.getConnection();         
            PreparedStatement inserta = con.prepareStatement("INSERT INTO tablausers (Id, Nombre,Apellido, Edad, Rol)VALUES(?,?,?,?,?)");
            inserta.setInt(1, id);
            inserta.setString(2, nombre);
            inserta.setString(3, apellido);
            inserta.setInt(4, edad);
            inserta.setString(5, rol);
            inserta.executeUpdate();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error al insertar usuario: " + e.getMessage());
        }
    }
        public List<User> consultar() {
        List<User> usuarios = new ArrayList<>();            
        try {            
            Connection con= Conectar.getConnection();            
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM tablausers");
            while (rs.next()) {
                //System.out.println("holas");
                int ID= rs.getInt("ID");
                String Nombre = rs.getString("Nombre");
                String Apellido = rs.getString("Apellido");
                int Edad = rs.getInt("Edad");
                String Rol = rs.getString("Rol");
                User user = new User (ID, Nombre, Apellido, Edad, Rol);
                //User user = new User (Nombre);
                usuarios.add(user);
            }
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error al consultar usuarios: " + ex.getMessage());
        }
        return usuarios;
    }
}