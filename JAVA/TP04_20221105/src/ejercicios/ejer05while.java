package ejercicios;

import java.util.Scanner;

public class ejer05while {

	public static void main(String[] args) {
		// Introducir 5 valores por teclado. Indicar cuanto suman.
		Scanner sc=new Scanner(System.in);
		int numero, suma=0;
		
		int i=1;
		while(i<=5) {
			System.out.print("Introduzca el numero " +i+": ");
			numero=sc.nextInt();
			suma = suma+numero;
			
			i++;
		}
		System.out.println("La suma de los valores introducidos es " + suma);

	}

}
