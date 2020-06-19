import java.util.*;
public class Inventario_Insumo
{
    public  Vector<Insumo> lista_Insumo=new Vector<Insumo>();
    
    public  void agreagarInsumo(Insumo i){
      lista_Insumo.add(i);
    }
     public  double CantidadDisponible(String tipoDe_Insumo){
     double cantidad_disponible=0;
       for (Insumo I:lista_Insumo ){
          if (I.getTipo_Insumo().equalsIgnoreCase(tipoDe_Insumo)){
            cantidad_disponible=+I. getCantidad();
            }
     } return cantidad_disponible;
  }
  public void modificarInventario(double cantidad,String tipo_insumo ){
      Insumo o=null;
      double cantidad_Crear;
      double contador=0.0;
      for (Insumo I:lista_Insumo ){
       if(I.getTipo_Insumo().equalsIgnoreCase(tipo_insumo)){
         contador=+I.getCantidad();
         lista_Insumo.remove(I);
        }
    }
    cantidad_Crear=contador-cantidad;
     if(cantidad_Crear>0.0){
       if(tipo_insumo.equalsIgnoreCase("arcilla"))
       o=new Arcilla("Arcilla",cantidad_Crear);
       if(tipo_insumo.equalsIgnoreCase("pintura"))
       o=new Pintura("Pintura",cantidad_Crear);
       if(tipo_insumo.equalsIgnoreCase("esmalte"))
       o=new Esmalte("Pintura",cantidad_Crear);
       
     lista_Insumo.add(o);
    }
     }
    

}