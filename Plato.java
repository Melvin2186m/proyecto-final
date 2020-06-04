
public class Plato extends Producto
{
   private boolean tipo_Hondo;
  public Plato(String nombre_Ceramica,String estado_Ceramica,boolean tipo_Hondo){
   super(nombre_Ceramica,estado_Ceramica);
   this.tipo_Hondo=tipo_Hondo;
    }
  public void setTipo_Hondo(boolean tipo_Hondo){
   this.tipo_Hondo=tipo_Hondo;
   }
  public boolean getTipo_Hondo(){return tipo_Hondo;}
}
