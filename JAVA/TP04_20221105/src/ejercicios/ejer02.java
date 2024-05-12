package ejercicios;

import java.util.Scanner;

public class ejer02 {

	public static void main(String[] args) {
		// introducir datos por pantalla hasta que el valor introducido sea un numero negativo
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero");
		int numero = sc.nextInt();
		int suma=0;
		
		while(numero>=0) {
			suma = suma+numero;
			System.out.println(numero+ "  " +suma);
			System.out.println("Introduzca un numero entero");
			numero = sc.nextInt()
;		}
		System.out.println("Programa terminado");

	}

}
