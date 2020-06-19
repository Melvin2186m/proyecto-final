public class Repartidor extends Trabajador
{
   private String num_Licen;
   public Repartidor(String nombre_Tra,String ide_Tra,String num_Licen){
    super(nombre_Tra,ide_Tra);
    this.num_Licen=num_Licen;
    }
   public void setNum_Licen(String num_Licen){
    this.num_Licen=num_Licen;
    }
   public String getNum_Licen(){return num_Licen;}
   public void vender(String clave_Cliente,int cantidad,String clave_Vendedor){
    
    }
}
