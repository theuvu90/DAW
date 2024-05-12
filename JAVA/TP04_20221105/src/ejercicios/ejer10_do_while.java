package ejercicios;

import java.util.Scanner;

public class ejer10_do_while {

	public static void main(String[] args) {
		// pedir numero de forma consecutiva por pantalla 
		//mientras que sean pares
		Scanner sc = new Scanner(System.in);
		int numero,c=0;
		do {
			System.out.print("Introduzca un numero entero: ");
			numero=sc.nextInt();
			c++;
		}while(numero%2==0);
		System.out.println("Hemos introducido " +(--c)+" pares"); // (c-1)
		// neu la c thi dem ca so le (so luot qua "do" chu ko phai so luong so chan
	}

}
