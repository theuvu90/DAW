package Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Clases.CListaTfnos;
import Clases.Persona;

public class inicial {


	//public static Scanner sc=new Scanner(System.in);
	public static BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void actualizar(File fActual,CListaTfnos fi) throws IOException{    // Crear un fichero temporal
		  
	    File ficheroTemp = new File("listatfnos.tmp");
	    CListaTfnos ftemp = new CListaTfnos(ficheroTemp);    
	    int nregs = fi.longitud();
	    Persona obj;
	    for ( int reg_i = 0; reg_i < nregs; reg_i++ )
	    {
	      obj = fi.valorEn(reg_i);
	      if (obj.getTelefono() != 0)ftemp.añadir(obj);
	    }
	    fi.cerrar();
	    ftemp.cerrar();
	    fActual.delete();
	    if (!ficheroTemp.renameTo(fActual))
	      throw new IOException("no se renombró el fichero");
	  }  
	public static int menu(String opciones[]) throws NumberFormatException, IOException {
		int p;
		do {
			for(String item:opciones)System.out.println(item);
			System.out.println("\tOpcion a realizar: ");
			p=Integer.valueOf(sc.readLine());
		}while(p<1 || p>opciones.length);
		return p;
	}
	
	public static void opañadir(CListaTfnos fi) throws IOException {
		System.out.print("Nombre: "); String nombre=sc.readLine();
		System.out.print("Direccion: "); String direccion=sc.readLine();
		System.out.print("Telefono: "); Long tel=Long.valueOf(sc.readLine());
		fi.añadir(new Persona(nombre,direccion,tel));
	}
	
    public static boolean modificar(int nreg,CListaTfnos fi) throws IOException{
	    String nombre, dirección;
	    long teléfono;
	    int op;
	    // Leer el registro
	    Persona obj = fi.valorEn(nreg);
	    if (obj == null) return false;
	    
	    // Modificar el registro
	    do{
	      System.out.print("\n\n");
	      System.out.println("Modificar el dato:");
	      System.out.println("1. Nombre");
	      System.out.println("2. Dirección");
	      System.out.println("3. Teléfono");
	      System.out.println("4. Salir y salvar los cambios");
	      System.out.println("5. Salir sin salvar los cambios");
	      System.out.println();
	      System.out.print("   Opción: ");
	      op = Integer.valueOf(sc.readLine());
	          
	      switch( op ){
	        case 1: // modificar nombre
	          System.out.print("nombre:    ");
	          nombre = sc.readLine();
	          obj.setNombre(nombre);
	          break;
	        case 2: // modificar dirección
	          System.out.print("dirección: ");
	          dirección = sc.readLine();
	          obj.setDireccion(dirección);
	          break;
	        case 3: // modificar teléfono
	          System.out.print("teléfono:  ");
	          teléfono = Long.valueOf(sc.readLine());
	          obj.setTelefono(teléfono);
	          break;
	        case 4: // guardar los cambios
	          break;
	        case 5: // salir sin guardar los cambios
	          break;
	      }
	    } while( op != 4 && op != 5);
	    if (op == 4){
	      fi.ponerValorEn(nreg, obj);             
	      return true;
	    }else
	      return false;
	  }
	 
	public static void imprimir(CListaTfnos fi) throws IOException{
	      Persona per=null;
		    int nregs = fi.longitud(); // número de registros
		    for (int n = 0; n < nregs; n++){
		    	per=fi.valorEn(n);
		        System.out.printf("%d %s %s %d\n",(n+1), per.getNombre(),per.getDireccion(),per.getTelefono());
		    }
    }
	 
	public static void main(String[] args) throws IOException {
	Boolean modificado=false,flag=false,eliminado=false;
	Persona per=null;	
	String cadenabuscar=null,basura=null;	
	String opci[]= {"1.-Buscar","2.-Buscar siguiente","3.-Añadir","4.-Modificar","5.-Eliminar","6.-Imprimir","7.-Salir"};
	int op,pos=-1;
	long teléfono;
	String fichero="amigos.dat";
	  
      CListaTfnos amigos=new CListaTfnos(new File(fichero));

     do { 
      op=menu(opci);
      switch(op) {
      case 1: //Buscar
    	  System.out.print("conjunto de caracteres a buscar ");
          cadenabuscar = sc.readLine();
          pos = amigos.buscar(cadenabuscar, 0);
          if (pos == -1)
            if (amigos.longitud() != 0)
              System.out.println("búsqueda fallida");
            else
              System.out.println("lista vacía");
          else
          {
        	System.out.println("Número de registro: " + pos);
            per=amigos.valorEn(pos);
            System.out.printf("%s %s %d\n", per.getNombre(),per.getDireccion(),per.getTelefono());
          }
    	  break;
      case 2: //Buscar siguiente
    	  pos = amigos.buscar(cadenabuscar, pos + 1);
          if (pos == -1)
            if (amigos.longitud() != 0)
              System.out.println("búsqueda fallida");
            else
              System.out.println("lista vacía");
          else
          {
        	System.out.println("Número de registro: " + pos);
            per=amigos.valorEn(pos);
            System.out.printf("%s %s %d\n", per.getNombre(),per.getDireccion(),per.getTelefono());
          }
    	  break;
      case 3: //Añadir
    	  opañadir(amigos);
     	  break;
      case 4: //modificar
    	  System.out.print("número de registro entre 0 y " +(amigos.longitud() - 1) + ": ");
          pos = Integer.valueOf(sc.readLine());
          modificado = modificar(pos,amigos);
          if (modificado)
        	  System.out.println("modificación realizada con éxito");
          else
        	  System.out.println("error: no se modificó el registro");
    	  break;
      case 5: // eliminar
          System.out.print("teléfono: "); teléfono = Long.valueOf(sc.readLine());
          flag = amigos.eliminar(teléfono);
          
          if (flag) {
          	eliminado=true;
            System.out.println("registro eliminado");
          }else {
            if (amigos.longitud() != 0) {
              System.out.println("teléfono no encontrado");
            }else {
              System.out.println("lista vacía");
            }  
          } 
          break;
        case 6: // imprimir
          imprimir(amigos);
          System.out.print("De enter para continuar ");
          basura=sc.readLine();
          break;
        case 7: // salir
          // guardar lista
          if (eliminado) actualizar(new File(fichero),amigos);
          amigos = null;
      }
     }while(op!=opci.length); 
      
     //amigos.cerrar();
     System.out.println("Termino el programa");
}

}
