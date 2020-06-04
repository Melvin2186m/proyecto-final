import java.util.*;
public class Alfarero extends Trabajador
{
   private Vector<Producto> ceramica_Natural=new Vector<Producto>();
   private boolean alfareroCompleto;
   private double paga;
   public Alfarero(String nombre_Tra,String ide_Tra,boolean alfareroCompleto){
    super(nombre_Tra,ide_Tra);
    this.alfareroCompleto=alfareroCompleto;
    }
    public void Pagar(){
        double un_dia=300.00;
        double una_Pieza=8.00;
       if(alfareroCompleto==true){
         
        }
    }
    public void Producirceramica( int cantidad,String tipo_Ceramica ){
        Inventario_Insumo I=null;
        double total=I.CantidadDisponible(tipo_Ceramica);
        
        try {
         if(total>=utilizar)
            
            
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
  }

