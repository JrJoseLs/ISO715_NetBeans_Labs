import com.jp.ejercicios.propuestos.Conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class Usuario {
     public static boolean agregarUsuario(USER usuario){
  boolean agregado=false;
  try {
   Conexion c=new Conexion();
   Connection con=c.getConexion();
   if(con!=null){
    Statement st;
    st = con.createStatement();
    st.executeUpdate("INSERT INTO Empleado(`id`,`nombre`,`direccion`, `salario`) VALUES ('"+usuario.getNombre()+"','"+usuario.getId()+"',"+usuario.getDireccion()+",'"+usuario.getSalario()+"')");
    agregado=true;
    st.close();
   }
   c.cerrarConexion();
  } catch (SQLException e) {
   agregado=false;
   e.printStackTrace();
  }
  return agregado;
 }
    
}
