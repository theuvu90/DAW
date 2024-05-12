package ejercicios;

import java.util.Scanner;

public class ejer08 {

	public static void main(String[] args) {
		// && -----> y
		// || -----> o
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca una nota ");
		double nota = sc.nextDouble();
		if(nota>=5 && nota <=15) {
			System.out.println("Primer intevalo");
		}else if (nota <5 || nota >25) {
			System.out.println("Segundo intevalo");
		}else {
			System.out.println("Tercer intevalo");
		}
		System.out.println("El programa terminado");

	}

}
