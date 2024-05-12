package ejercicios;

import java.util.Scanner;

public class ejer08 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int edades[]=new int[5];
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Edad de "+i+" ");
			edades[i]=sc.nextInt();
		}
		for (int i = 0; i < edades.length; i++) {
			System.out.println(i+" "+edades[i]);
		}
		int min=250,max=-1;
		for(int i = 0; i < edades.length; i++) {
			if(edades[i]<min) {
				min=edades[i];
				}
			if(edades[i]>max) {
				max=edades[i];
				}
		}
		System.out.println("la edad mayor es "+max);
		System.out.println("la edad menor es "+min);

	}

}
