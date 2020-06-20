import java.util.*;
public class Vehiculo
{
 private String placa;
<<<<<<< HEAD
 private String modelo;
 public  Vector<Producto> Inventario_Abordo=new Vector<Producto>();
 public Vehiculo(String placa,String modelo){
=======
 private String color;
 public  Vector<Producto> Inventario_Abordo=new Vector<Producto>();
 public Vehiculo(String placa,String color){
>>>>>>> 73f318255afda8f6a2d1d52d600bca29d025e69a
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
<<<<<<< HEAD
=======
 public String getColor(){return color;}
 public void InventarioAsignado(Producto p){
     Inventario_Abordo.add(p);
    }
>>>>>>> 73f318255afda8f6a2d1d52d600bca29d025e69a
}
