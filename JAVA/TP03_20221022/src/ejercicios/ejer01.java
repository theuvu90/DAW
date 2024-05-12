package ejercicios;

import java.util.Scanner;

public class ejer01 {

	public static void main(String[] args) {
		
		// if y switch
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero ");
		int numero=sc.nextInt();
		
		if(numero>10) {
			System.out.println("El numero " + numero + " es mayor que 10");
		}
		System.out.println("Termino el programa");
		
	}

}
