package ejercicios;

import java.util.Scanner;

public class ejer06 {

	public static void main(String[] args) {
		// <, <=, >, >=, ==, !=
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un numero ");
		double numero = sc.nextDouble();
		if(numero> 0) {
			System.out.println("El numero " + numero + " es positivo");
		}else if(numero==0){
			System.out.println("El numero es un cero");
		}else {
			System.out.println("El numero " + numero + " es negativo");
		}
		System.out.println("El programa termino");

	}

}
