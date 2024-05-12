package ejercicios;

public class ejer02 {

	public static void main(String[] args) {
		int tb[][] = new int[9][9];
		int li = 500, ls = 900;
		int n=tb.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tb[i][j] = (int) (Math.random() * (ls - li + 1)) + li;
				System.out.printf("%5d", tb[i][j]);
			}
			System.out.println();
		}
		System.out.println("Los numeros de la diagonal que va desde la esquina inferior izquierda a la esquina superior derecha");

		int maximo = tb[n-1][0], minimo = tb[n-1][0], suma = 0;
		for (int i = 0; i < n; i++) {

			System.out.printf("%5d", tb[n-1-i][i]);
			suma += tb[n-1-i][i];
			if (tb[n-1-i][i] > maximo) {
				maximo = tb[n-1-i][i];
			}
			if (tb[n-1-i][i] < minimo) {
				minimo = tb[n-1-i][i];
			}

		}
		System.out.println();
		System.out.println("El maximo = "+maximo);
		System.out.println("EL minimo = "+minimo);
		System.out.println("La media = "+ (double)suma/n);
	}

}
