  public abstract class Trabajador  {
 protected String nombre_Tra;
 protected String ide_Tra;
 public Trabajador(String nombre_Tra,String ide_Tra){
    this.nombre_Tra=nombre_Tra;
    this.ide_Tra=ide_Tra;
    }
   public void setNombre_Tra(String nombre_Tra){
    this.nombre_Tra=nombre_Tra;
    } 
   public String getNombre_Tra(){return nombre_Tra;}
   public void setIde_Tra(String ide_Tra){
    this.ide_Tra=ide_Tra;
    }
   public String getIde_Tra(){return ide_Tra;}
   
}
