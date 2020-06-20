<<<<<<< HEAD
import java.util.Vector;
public class lista_Personal
{
    public  Vector<Trabajador> lista_Trabajador=new Vector<Trabajador>();
    public void AgregarPersonal(Trabajador l){
    lista_Trabajador.add(l);
    }
    public String BuscarTrabajador(String Clave){
    Trabajador n=null;
    String f=null;
    for (Trabajador I:lista_Trabajador){
          if (I.getIde_Tra()==Clave){n=I;
           f=identificar(I);
            }
            
    }
    
    return f;
    }
    public Vector<Trabajador> BuscarTrabajador_nombre(String nombre){
        Vector<Trabajador> lista_Selec=new Vector<Trabajador>();
       for (Trabajador I:lista_Trabajador){
        if(I.getNombre_Tra().equalsIgnoreCase(nombre)){
        lista_Selec.add(I);
        }
        }
       return lista_Selec;
    }
     public Trabajador  EliminarTrabajador(String Clave){
    Trabajador y=null;
    int i=0;
    boolean n=true;
    while(n==true && i<lista_Trabajador.size() ){
    if( lista_Trabajador.get(i).getIde_Tra()=="Clave"){
      y=lista_Trabajador.get(i);
      lista_Trabajador.remove(lista_Trabajador.get(i));
      n=false;
    }
    i++;
    }
    
    return y;
    }
    public int cuanto_Personal(){
    int i=0;
    for(int j=0;j<lista_Trabajador.size();j++){
    i++;
    }
    return i;
    }
    public String Imprimir(Repartidor p){
    return p.getNombre_Tra()+p.getIde_Tra()+p.getNum_Licen();
    }
    public String Imprimirc(CoccionJob p){
    return p.getNombre_Tra()+p.getIde_Tra();
    }
    public String Imprimira(Alfarero p){
    return p.getNombre_Tra()+p.getIde_Tra()+p.getAlfareroCompleto();
    }
    public String Imprimire(Esmaltador p){
    return p.getNombre_Tra()+p.getIde_Tra();
    
    }
    public String Imprimirg(Gerente  p){
    return p.getNombre_Tra()+p.getIde_Tra();
    
    }
    public String identificar(Trabajador l){
    Repartidor x;
    CoccionJob y;
    Alfarero  z;
    Esmaltador w;
    Gerente    f;
    String p=null;
    if(l instanceof Repartidor){
        x=(Repartidor)l;
        p=Imprimir(x);
    }
    if(l instanceof CoccionJob){
        y=(CoccionJob)l;
        p= Imprimirc(y);
    }
    if(l instanceof Alfarero){
        z=(Alfarero)l;
        p= Imprimira(z);
    }
    if(l instanceof Esmaltador){
        w=(Esmaltador)l;
        p=Imprimire(w);
    }
    if(l instanceof Gerente){
        f=(Gerente)l;
        p=Imprimirg(f);
    }
    return p;
    }
    public void imprimirt(String l){
    System.out.print(l);
    }
=======

public class lista_Personal
{
   
>>>>>>> 73f318255afda8f6a2d1d52d600bca29d025e69a
}
