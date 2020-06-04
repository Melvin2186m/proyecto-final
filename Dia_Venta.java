
import java.util.Vector;
import java.util.Date;
public class Dia_Venta
{
   private Date fecha;
   private String nombre_Vendedor;
   private String nombre_Ruta;
   private String clave_Vehiculo;
   
   Vector<Producto> productos_Vender = new Vector<Producto>(); 
   
   public Dia_Venta(String nombre_Vendeddor,String nombre_Ruta,String clave_Vehiculo){
     this.nombre_Vendedor=nombre_Vendedor;
     this.nombre_Ruta=nombre_Ruta;
     this.clave_Vehiculo=clave_Vehiculo;
     fecha = new Date();
    }
   public void setNombre_Vendedor(String nombre_Vendedor){
    this.nombre_Vendedor=nombre_Vendedor;
    }
   public String getNombre_Vendedor(){
    return nombre_Vendedor;
    }
   public void setNombre_Ruta(String nombre_Ruta){
    this.nombre_Ruta=nombre_Ruta;
    }
   public String getNombre_Ruta(){
    return nombre_Ruta;
    }
   public void setClave_Vehiculo(String clave_Vehiculo){
    this.clave_Vehiculo=clave_Vehiculo;
    }
   public String getClave_Vehiculo(){
   return clave_Vehiculo; 
    }
   public void  Ventas_Realizadas(){
    }
   public void  Inventario_Asignado(){
    }
}
