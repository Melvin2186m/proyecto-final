public class Esmaltador extends Trabajador
{   
    private int cantidad_elaborada;
    public Esmaltador(String nombre_Tra,String ide_Tra){
    super(nombre_Tra,ide_Tra);
    
    }
    
    public void esmaltarPlato(Inventario_Producto S,Inventario_Insumo L,int cantidad){
        int existencia=S.ExisteciaPlato("Cosido");
        double total=L.CantidadDisponible("Esmalte");
        int total_consumir=cantidad*100;
        try {
         if(total>=total_consumir && cantidad<=existencia){
            L.modificarInventario(total_consumir,"Esmalte");
            for (Producto p:S.ExistenciadeProducto_Taza("cosido")){
             p.setEstado_Ceramica("Esmaltado");
              }   
           }
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }

    }
    public void esmaltarTaza(Inventario_Producto S,Inventario_Insumo L,int cantidad){
        int existencia=S.ExisteciaTaza("Cosido");
        double total=L.CantidadDisponible("Esmalte");
        int total_consumir=cantidad*85;
        try {
         if(total>=total_consumir && cantidad<=existencia){
           L.modificarInventario(total_consumir,"Esmalte");
            for (Producto p:S.lista_Productos){
            if(p instanceof Taza){
               if (p.getEstado_Ceramica().equalsIgnoreCase("Cosido")){
            p.setEstado_Ceramica("Esmaltado");
              }
              } 
           }
         }
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void PintarTaza(Inventario_Producto S,Inventario_Insumo L,int cantidad){
        int existencia=S.ExisteciaTaza("Cosido");
        double total=L.CantidadDisponible("Esmalte");
        int total_consumir=cantidad*85;
        try {
         if(total>=total_consumir && cantidad<=existencia){
           L.modificarInventario(total_consumir,"Esmalte");
            for (Producto p:S.lista_Productos){
            if(p instanceof Taza){
               if (p.getEstado_Ceramica().equalsIgnoreCase("Cosido")){
            p.setEstado_Ceramica("Esmaltado");
              }
              } 
           }
         }
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        }
    public void PintarPlato(Inventario_Producto S,Inventario_Insumo L,int cantidad){
        int existencia=S.ExisteciaTaza("Cosido");
        double total=L.CantidadDisponible("Esmalte");
        int total_consumir=cantidad*85;
        try {
         if(total>=total_consumir && cantidad<=existencia){
           L.modificarInventario(total_consumir,"Esmalte");
            for (Producto p:S.lista_Productos){
            if(p instanceof Taza){
               if (p.getEstado_Ceramica().equalsIgnoreCase("Cosido")){
            p.setEstado_Ceramica("Esmaltado");
              }
              } 
           }
         }
         }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        }
}
