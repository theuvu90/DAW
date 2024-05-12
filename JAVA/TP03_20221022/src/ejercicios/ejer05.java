package ejercicios;

import java.util.Scanner;

public class ejer05 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero ");
		int numero = sc.nextInt();
		if(numero%2 == 0) {
			System.out.println("El numero " + numero + " es par");
		}else {
			System.out.println("El numero " + numero + " es impar");
		}
		System.out.println("El programa termino");

	}

}
