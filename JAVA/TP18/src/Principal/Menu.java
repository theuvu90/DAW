package Principal;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import Clases.CListaTfnos;

public class Menu {
	public static Scanner sc=new Scanner(System.in);
	public static int menu(String opciones[]) {
		int p;
		do {
			for(String item:opciones)System.out.println(item);
			System.out.println("\t Opcion a realizar: ");
			p=sc.nextInt();
		}while(p<1|| p>opciones.length);
		return p;
	}




	public static void main(String[] args) throws IOException {
		String opci[]= {"1.-Buscar","2.-Buscar siguiente","3.-Añadir","4.-Modificar","5.Salir"};
		int op;
		String fichero="amigo.dat";
		CListaTfnos amigos = new CListaTfnos(new File(fichero));
		do {
			op=menu(opci);
			switch(op) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			
			}
		}while(op!=opci.length);
		amigos.cerrar();
		
	}

}
