package ejercicios;

import java.util.Scanner;

public class ejer02 {

	public static void main(String[] args) {
		
		// if y switch
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero ");
		int numero=sc.nextInt();
		
		if(numero>10) {
			System.out.println("El numero " + numero + " es mayor que 10");
		}else {
			System.out.println("El numero " + numero + " es menor o igual que 10");
		}
		System.out.println("Termino el programa");
		
	}

}
