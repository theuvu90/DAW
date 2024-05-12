package tareas;

import java.util.Scanner;

public class tarea01 {

	public static void main(String[] args) {
		/*Realiza  un  programa  que  nos  diga  cuántos  dígitos  tiene  un  número 
		 introducido por  teclado. 
		 Este  ejercicio  es  equivalente  a  otro  realizado anteriormente,
		 con la salvedad de que el anterior estaba limitado a números de  5  dígitos  como máximo. 
		 En  esta  ocasión,  hay  que  realizar  el  ejercicio utilizando bucles; 
		 de esta manera, la única limitación en el número de dígitos la establece 
		 el tipo de dato que se utilice (int o long).
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		long n = sc.nextLong();
		int c=0;
		if(n==0) {
			System.out.println("El numero tien 1 digito");
		}else{
			while(n>=1) { 
				n =n/10;
				c++;			
			}
			System.out.println("El numero introducido tiene " + c + " digitos");
			
		}
		
			
		

	}

}
