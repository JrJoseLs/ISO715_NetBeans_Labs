package Servlet;


import Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import static javafx.css.StyleOrigin.USER;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.nashorn.internal.runtime.Debug.id;


public class ManejoEmpleado extends HttpServlet {
 private static final long serialVersionUID = 1L;

    public ManejoEmpleado() {
    }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String nombre=request.getParameter("nombre");
         String apellido=request.getParameter("id");
         String edad=request.getParameter("direccion");
         String correo=request.getParameter("salario");

         if(!nombre.equalsIgnoreCase("") && !apellido.equalsIgnoreCase("") && !edad.equalsIgnoreCase("") && !correo.equalsIgnoreCase("") && !usuario.equalsIgnoreCase("") && !clave.equalsIgnoreCase("")){
          USER busuario=new USER(nombre, id, direccion, salario);
          boolean sw=Usuario.agregarUsuario(USER);
          if(sw){
           request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
          }else{
           PrintWriter out=response.getWriter();
           out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
          }
         }
        }

        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         String nombre=request.getParameter("nombre");
         String apellido=request.getParameter("apellido");
         String edad=request.getParameter("edad");
         String correo=request.getParameter("correo");
         String usuario=request.getParameter("usuario");
         String clave=request.getParameter("clave");
         if(!nombre.equalsIgnoreCase("") && !apellido.equalsIgnoreCase("") && !edad.equalsIgnoreCase("") && !correo.equalsIgnoreCase("") && !usuario.equalsIgnoreCase("") && !clave.equalsIgnoreCase("")){
          USER busuario=new USER(nombre, id, direccion, salario);
          boolean sw=USER.agregarUsuario(busuario);
          if(sw){
           request.getRequestDispatcher("Mensaje.jsp").forward(request, response);
          }else{
           PrintWriter out=response.getWriter();
           out.println("Si estas viendo este mensaje es por que algo salio mal, no se pudo completar tu solicitud.");
          }
         }
        }
       }



    
