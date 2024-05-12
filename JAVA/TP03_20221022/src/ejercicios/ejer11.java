package ejercicios;

import java.util.Scanner;

public class ejer11 {

	public static void main(String[] args) {
		// ! ---> not
		// &&, ||
		//el mes esta en que trimestre?
		
		// tra manera: trimestre= (int)((mes-1)/3)+1
		// semestre = (int)(mes-1)/6) + 1
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Introduzca un numero del mes");
		int mes = sc.nextInt();
		
		if(mes>=1 && mes<=3) {
			System.out.println("Primer trimestre");
		}else if(mes>=4 && mes<=6){
			System.out.println("Segundo trimestre");
		}else if(mes>=7 && mes<=9){
			System.out.println("Tercer trimestre");
		}else if(mes>=10 && mes<=12){
			System.out.println("Cuarto trimestre");
		}else {
			System.out.println("Numero de mes erroneo. Tiene que esta entre 1 y 12");
		}
		
		// otra manera:
		int trimestre = (int)((mes-1)/3)+1;
		if(trimestre>=1 && trimestre<=4) {
		System.out.println("El mes " + mes + " pertenece al trimestre " + trimestre);
		}else {
			System.out.println("Numero de mes erroneo. Tiene que esta entre 1 y 12");
		}
		
		System.out.println("El programa terminado");

	}

}
