package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejer02 {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	/**********************************************/
	public static int menu() throws IOException {
		String[] opciones = { "1.-Crear fichero", "2.-Leer fichero", "3.-Salir" };
	int op;
	do {for (String string : opciones)System.out.println(string);

	System.out.println("Opcion a ejecutar:");
	op = Integer.valueOf(br.readLine());
	} while (op < 1 || op > opciones.length);
		return op;
	    }

	public static void main(String[] args) throws IOException {
	int op;

	

	do {
	op = menu();
	switch (op) {
	case 1:
//crear();
	                break;
	            case 2:
	                //listar();
	                break;
	            }

	 

	        } while (op != 3);

	 }

	
}
