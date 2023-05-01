/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controler;
//import Modelo.*;
import Modelo.*;
import jakarta.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import java.util.List;

/**
 *
 * @author Ale
 */
@WebServlet(name = "ConsultaUser", urlPatterns = {"/ConsultaUser"})
public class ConsultaUser extends HttpServlet {
         
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConsultaUser</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConsultaUser at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user= new User();  
            
         ///List<User> usuarios = User.consultar();
        request.setAttribute("usuarios", user);
        //RequestDispatcher rd = request.getRequestDispatcher("Mostrar.jsp");
        user.consultar();
        //rd.forward(request, response);
    }
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {        
        int id =Integer.parseInt(request.getParameter("Id"));
        String nombre = request.getParameter("Nombre");
        String apellido = request.getParameter("Apellido");
        int edad = Integer.parseInt(request.getParameter("Edad"));
        String rol = request.getParameter("Rol");
        User usuario = new User(id, nombre, apellido, edad, rol);
        usuario.insertar();
        response.sendRedirect("User.java");
    }   
    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}



