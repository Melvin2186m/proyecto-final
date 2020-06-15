import java.util.Date;
public class Compra
{
    private Date fecha_Compra;
    private Provedor Prove;
    private String nombre_Insumo;
    private double cantidad;
    private double monto;
    
    public Compra(Provedor Prove,String nombre_Insumo,double cantidad,double monto ){
    this.fecha_Compra=new Date();
    this.Prove= Prove;
    this.nombre_Insumo=nombre_Insumo;
    this.cantidad=cantidad;
    this.monto=monto;
    }
    
    public void setClave_Prove(Provedor Prove){
      this.Prove= Prove;
    }
    public Provedor getClave_Prove(){return Prove;}
    public void setNombre_Insumo(String nombre_Insumo){
    this.nombre_Insumo=nombre_Insumo;
    }
    public String getNombre_Insumo(){return nombre_Insumo;}
    public void setCantidad(){
    this.cantidad=cantidad;
    }
    public double getCantidad(){return cantidad;}
    public void setMonto(double monto){
    this.monto=monto;
    }
    public double getMonto(){return monto;}
    public Date getFecha(){return fecha_Compra;}
}
