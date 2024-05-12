package ejercicios;

import java.util.Scanner;

public class ejer02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Dime el importe de la comida ");
		double comida=sc.nextDouble();
		
		System.out.print("Dime el importe de la bebida ");
		double bebida = sc.nextDouble();
		
		System.out.println("El total a pagar = " + (comida+bebida));

	}

}
