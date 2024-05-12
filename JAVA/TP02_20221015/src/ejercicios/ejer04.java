package ejercicios;

import java.util.Scanner;

public class ejer04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double coste;
		System.out.print("Introduce un importe en euros: ");
		coste=sc.nextDouble();
		
		System.out.println(coste +" euros son = " + (coste*1.02) + " USD");
	}

}
