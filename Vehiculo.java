import java.util.*;
public class Vehiculo
{
 private String placa;
 private String color;
 public  Vector<Producto> Inventario_Abordo=new Vector<Producto>();
 public Vehiculo(String placa,String color){
  this.placa=placa;
  this.color=color;
    }
 public void setPlaca(String placa){
    this.placa=placa;
    }
 public String getPlaca(){return placa;}
 public void setColor(String color){
    this.color=color;
    }
 public String getColor(){return color;}
 public void InventarioAsignado(Producto p){
     Inventario_Abordo.add(p);
    }
}
