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
    public void setAlfareroCompleto(boolean alfareroCompleto){
    this.alfareroCompleto=alfareroCompleto;
    }
    public boolean getAlfareroCompleto(){
    return  alfareroCompleto;
    }
    public void Producirceramica_Plato( int cantidad,Inventario_Insumo I,Inventario_Producto L){
        double total=I.CantidadDisponible("arcilla");
        int total_consumir=cantidad*400;
        try {
         if(total>=total_consumir){
            for(int i=0;i<=cantidad;i++){
            L.AgregarProducto(new Plato("Plato","Natural",false));
            }
        }   
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
      public void Producirceramica_PlatoH(int cantidad,Inventario_Insumo I,Inventario_Producto L){
       double total=I.CantidadDisponible("arcilla");
        double total_consumir=cantidad*400;
        try {
         if(total>=total_consumir){
            I.modificarInventario(total_consumir,"Arcilla");
            for(int i=0;i<=cantidad;i++){
            L.AgregarProducto(new Plato("Plato","Natural",true));
            }
        }   
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void Producirceramica_TazaAsa(int cantidad,Inventario_Insumo I,Inventario_Producto L){
       
        double total=I.CantidadDisponible("arcilla");
        int total_consumir=cantidad*300;
        try {
         if(total>=total_consumir){
            I.modificarInventario(total_consumir,"Arcilla");
            for(int i=0;i<=cantidad;i++){
            L.AgregarProducto(new Taza("Taza","Natural",true));
            }
        }   
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
     public void Producirceramica_Taza(int cantidad,Inventario_Insumo I,Inventario_Producto L){
       double total=I.CantidadDisponible("arcilla");
        int total_consumir=cantidad*300;
        try {
         if(total>=total_consumir){
            I.modificarInventario(total_consumir,"Arcilla");
            for(int i=0;i<=cantidad;i++){
            L.AgregarProducto(new Taza("Taza","Natural",false));
            }
        }   
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
 }
    
  

