import java.util.*;
public class Vehiculo
{
 private String placa;
 private String modelo;
 public  Vector<Producto> Inventario_Abordo=new Vector<Producto>();
 public Vehiculo(String placa,String modelo){
  this.placa=placa;
  this.modelo=modelo;
    }
 public void setPlaca(String placa){
    this.placa=placa;
    }
 public String getPlaca(){return placa;}
 public void setModelo(String modelo){
    this.modelo=modelo;
    }
 public String getModelo(){return modelo;}
 public void InventarioAsignado(Producto p){
     Inventario_Abordo.add(p);
    }
}
