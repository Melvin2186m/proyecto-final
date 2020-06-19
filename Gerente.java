
public class Gerente extends Trabajador
{
    public Gerente(String nombre_Tra,String ide_Tra){
    super(nombre_Tra,ide_Tra);
    }
    public void comprarProvedor(Provedor Prove,String nombre_Insumo,double cantidad,double monto,Inventario_Insumo i){
    new Compra(Prove,nombre_Insumo, cantidad,monto);
    Insumo p;
    try {
       if(nombre_Insumo.equalsIgnoreCase("arcilla")){
            p=new Arcilla(nombre_Insumo,cantidad);
            i.agreagarInsumo(p);
            }
       if(nombre_Insumo.equalsIgnoreCase("pintura")){
            p=new Pintura(nombre_Insumo,cantidad);
            i.agreagarInsumo(p);
        }
       if(nombre_Insumo.equalsIgnoreCase("esmalte")){
           p=new Pintura(nombre_Insumo,cantidad);
           i.agreagarInsumo(p);
        }
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }
  }
}
