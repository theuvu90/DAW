package tareas;

import java.util.Scanner;

public class tarea02 {

	public static void main(String[] args) {
		/*Escribe un programa que calcule la media de un conjunto de números 
		positivos introducidos por teclado. A priori, el programa no sabe cuántos 
		números se introducirán. El usuario indicará que ha terminado de introducir 
		los datos cuando meta un número negativo
		 * */ 
		
		Scanner sc = new Scanner(System.in);
		
		double x ;
		int c=0;
		double suma=0;
		
		do {
			System.out.println("Introduzca un numero: ");
			x= sc.nextDouble();
			if(x>0) {
				suma= suma+x;
				c++;
				}else {
					System.out.println("El programa terminado");
				}			
		}while(x>0);		
		
		System.out.println("Has introducido " + c + " numeros positios");
		
		if(c>0) {
			double media = suma/c;		
			System.out.println("La media de los numeros positivos es = " + media);
		}
			
			
	}

}
