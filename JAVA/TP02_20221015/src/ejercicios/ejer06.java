package ejercicios;

import java.util.Scanner;

public class ejer06 {

	public static void main(String[] args) {
		/* Realiza un programa que calcule la nota que hace falta sacar en el segundo 
		examen de la asignatura Progammacion para obtener la media deseada.
		Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del
		segundo examen un 60%
		*/
		//nota del primer examen
		//nota media deseada
		//nota que debemos sacar en el segundo examen para obtener la media
		// 10*0.4 + X*0.6 = 7
		// X*0.6 = 7 - 10*0.4
		// X =(7-10*0.4)/0.6
		
		double Media,PrimerExamen,SegundoExamen;
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime la media que quieres obtener");
		Media=sc.nextDouble();
		System.out.println("Dime la nota del primer examen");
		PrimerExamen=sc.nextDouble();
		
		SegundoExamen=(Media-(PrimerExamen*0.4))/0.6;
		System.out.printf(" Examen_1 = %.2f \n Examen_2 = %.2f \n Media = %.2f",
				PrimerExamen,SegundoExamen,Media);
		

	}

}
