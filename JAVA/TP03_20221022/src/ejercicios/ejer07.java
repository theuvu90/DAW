package ejercicios;

import java.util.Scanner;

public class ejer07 {

	public static void main(String[] args) {
//		 nota <5 Suspenso
//		>=5 && <6 Aprobado
//		 >=6 && <7 Bien
//		 >=7 && <9 Notable
//		>=9 && <=10 Sobresaliente
		
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca una nota ");
		double nota = sc.nextDouble();
		if(nota<5) {
			System.out.println("Suspenso");
		}else if (nota < 6){
			System.out.println("Aprobado");
		}else if (nota < 7){
			System.out.println("Bien");
		}else if (nota < 9){
			System.out.println("Notable");
		}else {
			System.out.println("Sobresaliente");
		}
		System.out.println("El programa terminado");

	}

}
