package ejercicios;

import java.util.Scanner;

public class ejer04bis {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que muestre los n primeros términos de la serie de
		 * Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo es 1 y
		 * el resto se calcula sumando los dos anteriores, por lo que tendríamos que los
		 * términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144… El número n se
		 * debe introducir por teclado.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime el numero: ");
		int numero = sc.nextInt();
		switch (numero) {
		case 1:
			System.out.println("0");
			break;
		case 2:
			System.out.println("0 1");
		default:
			System.out.print("0 1");
			int n1 = 0, n2 = 1, aux;
			while(numero>2) {
				aux=n1;
				n1=n2;
				n2=aux+n2;
				System.out.print(" " +n2);
				numero--;
			}
		}

	}

}
