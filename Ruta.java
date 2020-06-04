import java.util.*;
public class Ruta
{
   private String ubicacion;
   private Vector <Local> Establecimiento= new Vector<Local>();
   public Ruta(String ubicacion ){
     this.ubicacion=ubicacion;
    }
   public void setUbicacion(String ubicacion){
    this.ubicacion=ubicacion; 
    }
   public String getUbicacion(){
    return ubicacion;
    }
   public void AgregarLocal(Local l){
    Establecimiento.add(l);
    }
   public Vector <Local> Establecimientos(){
    return Establecimiento;
    }
}
