package ejercicios;

import java.util.Scanner;

public class ejer01 {

	public static void main(String[] args) {
		
		double nueva=145.67,otra=445.67;
		
		int v1=120,v2=220;
		
		System.out.println(nueva+otra);
		
		System.out.println(v1+v2);
		
		double a = 7, b=2;
		System.out.println(a/b);
		
		int c=7, d=2;
		System.out.println(c/d);
		System.out.println( (double)c/d );
		
		c +=33; //c=c+33
		c -=33;
		c *=33;	
		c /=33;
		System.out.println(c);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dime un nombre ");
		String nombre=sc.nextLine();
		
		System.out.print("Dime tu edad ");
		String edad=sc.nextLine();
		System.out.println("Tu nombre es: " + nombre + " Y Edad: "+edad);

	}

}
