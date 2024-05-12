package Inicial;

import java.util.Scanner;

public class Ejer01 {
	public static void ejemplo2() throws ArithmeticException{
		throw new ArithmeticException();
	}

	public static void ejemplo() throws ArithmeticException,NumberFormatException,Exception{
		Scanner sc = new Scanner(System.in);
		int a=77,b=1,c;
		int tb[]=new int[4];
		System.out.print("Dime un numero ");
		 a = Integer.valueOf(sc.nextLine());
		 c=a/b;
		 c=tb[10];		 
		 System.out.println("Paso por aqui");
	}
	
	public static void main(String[] args) {
		
		try {
			ejemplo2();
			ejemplo();
		}catch(ArithmeticException e) {
			System.out.println("Division por cero");
		}catch(NumberFormatException e){
			System.out.println("String");
		}catch(Exception e) {
			System.out.println(e.getClass());
			System.out.println(e.getMessage());
		}finally {
			System.out.println("Siempre se ejecutara");
		}
		System.out.println("Sigue el programa ");
		
		

	}

}
