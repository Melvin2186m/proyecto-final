
public class Empresa extends Provedor
{
   private String nombre_Representante;
   private String clave_Representante;
   public Empresa(String nombre_Pro,String nombre_Representante,String clave_Representate){
    super(nombre_Pro);
    this.nombre_Representante=nombre_Representante;
    this.clave_Representante=clave_Representante;
    }
   public void setNombre_Representante(String nombre_Representante){
    this.nombre_Representante=nombre_Representante;
    }
   public String getNombre_Representante(){return nombre_Representante;}
   public void setClave_Representante(String clave_Representante){
    this.clave_Representante=clave_Representante;
    }
   public String getClave_Representante(){return clave_Representante;}
}
