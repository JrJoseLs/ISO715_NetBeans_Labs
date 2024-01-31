package Servlets;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
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
public class Vista extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        String Id = request.getParameter("txtId");
        String Nombre = request.getParameter("txtNombre");
        String Categoria = request.getParameter("txtCategoria");
        String Direccion = request.getParameter("txtDireccion");
        
        
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter())
        {
            out.println("txtId" + Id);
            out.println("txtNombre" + Nombre);
            out.println("txtCategoria" + Categoria);
            out.println("txtDireccion" + Direccion);
        }
    }

}
