/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.*;
//import javax.swing.JOptionPane;
/**
 *
 * @author Ale
 */
public class Conexion {     
    
    private static String driver ="com.mysql.jdbc.Driver";
    private static String cadenaConex= "jdbc:mysql://localhost:3310/basedatos";
    private static String user="root";
    private static String ctr="";
    //public static Connection con;
    public static Connection getConnection(){           
        Connection con=null;
        try{                   
            Class.forName(driver);            
            con=DriverManager.getConnection(cadenaConex,user,ctr);
            System.out.println("Conectado");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("No se pudo conectar"+e.getMessage());
            
        }
        return con;
        
    }    
}
