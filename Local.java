
public class Local
{
   private String nombre;
   private String nombre_Pro;
   private String clave_Esta;
   public Local(String nombre,String nombre_Pro,String clave_Esta){
    this.nombre=nombre;
    this.nombre_Pro=nombre_Pro;
    this.clave_Esta=clave_Esta;
    }
   public void setNombre(String nombre){
    this.nombre=nombre;
    }
   public String getNombre(){return nombre;}
   public void setNombre_Pro(String nombre_Pro){
    this.nombre_Pro=nombre_Pro;
    }
   public String getNombre_Pro(){return nombre_Pro;}
   public void setClave_Esta(String clave_Esta){
    this.clave_Esta=clave_Esta;
    }
   public String getClave_Esta(){return clave_Esta;}
}
