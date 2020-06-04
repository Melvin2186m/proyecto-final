public class Pintura extends Insumo
{
  private String color;
  public Pintura(String tipo_Insumo,double cantidad,String color){
  super(tipo_Insumo,cantidad);
  this.color=color;
  } 
  public void setColor(String color){
  this.color=color;  
  }
  public String getColor(){return color;}
}
