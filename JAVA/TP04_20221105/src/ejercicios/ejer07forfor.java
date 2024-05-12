package ejercicios;

import java.util.Scanner;

public class ejer07forfor {

	public static void main(String[] args) {
		// Imprimir tabla de multiplicar
		
		
		for(int i=1;i<=9;i++) {
			for(int j=1; j<=9; j++) {	
				
				System.out.printf("%5d",i*j);
			}
			System.out.println();
			
		}
		
	}

}
