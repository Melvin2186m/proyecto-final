
public class Taza extends Producto
{
 private boolean con_Asa;
 public Taza(String nombre_Ceramica,String estado_Ceramica,boolean con_Asa){
    super(nombre_Ceramica,estado_Ceramica);
    this.con_Asa=con_Asa;
    }
 public void setCon_Asa(boolean con_Asa){
    this.con_Asa=con_Asa;
    }
 public boolean getCon_Asa(){return con_Asa;}
}
