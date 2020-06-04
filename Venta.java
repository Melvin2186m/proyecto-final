public class Venta
{
  private String fecha;
  private String clave_Cliente;
  private int cantidad;
  private String clave_Vendedor;
  public Venta(String fecha,String clave_Cliente,int cantidad,String clave_Vendedor){
    this.fecha=fecha;
    this.clave_Cliente=clave_Cliente;
    this.cantidad=cantidad;
    this.clave_Vendedor=clave_Vendedor;
    }
  public void setFecha(String fecha){
    this.fecha=fecha;
    }
  public String getFecha(){return fecha;}
  public void setClave_Cliente(String clave_Cliente){
  this.clave_Cliente=clave_Cliente; 
    }
  public String getClave_Cliente(){
   return clave_Cliente;
    }
  public void setCantidad(int cantidad){
    this.cantidad=cantidad;
    }
  public int getCantidad(){return cantidad;}
}
