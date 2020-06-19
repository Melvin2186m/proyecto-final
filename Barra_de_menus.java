import java.awt.event.ActionListener;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
 
public class Barra_de_menus 
{
    //Contadores
    static JFrame f_ventana;
    static JMenu m_Crear,m_Buscar,m_Realizar;
    static JMenuBar mb_barra;
    static JMenuItem miexit,mielit,minuev,miusdo,miusno,mieddp,miedec,miedpr,miinic,miedct,miedfa,mieder,mexo,mielimp,mielimpi,mielims,mels,vins,hers,mielimpw,melsi;
    lista_Personal lista1=new lista_Personal();
    Inventario_Producto lista2=new Inventario_Producto();
    Inventario_Insumo lista3=new Inventario_Insumo();
    public void ventana()
    {
        f_ventana=new JFrame("Empresa de CERAMICA  OONOOF");//Ventana principal
        //Creacion de botones de menu
        miexit=new JMenuItem("Salir");
        miexit.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){System.exit(0);}});
        miinic=new JMenuItem("Alfarero");
        miinic.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {   String a;
                String b;
                int  n;
                Alfarero q;
                JOptionPane.showMessageDialog(null, "para crear un alfarero ingresa los siguientes datos");
                a=JOptionPane.showInputDialog(null, "Introduce tu nombre");
                b=JOptionPane.showInputDialog(null, "introduce el ide del trabajador");
                JOptionPane.showMessageDialog(null, "elige una opcion, 1=trabajador de tiempo completo, 2=estudiante");
                n=Integer.parseInt( JOptionPane.showInputDialog("introduce un numero"));
                if(n==1){
                q=new Alfarero(a,b,true);
                lista1.AgregarPersonal(q);
                }else{q=new Alfarero(a,b,false);}
            }
        });
        minuev=new JMenuItem("Esmalteador");
        minuev.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {   String a;
                String b;
                int  n;
                Esmaltador z;
                JOptionPane.showMessageDialog(null, "para crear un Esmaltador ingresa los siguientes datos");
                a=JOptionPane.showInputDialog(null, "Introduce un nombre");
                b=JOptionPane.showInputDialog(null, "introduce el ide del trabajador");
                
                z=new Esmaltador(a,b);
                lista1.AgregarPersonal(z);
            }
        });
        miusno=new JMenuItem("Gerente");
        miusno.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {   String a;
                String b;
                int  n;
                Gerente l;
                JOptionPane.showMessageDialog(null, "para crear un Gerente ingresa los siguientes datos");
                a=JOptionPane.showInputDialog(null, "Introduce un nombre");
                b=JOptionPane.showInputDialog(null, "introduce el ide del trabajador");
                
                l=new Gerente(a,b);
                lista1.AgregarPersonal(l);
            }
        });
        miusdo=new JMenuItem("Provedor");
         miusdo.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {   String a,m;
                String b;
                int  n;
                Provedor l;
                JOptionPane.showMessageDialog(null, "para crear un Proveedor ingresa los siguientes datos");
                a=JOptionPane.showInputDialog(null, "Introduce un nombre");
                 n=Integer.parseInt( JOptionPane.showInputDialog("introduce un numero 1=empresa,2=persona"));
                if(n==1){
                m=JOptionPane.showInputDialog(null, "introduce el nombre del representante");
                b=JOptionPane.showInputDialog(null, "Introduce una clave de Representanter");
                l=new Empresa(a,m,b);
                
                }else{
                b=JOptionPane.showInputDialog(null, "Introduce una curp de Representanter");
                l=new Persona(a,b);
                
                 }
                
            }
        });
        mieddp=new JMenuItem("encargado de coccion");
        mieddp.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {   String a,m;
                String b;
                int  n;
                CoccionJob  l;
                JOptionPane.showMessageDialog(null, "para crear un encargado de coccion ingresa los siguientes datos");
                a=JOptionPane.showInputDialog(null, "Introduce un nombre");
                m=JOptionPane.showInputDialog(null, "introduce el ide del representante");
                
                l= new CoccionJob(a,m);
                
                lista1.AgregarPersonal(l); 
                
            }
        });
        miedec=new JMenuItem("Producto");
        miedec.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
          {   String a,m;
                String b;
                double  n;
                Provedor l;
                JOptionPane.showMessageDialog(null, "para crear un Producto ingresa los siguientes datos");
                a=JOptionPane.showInputDialog(null, "ingresa un tipo de producto un nombre recuerda que puedes crear arcilla,pintura,Esmalte");
                n=Double.parseDouble(JOptionPane.showInputDialog(null, "ingresa la cantidad que quieres crear"));
                try
		  {
		if(a.equalsIgnoreCase("arcilla")){
		  new Arcilla(a,n);
		  }
		  
		if(a.equalsIgnoreCase("pintura")){
		    new Pintura(a,n);
		  }
		if(a.equalsIgnoreCase("esmalte")){
		    new Esmalte(a,n);
		  }
		 else {   throw           new           Exception();   } 
		   }
		 catch (Exception ExcepcionCreada){ 

                   System.out.println ("No se puede crear el tipo de insumo creado"+ ExcepcionCreada.toString()); 

        } 
                
            }  
        });
        miedct=new JMenuItem("Insumo");
        miedpr=new JMenuItem("Vehiculo");
        miedpr.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {   String a,m;
                String b;
                int  n;
                Vehiculo  l;
                JOptionPane.showMessageDialog(null, "para crear un Vehiculo debes ingresa los siguientes datos");
                a=JOptionPane.showInputDialog(null, "Introduce la serie de la placa");
                m=JOptionPane.showInputDialog(null, "introduce el modelo");
                
                l= new Vehiculo(a,m);
                
                 
                
            }
        });
        mieder=new JMenuItem("Insumo disponible");
        mieder.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {   String a,m;
                String b;
                int  n;
                 try
		  {
                  n=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce tu consulta 1=cantidad disponible de un tipo de insumo, 2=todos los insumos"));
                  if(n==1){
                   m=JOptionPane.showInputDialog(null, "que tipo de insumo deseas buscar");
                   JOptionPane.showMessageDialog(null,lista3.CantidadDisponible(m));
                    }
                 if(n==2){
                    
                    } 
                
                }
		 catch (Exception ExcepcionCreada){ 

                   System.out.println ("la consulta no existe"+ ExcepcionCreada.toString()); 

        } 
                
                 
                
            }
        });
        mielit=new JMenuItem("Trabajadores");
        mielit.addActionListener(new ActionListener()
        {public  void actionPerformed(ActionEvent e)
            {   String a,m;
                String b;
                String  y;
                Repartidor n; 
                  JOptionPane.showMessageDialog(null,"Usted puede realizar las siguiente consulta \n a= buscar trabajador por clave \n b=buscar trabajadores con el mismo nombre \n c=eliminar trabajador por clave");
		   a=JOptionPane.showInputDialog(null, "Recuerda: \n a=buscarpor clave \n  b=burcar por nombre \n c=eliminar por nombre");
                  if(a.equalsIgnoreCase("a")){
                   m=JOptionPane.showInputDialog(null, "ingresa la clave del personal");
                    b=lista1.BuscarTrabajador(m); 
                   System.out.print("lll"+b);
                   JOptionPane.showMessageDialog(null,b+"ccc");
                     
                    
                    
                    }
                 if(a.equalsIgnoreCase("b")){
                     m=JOptionPane.showInputDialog(null, "ingresa la nombre del personal");
                    lista1.BuscarTrabajador(m);
                    
                    }
                 if(a.equalsIgnoreCase("c")){
                     m=JOptionPane.showInputDialog(null, "ingresa la clave del personal");
                    lista1.BuscarTrabajador(m);
                    
                    } 
                
                }
		  });
        mexo=new JMenuItem("productos");
        mielimpw=new JMenuItem("Repartidor");
         mielimpw.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {   String a,m;
                String b;
                int  n;
                Repartidor  l;
                JOptionPane.showMessageDialog(null, "para crear Repartidor un debes ingresa los siguientes datos");
                m=JOptionPane.showInputDialog(null, "ingresa el nombre del Repartidor");
                a=JOptionPane.showInputDialog(null, "Introduce su ide");
                b=JOptionPane.showInputDialog(null, "ingresa su clave de licencia");
                
                l= new Repartidor(m,a,b);
                lista1.AgregarPersonal(l); 
                 
                
            }
        });
        mels=new JMenuItem("arcilla");
        melsi=new JMenuItem("cuanto personal tenemos");
         melsi.addActionListener(new ActionListener()
        {public void actionPerformed(ActionEvent e)
            {   
             JOptionPane.showMessageDialog(null,lista1.cuanto_Personal());   
            }
        });
        vins=new JMenuItem("Esmalte");
        hers=new JMenuItem("Pintura");
        mielimpi=new JMenuItem("total de ventas");
        mielims=new JMenuItem("venta");
        mielimp=new JMenuItem("Compra");
        //Creacion del menu archivo
    
        m_Crear=new JMenu("Crear");
        m_Crear.add(miinic);
        m_Crear.add(minuev);
        m_Crear.add(miusno);
        m_Crear.add(mieddp);
        m_Crear.add(mielimpw);
        
        m_Crear.add(miedpr);
        m_Crear.add(miusdo);
        m_Crear.add(miexit);
        
        
        //Creacion del menu editar
        m_Buscar=new JMenu("Buscar");
        m_Buscar.add(mieder);
        m_Buscar.add(mielit);
        m_Buscar.add(mexo);
        m_Buscar.add(melsi);
        //creacionn del menu realizar
        m_Realizar=new JMenu("Realizar");
        m_Realizar.add(mielims);
        m_Realizar.add(mielimp);
        
        //Creaion de la barra de menu
        mb_barra=new JMenuBar();
        mb_barra.add(m_Crear);
        mb_barra.add(m_Buscar);
        mb_barra.add(m_Realizar);
        f_ventana.setJMenuBar(mb_barra);
        f_ventana.setSize(400,400);
        f_ventana.setLocationRelativeTo(null);
        f_ventana.show();
        
        
    }
}
