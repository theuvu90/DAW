package ejercicios;

import java.util.Scanner;

public class ejer03 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca la nota ");
		double nota = sc.nextDouble();
		
		if(nota>=5) {
			System.out.println("Aprobado");
		}else {
			System.out.println("Suspenso");
		}
		System.out.println("El programa termino");

	}

}
