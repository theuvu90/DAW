package ejercicios;

import java.util.Scanner;

public class ejer04 {

	public static void main(String[] args) {
		// Introducir 5 valores por teclado. Indicar cuanto suman.
		Scanner sc=new Scanner(System.in);
		int numero, suma=0;
		for(int i=1; i<=5 ; i++) {
			System.out.print("Introduzca un numero " +i +": ");
			numero= sc.nextInt();
			suma = suma + numero;
		}
		System.out.println("La suma de los valores introducidos es " + suma);

	}

}
