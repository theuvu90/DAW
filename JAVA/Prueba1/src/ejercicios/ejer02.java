package ejercicios;

public class ejer02 {
//NOMBRE: THI THEU VU
	public static void main(String[] args) {
		/*
		 * Programa que muestre el contenido del vector tb[] desde el primer elemento al
		 * ultimo. Añada el código necesario para que lo muestre también desde el último
		 * al primero, en esta ocasión con un bucle while
		 */
		int n = 15;

		System.out.println("El vector desde el primer elemento al ultimo:");
		int tb[] = crearVector(n);
		System.out.println();
		System.out.println("Desde el ultimo al primero:");
		int ta[] = new int[n];
		int i = 0;
		while (i < n) {
			ta[i] = tb[n - 1 - i];
			System.out.printf("%5d", ta[i]);
			i++;

		}

	}

	public static int[] crearVector(int n) {
		int li = 100, ls = 500;
		int tb[] = new int[n];

		for (int i = 0; i < n; i++) {

			tb[i] = (int) (Math.random() * (ls - li + 1)) + li;
			System.out.printf("%5d", tb[i]);

		}
		return tb;
	}

}
