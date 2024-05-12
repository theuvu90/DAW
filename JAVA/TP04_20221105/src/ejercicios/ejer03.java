package ejercicios;

public class ejer03 {

	public static void main(String[] args) {
		// imprimir los valores del 100 al 0 de 5 en 5 (100,95,90,...,0)
		int n=100;
		
		while(n>=0) {
			System.out.print(n + "  ");
			n=n-5; // n -=5;
		}
		System.out.println();
// Estructura for
		
		for(int i=200; i>=0; i=i-10) {
			System.out.print(i + "  ");
		}
	}

}
