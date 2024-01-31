package Servlets;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Cliente extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");

        String id = request.getParameter("txtId");
        String nombre = request.getParameter("txtNombre");
        String categoria = request.getParameter("txtCategoria");
        String direccion = request.getParameter("txtDireccion");



    try (PrintWriter out = response.getWriter()
        ) 
        
        {
           
            out.println("<html><head><title>Datos Ingresados</title></head>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Servlet2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("Se han registrados los datos Id: " + id);
            out.println("<br/>Nombre: " + nombre);
            out.println("<br/>Categoria: " + categoria);
            out.println("<br/>Direccion: " + direccion);
            out.println("</body>");
            out.println("</html>");
        }
    
            try (BufferedWriter Cliente= new BufferedWriter (new FileWriter("C:\\Users\\junio\\OneDrive\\Escritorio\\Cliente.txt"))){
                Cliente.write(id);
                Cliente.newLine();
                Cliente.write(nombre);
                Cliente.newLine();
                Cliente.write(categoria);
                Cliente.newLine();
                Cliente.write(direccion);
                Cliente.newLine();

            
        } catch (Exception e) {
            System.out.println("Error");
        }
           
    }
}
