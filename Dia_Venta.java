
import java.util.Vector;
import java.util.Date;
public class Dia_Venta
{
   private Date fecha;
   private Repartidor Vendedor;
   private Ruta Ruta;
   private Vehiculo Vehiculo;
   
   Vector<Producto> Inventario_Abordo = new Vector<Producto>(); 
   
   public Dia_Venta(Repartidor Vendedor, Ruta Ruta,Vehiculo Vehiculo){
     this.Vendedor=Vendedor;
     this.Ruta=Ruta;
     this.Vehiculo=Vehiculo;
     fecha = new Date();
    }
   public void setNombre_Vendedor(Repartidor Vendedor){
    this.Vendedor=Vendedor;
    }
   public Repartidor getNombre_Vendedor(){
    return Vendedor;
    }
   public void setNombre_Ruta(Ruta Ruta){
    this.Ruta=Ruta;
    }
   public Ruta getNombre_Ruta(){
    return Ruta;
    }
   public void setClave_Vehiculo(Vehiculo Vehiculo){
    this.Vehiculo=Vehiculo;
    }
   public Vehiculo getClave_Vehiculo(){
   return Vehiculo; 
    }
   public void  Ventas_Realizadas(){
    }
   public void  Inventario_Asignado(){
    }
}
