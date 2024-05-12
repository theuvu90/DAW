package ejercicios;

public class ejer01 {
//NOMBRE: THI THEU VU
	public static void main(String[] args) {
		/*
		 * Programa que lea 10 calificaciones y calcule e imprima la cantidad de
		 * aprobados (nota>=5) y de sobresalientes(nota>=9)
		 */
		int nota[] = crearNotas(10);
		System.out.println();
		int aprobados = 0, sobresalientes = 0;
		for (int i = 0; i < 10; i++) {
			if (nota[i] >= 5) {
				aprobados++;
			}
			if (nota[i] >= 9) {
				sobresalientes++;
			}
		}

		System.out.println("La cantidad de aprobados = " + aprobados);
		System.out.println("La cantidad de sobresalientes = " + sobresalientes);

	}

	public static int[] crearNotas(int n) {
		int li = 0, ls = 10;
		int nota[] = new int[n];

		for (int i = 0; i < n; i++) {

			nota[i] = (int) (Math.random() * (ls - li + 1)) + li;
			System.out.print(nota[i] + " ");

		}
		return nota;
	}

}
