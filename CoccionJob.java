public class CoccionJob extends Trabajador
{
    public CoccionJob(String nombre_Tra,String ide_Tra){
    super(nombre_Tra,ide_Tra);
    }
    public void cocerProducoNatural(Inventario_Producto l){
     for (Producto p:l.lista_Productos){
         if (p.getEstado_Ceramica().equalsIgnoreCase("Natural")){
            p.setEstado_Ceramica("Cocido");
            }
        }
    }
    public void cocerProductoEsmaltado(Inventario_Producto l){
    for (Producto p:l.lista_Productos){
         if (p.getEstado_Ceramica().equalsIgnoreCase("Pintado")){
            p.setEstado_Ceramica("terminado");
            }
    }
    }
}
