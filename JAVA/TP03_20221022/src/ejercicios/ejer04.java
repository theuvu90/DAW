package ejercicios;

import java.util.Scanner;

public class ejer04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca su nombre ");
		String nombre=sc.nextLine();
		
		if(nombre.equals("Jose")){
			System.out.println("Efectivamente eres Jose");
			}else {
				System.out.println("Tienes otro nombre " + nombre);
			}
		System.out.println("El programa termino");

	}

}
