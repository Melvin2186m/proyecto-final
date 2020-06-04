import java.util.*;
public class Inventario_Producto
{
  private Vector<Producto> lista_Productos=new Vector<Producto>();
  private Vector<Producto> lista_Vender=new Vector<Producto>();
  
  public void AgregarProducto(Producto p){
    lista_Productos.add(p);
    }
  public void litaAsignar(Producto p){
    lista_Vender.add(p);
    }
    
}
