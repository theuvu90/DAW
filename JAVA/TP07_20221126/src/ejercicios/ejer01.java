package ejercicios;

import java.util.Scanner;

public class ejer01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double tb[]=new double[5];
		double suma=0;
		
		for(int i=0;i<tb.length;i++) {
			System.out.println("Introducir el valor "+i+" ");
			tb[i]=sc.nextDouble();
			suma +=tb[i];
		}
		System.out.printf("La media = %.2f",suma/tb.length);

	}

}
