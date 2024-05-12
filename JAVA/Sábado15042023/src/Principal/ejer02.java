package Principal;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Clases.CPersona;

public class ejer02 {

	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	/*************************************************************************/
	public static int menu() throws IOException {
		String[] opciones = { "1.-Crear fichero", "2.-Leer fichero", "3.-Salir" };
		int op;
		do {
			for (String string : opciones)	System.out.println(string);
			
			System.out.println("Opcion a ejecutar:");
			op = Integer.valueOf(br.readLine());
		} while (op < 1 || op > opciones.length);
		return op;
	}
	/*************************************************************************/
	public static void crear() {
		String nombrefichero=null,resp=null;
		File fichero=null;
		try {
			System.out.print("Nombre del fichero---> ");
			nombrefichero=br.readLine();
			fichero=new File(nombrefichero);
			
			if (fichero.exists()) {
				System.out.println("El fichero existe. ¿Quiere añadir? (s/n)");
				resp=br.readLine();
				
				if (resp.compareToIgnoreCase("S")==0) {
					crearFichero(fichero,true);
				}else {
					crearFichero(fichero,false);
				}
			}else {
				crearFichero(fichero,false);
			}
			
		}catch(IOException e) {
			System.out.println("Error "+e.getMessage());
		}
		
	}
	/*************************************************************************/
	public static void crearFichero(File fichero,boolean añadir) throws IOException {
		CPersona per=null;
		String nombre,direccion,resp;
		long telefono;
		ObjectOutputStream oos=null;
		
		try {
			if (añadir) {
				
				oos= new ObjectOutputStream(new FileOutputStream(fichero, true)) {
					
					protected void writeStreamHeader() throws IOException { reset();  }
				
				};
				
			}else {
				oos=new ObjectOutputStream(new FileOutputStream(fichero));
			}
			do {
				System.out.print("Nombre : ");nombre=br.readLine();
				System.out.print("Dirección : ");direccion=br.readLine();
				System.out.print("Telefono : ");telefono=Long.valueOf(br.readLine());
				
				per=new CPersona(nombre,direccion,telefono);
				
				oos.writeObject(per);
				
				
			    System.out.print("¿Quiere introducir más registros. (S/N) ?");
				resp=br.readLine();
			}while(resp.compareToIgnoreCase("S")==0);
			
		}catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}finally {
			oos.close();
		}
		
		
		
	}
	/*************************************************************************/
	public static void listar() {
		String nombrefichero=null,resp=null;
		File fichero=null;
		try {
			System.out.print("Nombre del fichero---> ");
			nombrefichero=br.readLine();
			fichero=new File(nombrefichero);
			
			if (fichero.exists()) {
				mostrarFichero(fichero);
			}else {
				System.out.println("No existe el fichero.");
			}
			
		}catch(IOException e) {
			System.out.println("Error "+e.getMessage());
		}
		
	}
	/**
	 * @throws IOException ***********************************************************************/
	public static void mostrarFichero(File fichero) throws IOException {
		String nombre,direccion;
		long telefono;
		CPersona per=null;
		
		try(ObjectInputStream oos=new ObjectInputStream(new FileInputStream(fichero));){
			
			do {
				per=(CPersona)oos.readObject();
				System.out.println(per);
			}while(true);
			
			
		}catch(EOFException e) {
			System.out.println("Final de la lectura");
		}catch( ClassNotFoundException e) {
			System.out.println("Error. "+e.getMessage());
		}
		
		
		
	}
	/*************************************************************************/

	public static void main(String[] args) throws IOException {
		int op;

		do {
			op = menu();
			switch (op) {
			case 1:
				crear();
				break;
			case 2:
				listar();
				break;
			}

		} while (op != 3);

	}
	/*************************************************************************/
}
