
public class USER {
    
     private String nombre;
     private String id;
     private String direccion;
     private String salario;
     public String getNombre() {
      return nombre;
     }
     public void setNombre(String nombre) {
      this.nombre = nombre;
     }
     public String getId() {
      return id;
     }
     public void setId(String apellido) {
      this.id = id;
     }
     public String getDireccion() {
      return direccion;
     }
     public void setDireccion(String edad) {
      this.direccion = direccion;
     }
     public String getSalario() {
      return salario;
     }
     public void setSalario(String correo) {
      this.salario = salario;
     }

            public USER (String nombre, String id, String direccion,
              String salario) {
             super();
             this.nombre = nombre;
             this.id = id;
             this.direccion = direccion;
             this.salario = salario;
     }
}
