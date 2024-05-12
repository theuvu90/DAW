package ejercicios;

public class ejer03 {

	public static void main(String[] args) {
		/*
		 * Declarar una matriz bidimensional de 10 filas y 5 columnas Rellenar todas las
		 * posiciones de la matriz, con valores aleatorios entre 125 y 225 Imprimir la
		 * matriz
		 * 
		 */
		int tb[][] = new int[10][5];
		int li = 125, ls = 225;
		/*************************************/
		for (int i = 0; i < tb.length; i++) {
			for (int j = 0; j < tb[i].length; j++) {
				tb[i][j] = (int) (Math.random() * (ls - li + 1)) + li;
			}
		}
		/**************************************/
		for (int i = 0; i < tb.length; i++) {
			for (int j = 0; j < tb[i].length; j++) {
				System.out.printf("%5d", tb[i][j]);
			}
			System.out.println();
		}

	}

}
