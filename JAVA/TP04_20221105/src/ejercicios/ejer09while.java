package ejercicios;

import java.util.Scanner;

public class ejer09while {

	public static void main(String[] args) {
		// pedir numero de forma consecutiva por pantalla 
		//mientras que sean pares
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero entero: ");
		int numero = sc.nextInt();
		int contador=0;
		
		while(numero%2==0) {
			System.out.print("Introduzca un numero entero: ");
			numero=sc.nextInt();
			contador++;
			
		}
		System.out.println("Hemos introducido " +contador+" pares");
		System.out.println("Programa terminado");
	}

}
