package ejercicios;

public class ejer01 {

	public static void main(String[] args) {
		int tb[][] = new int[10][10];
		int li = 200, ls = 300;
		for (int i = 0; i < tb.length; i++) {
			for (int j = 0; j < tb[i].length; j++) {
				tb[i][j] = (int) (Math.random() * (ls - li + 1)) + li;
				System.out.printf("%5d", tb[i][j]);
			}
			System.out.println();
		}

		System.out.println(
				"Los numeros de la diagonal que va desde la esquina superior izquierda a la esquina inferior derecha");
		int maximo = tb[0][0], minimo = tb[0][0], suma = 0;
		for (int i = 0; i < tb.length; i++) {

			System.out.printf("%5d", tb[i][i]);
			suma += tb[i][i];
			if (tb[i][i] > maximo) {
				maximo = tb[i][i];
			}
			if (tb[i][i] < minimo) {
				minimo = tb[i][i];
			}

		}
		System.out.println();
		System.out.println("El maximo = "+maximo);
		System.out.println("EL minimo = "+minimo);
		System.out.println("La media = "+ (double)suma/tb.length);

	}

}
