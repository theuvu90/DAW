package ejercicios;

public class ejer03 {

	public static void main(String[] args) {
		String pais[] = new String[4];
		pais[0] = "Espana:";
		pais[1] = "Rusia:";
		pais[2] = "Japon:";
		pais[3] = "Australia:";

		int tb[][] = new int[4][10];
		int li = 140, ls = 210;
		for (int i = 0; i < tb.length; i++) {
			for (int j = 0; j < tb[i].length; j++) {
				tb[i][j] = (int) (Math.random() * (ls - li + 1)) + li;
			}

		}
		// Calcula media, min,max
		int med[] = new int[4];
		int min[] = new int[4];
		int max[] = new int[4];
		for (int i = 0; i < tb.length; i++) {

			min[i] = tb[i][0];
			max[i] = tb[i][0];
			int suma = 0;
			for (int j = 0; j < tb[i].length; j++) {
				suma += tb[i][j];
				if (tb[i][j] < min[i]) {
					min[i] = tb[i][j];
				}
				if (tb[i][j] > max[i]) {
					max[i] = tb[i][j];
				}
			}
			med[i] = suma / tb[i].length;

		}
		// Imprimir
		System.out.printf("%72s %5s %5s\n", "MED", "MIN", "MAX");
		for (int i = 0; i < tb.length; i++) {
			System.out.printf("%-12s", pais[i]);
			for (int j = 0; j < tb[i].length; j++) {
				System.out.printf("%5d", tb[i][j]);

			}
			System.out.printf("%10d %5d %5d", med[i], min[i], max[i]);
			System.out.println();
		}

	}

}
