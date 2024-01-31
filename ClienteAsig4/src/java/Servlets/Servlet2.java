/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author junio
 */
public class Servlet2 extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String id = request.getParameter("txtId");
        String nombre = request.getParameter("txtNombre");
        String categoria = request.getParameter("txtCategoria");
        String direccion = request.getParameter("txtDireccion");
        
        try (PrintWriter out = response.getWriter()) 
        {
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("Se han registrados los datos Id: "+id);
            out.println("<br/>Nombre: "+nombre);
            out.println("<br/>Categoria: "+categoria);
            out.println("<br/>Direccion: "+direccion);
            out.println("</body>");
            out.println("</html>");
        }
    }
 }

