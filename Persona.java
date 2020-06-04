public class Persona extends Provedor
{
   private String curp_Per;
   public Persona(String nombre_Pro,String curp_Per){
    super(nombre_Pro);
    this.curp_Per=curp_Per;
    }
   public void setCurp_Per(String curp_Per){
    this.curp_Per=curp_Per;
    }
   public String getCurp_Per(){return curp_Per;}
    
}
