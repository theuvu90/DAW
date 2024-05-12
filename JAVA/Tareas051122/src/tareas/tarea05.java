package tareas;

import java.util.Scanner;

public class tarea05 {

	public static void main(String[] args) {
		/*Escribe un programa que pida una base y un exponente (entero positivo) y 
		que calcule la potencia
		 * */ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce numero base: ");
		double x = sc.nextDouble();
		System.out.print("Introduce el exponente (numero entero positivo): ");
		int n =sc.nextInt();
		double resultado=1;
		for(int i=1;i<=n;i++) {
			resultado= resultado*x;
		}
		System.out.print(x+"^"+n+"= "+resultado);

	}

}
