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
}