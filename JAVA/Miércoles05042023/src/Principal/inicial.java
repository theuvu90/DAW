package Principal;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Clases.Biblioteca;
import Clases.Libro;


public class inicial {


	//public static Scanner sc=new Scanner(System.in);
	public static BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
	
	
	public static void actualizar(File fActual,Biblioteca fi) throws IOException{    // Crear un fichero temporal
		  
	    File ficheroTemp = new File("listatfnos.tmp");
	    Biblioteca ftemp = new Biblioteca(ficheroTemp);    
	    int nregs = fi.longitud();
	    Libro obj;
	    for ( int reg_i = 0; reg_i < nregs; reg_i++ )
	    {
	      obj = fi.valorEn(reg_i);
	      if (obj.getAño() != -1)ftemp.añadir(obj);
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
	
	public static void opañadir(Biblioteca fi) throws IOException {
		System.out.print("ISBN: "); String ISBN=sc.readLine();
		System.out.print("Título: "); String titulo=sc.readLine();
		System.out.print("Autor: "); String autor=sc.readLine();
		System.out.print("Editorial: "); String editorial=sc.readLine();
		System.out.print("Año: "); int año=Integer.valueOf(sc.readLine());
		
		fi.añadir(new Libro(ISBN,titulo,autor,editorial,año));
	}
	
    public static boolean modificar(int nreg,Biblioteca fi) throws IOException{
	    String isbn,titulo,autor,editorial;
	    int año;
	    int op;
	    // Leer el registro
	    Libro obj = fi.valorEn(nreg);
	    if (obj == null) return false;
	    
	    // Modificar el registro
	    do{
	      System.out.print("\n\n");
	      System.out.println("Modificar el dato:");
	      System.out.println("1. ISBN");
	      System.out.println("2. Título");
	      System.out.println("3. Autor");
	      System.out.println("4. Editorial");
	      System.out.println("5. Año");
	      System.out.println("6. Salir y salvar los cambios");
	      System.out.println("7. Salir sin salvar los cambios");
	      System.out.println();
	      System.out.print("   Opción: ");
	      op = Integer.valueOf(sc.readLine());
	          
	      switch( op ){
	        case 1: // modificar ISBN
	          System.out.print("isbn:    "); isbn = sc.readLine();
	          obj.setISBN(isbn);
	          break;
	        case 2: // modificar Titulo
	          System.out.print("título: ");
	          titulo = sc.readLine();
	          obj.setTitulo(titulo);
	          break;
	        case 3: // modificar autor
	          System.out.print("autor:  ");
	          autor = sc.readLine();
	          obj.setAutor(autor);
	          break;
	        case 4: // modificar editorial
		          System.out.print("editorial:  ");
		          editorial = sc.readLine();
		          obj.setEditorial(editorial);
		          break;
	        case 5: // modificar año
		          System.out.print("año:  ");
		          año = Integer.valueOf(sc.readLine());
		          obj.setAño(año);
		          break;
	        case 6: // guardar los cambios
	          break;
	        case 7: // salir sin guardar los cambios
	          break;
	      }
	    } while( op != 6 && op != 7);
	    if (op == 6){
	      fi.ponerValorEn(nreg, obj);             
	      return true;
	    }else
	      return false;
	  }
	 
	public static void imprimir(Biblioteca fi) throws IOException{
	      Libro per=null;
		    int nregs = fi.longitud(); // número de registros
		    for (int n = 0; n < nregs; n++){
		    	per=fi.valorEn(n);
		        //System.out.printf("%d %s %s %d\n",(n+1), per.getNombre(),per.getDireccion(),per.getTelefono());
		    	System.out.println((n+1)+" "+per);
		    }
    }
	 
	public static void main(String[] args) throws IOException {
	Boolean modificado=false,flag=false,eliminado=false;
	Libro per=null;	
	String cadenabuscar=null,basura=null,isbn=null;	
	String opci[]= {"1.-Buscar","2.-Buscar siguiente","3.-Añadir","4.-Modificar","5.-Eliminar","6.-Imprimir","7.-Salir"};
	int op,pos=-1;

	String fichero="amigos.dat";
	  
      Biblioteca amigos=new Biblioteca(new File(fichero));

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
            //System.out.printf("%s %s %d\n", per.getNombre(),per.getDireccion(),per.getTelefono());
           System.out.println(per); 
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
            //System.out.printf("%s %s %d\n", per.getNombre(),per.getDireccion(),per.getTelefono());
            System.out.println(per);
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
          System.out.print("ISBN: "); isbn = sc.readLine();
          flag = amigos.eliminar(isbn);
          
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
