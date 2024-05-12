package ejercicios;

import java.util.Scanner;
//NOMBRE: THI THEU VU
public class ejer05 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que solicite por teclado 10 numeros y los aguarde en un
		 * array, mostrar en la pantalla todos aquellos numeros que superen la media
		 * aritmetica y visualizar tambien todos los numeros que sean multiplos de 5
		 */
		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduzca un numero entero: ");
			array[i] = sc.nextInt();

		}
		int suma = 0;
		System.out.println("Imprimir el array:");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%5d", array[i]);
			suma += array[i];
		}
		System.out.println();
		/*********************************************/
		// Calcula la media
		double media = (double) suma / array.length;
		System.out.println("La media = " + media);
		/********************************************/
		// Los numeros que superen la media
		System.out.println("Los numeros que superen la media: ");
		for (int i = 0; i < array.length; i++) {
			if (array[i] > media) {
				System.out.printf("%5d", array[i]);
			}
		}
		/*******************************************/
		// visualizar todos los numeros que sean multiplos de 5
		System.out.println();
		System.out.println("Los numeros que sean multiplos de 5 son:");
		for(int i=0;i<array.length;i++) {
			if(array[i]%5==0) {
				System.out.printf("%5d",array[i]);
			}
		}

	}

}
