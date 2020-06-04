
public abstract class Provedor
{
  protected String nombre_Pro;
  public Provedor(String nombre_Pro){
    this.nombre_Pro=nombre_Pro;
    }
  public void setNombre_Pro(String nombre_Pro){
   this.nombre_Pro=nombre_Pro;
    }
  public String getNombre_Pro(){
    return nombre_Pro;
    }
}
