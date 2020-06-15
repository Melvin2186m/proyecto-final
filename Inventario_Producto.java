import java.util.*;
public class Inventario_Producto
{
  public  Vector<Producto> lista_Productos=new Vector<Producto>();
  public  Vector<Producto> lista_Vender=new Vector<Producto>();
  
  public void AgregarProducto(Producto p){
    lista_Productos.add(p);
    }
  public void litaAsignar(Producto p){
    lista_Vender.add(p);
    }
  public int ExisteciaPlato(String estado){
    int contador=0;
    while(contador<ExistenciadeProducto_Plato(estado).size()){
    contador++;
    }
    return contador;
    }
  public int ExisteciaTaza(String estado){
    int contador=0;
    while(contador<ExistenciadeProducto_Taza(estado).size()){
    contador++;
    }
    return contador;
    }
  public Vector<Producto> ExistenciadeProducto_Taza(String estado){
      Vector<Producto> lista_Solicitada=new Vector<Producto>();
      for (Producto p:lista_Productos){
        if(p instanceof Taza){
        if (p.getEstado_Ceramica().equalsIgnoreCase(estado)){
          lista_Solicitada.add(p);
          
         }
        }
       }
      return lista_Solicitada;
    }
  public Vector<Producto> ExistenciadeProducto_Plato(String estado){
     Vector<Producto> lista_Solicitada=new Vector<Producto>();
      for (Producto p:lista_Productos){
        if(p instanceof Plato){
        if (p.getEstado_Ceramica().equalsIgnoreCase(estado)){
          lista_Solicitada.add(p);
         }
        }
       }
      return lista_Solicitada;
    }
  
}
