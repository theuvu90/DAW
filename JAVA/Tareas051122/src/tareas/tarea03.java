package tareas;

import java.util.Scanner;

public class tarea03 {

	public static void main(String[] args) {
		/*Escribe un programa que muestre en tres columnas, el cuadrado y el cubo 
		de los 5 primeros números enteros a partir de uno que se introduce por 
		teclado.
		 * */ 
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		int n = sc.nextInt();
		int i=1;
		
		while(i<=5) {			
			System.out.printf("%10d %10d %10d",n,n*n,n*n*n);
			System.out.println();
			n++;				
			i++;		
			
		}

	}

}
