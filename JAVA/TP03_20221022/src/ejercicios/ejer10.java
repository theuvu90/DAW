package ejercicios;

import java.util.Scanner;

public class ejer10 {

	public static void main(String[] args) {
		// ! ---> not
		// &&, ||
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un numero");
		int n = sc.nextInt();
		// n<10 || n>20
		if(!(n>=10 && n<=20)) {
			System.out.println("Primer intevalo");
		}else {
			System.out.println("Segundo intevalo");
		}
		
		System.out.println("El programa terminado");

	}

}
