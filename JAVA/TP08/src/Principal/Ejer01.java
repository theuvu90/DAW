package Principal;

public class Ejer01 {
	public static void cargar(int m[][]) {
		int li = 200, ls = 300;
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j] = (int) (Math.random() * (ls - li + 1)) + li;
			}
		}
	}

	public static void imprimir(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.printf("%5d", m[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		int matriz[][] = new int[10][10];
		cargar(matriz);
		imprimir(matriz);
		System.out.println("\n Impresion de los elementos de la diagonal principal:\n");
		int maximo = matriz[0][0], minimo = matriz[0][0], suma = 0;
		for (int i = 0; i < matriz.length; i++) {
			System.out.printf("%5d", matriz[i][i]);
			suma += matriz[i][i];
			if (matriz[i][i] > maximo) {
				maximo = matriz[i][i];
			} else if (matriz[i][i] < minimo) {
				minimo = matriz[i][i];
			}

		}
		
		System.out.printf("\n maximo=%5d minimo=%5d media=%7.2f",maximo,minimo,(double)suma/matriz.length);

	}

}
