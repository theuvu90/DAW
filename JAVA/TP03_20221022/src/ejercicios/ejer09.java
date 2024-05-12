package ejercicios;

import java.util.Scanner;

public class ejer09 {

	public static void main(String[] args) {
		// && -----> y
		// || -----> o
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un numero de ano ");
		int year = sc.nextInt();
		/* El año bisiesto
		 * si es divisible entre 4 y no es divisible entre 100
		 * o
		 * es divisible entre 400
		 * 
		 * */
		if((year%4==0 && year%100!=0)|| (year%400==0)) {
			System.out.println("El ano " + year + " es bisiesto");	
			
		}else {
			System.out.println("El ano " + year + " no es bisiesto");
		}
		System.out.println("El programa terminado");

	}

}
