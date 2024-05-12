package ejercicios;

import java.util.Scanner;

public class ejer05 {

	public static void main(String[] args) {
		// Escribe un programa que sume, reste, multiplique
		// y divida dos numeros enteros introducidos por teclado
		
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.print("Introduce el primer numero: ");
		n1 = sc.nextInt();
		System.out.print("Introduce el segundo numero: ");
		n2 = sc.nextInt();
		
		System.out.printf("%d+%d=%d\n",n1,n2,n1+n2);
		
		System.out.printf("n1=%d n2=%d suma=%d\n",n1,n2,n1+n2);
		//%d ancho %5d %4d...; d es double, f es float
		// \n saltar de la linea
		System.out.printf("n1=%d n2=%d resta=%d\n",n1,n2,n1-n2);
		System.out.printf("n1=%d n2=%d multiplicacion=%d\n",n1,n2,n1*n2);
		System.out.printf("n1=%d n2=%d division=%10.2f\n",n1,n2,(double)n1/n2);
		
		// 10 de ancho, 2 decimales
		System.out.printf("numero=%.2f %-10s \n", 0.666666666,"hola");
		
		//-10s  String
		

	}

}
