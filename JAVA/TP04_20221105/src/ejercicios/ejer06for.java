package ejercicios;

import java.util.Scanner;

public class ejer06for {

	public static void main(String[] args) {
		// Pedir por pantalla un numero y que nos muestre su tabla de multiplicar
		Scanner sc=new Scanner(System.in);
		System.out.print("Introduzca el numero");
		
		int numero=sc.nextInt(); // double numero =sc.nextDouble();
		
		for(int i=0;i<=9;i++) {
			System.out.println(numero +"*" + i +"="+ (numero*i));
			
		}
		
	}

}
