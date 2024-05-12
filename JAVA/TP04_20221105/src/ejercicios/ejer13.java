package ejercicios;

public class ejer13 {

	public static void main(String[] args) {
		// Muestra los numeros del 320 al 160 contando de 20 en 20
		// hacia atras utilizando un bucle do-while
		
		int i=320;
		do {
			System.out.printf("%6d",i);
			i-=20;
		}while(i>=160);
	}

}
