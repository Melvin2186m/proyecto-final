
public  abstract class Insumo
{
   private String tipo_Insumo;
   private double cantidad;
   public Insumo(String tipo_Insumo,double cantidad){
   this.tipo_Insumo=tipo_Insumo; 
   this.cantidad=cantidad;
   }
   public void setTipo_Insumo(String tipo_Insumo){
    this.tipo_Insumo=tipo_Insumo; 
    }
   public String getTipo_Insumo(){return tipo_Insumo;}
   public void setCantidad(double cantidad){
   this.cantidad=cantidad; 
    }
   public double getCantidad(){return cantidad;}
   
}
