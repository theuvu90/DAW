package ejercicios;

import java.util.Scanner;

public class ejer03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double v1,v2,v3,media;
		System.out.print("Introduce el primer numero: ");
		v1 = sc.nextDouble();
		System.out.print("Introduce el segundo numero: ");
		v2 = sc.nextDouble();
		System.out.print("Introduce el tercer numero: ");
		v3 = sc.nextDouble();
		media = (v1+v2+v3)/3;
		System.out.println("La media de los valores es = " + media);
		

	}

}
