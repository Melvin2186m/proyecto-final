
public class Esmalte extends Insumo
{
  private String color;
  public Esmalte(String tipo_Insumo,double cantidad,String color){
  super(tipo_Insumo,cantidad);
  this.color=color;
  }
  public void setColor(String color){
  this.color=color;
  }
  public String getColor(){return color;}
}
