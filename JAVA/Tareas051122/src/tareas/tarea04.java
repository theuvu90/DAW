package tareas;

import java.util.Scanner;

public class tarea04 {

	public static void main(String[] args) {
		/*Escribe un programa que muestre los n primeros términos de la serie de 
		Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 
		y el resto se calcula sumando los dos anteriores, por lo que tendríamos que 
		los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se 
		debe introducir por teclado.
		 */ 
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce un numero entero >=2: ");
		int n = sc.nextInt();
		int x=0;
		int y=1;
		System.out.println("Los " + n +" primeros terminos de la serie de Fibonacci:");
		System.out.print(x+"  "+y);
		for(int i=3; i<=n; i++) {				
			int z=x+y;			
			System.out.print("  "+z);
			x=y;
			y=z;					
			
		}
	}

}
