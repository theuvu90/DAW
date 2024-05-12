package ejercicios;

public class ejer04 {
//NOMBRE: THI THEU VU
	public static void main(String[] args) {
		/*
		 * Programa que obtenga e imprima el valor de la mayor diferencia entre dos
		 * elementos consecutivos del vector. Debe indicar tambien entre que elementos
		 * del vector se da tal diferencia.
		 */
		int n = 10;
		int tb[] = crearVector(n);
		System.out.println();
		int diferencia[] = new int[n - 1]; // diferencia >=0
		for (int i = 0; i < n - 1; i++) {
			if (tb[i + 1] > tb[i]) {
				diferencia[i] = tb[i + 1] - tb[i];
			} else {
				diferencia[i] = tb[i] - tb[i + 1];
			}
		}
		//La mayor diferencia=?
		int maximo=diferencia[0];
		for(int i=0;i<n-1;i++) {
			if(diferencia[i]>maximo) {
				maximo=diferencia[i];
			}
		}
		System.out.println("El valor de la mayor diferencia = "+maximo);
		
		//Entre que elementos se da tal diferencia
		System.out.println("Entre que elementos se da la mayor diferencia: ");
		for(int i=0;i<n-1;i++) {
			if(diferencia[i]==maximo) {
				System.out.println("tb["+i+"]= "+tb[i]+" y tb["+(i+1)+"]= "+tb[i+1]);
			}
		}

	}

	public static int[] crearVector(int n) {
		int li = 1, ls = 100;
		int tb[] = new int[n];

		for (int i = 0; i < n; i++) {

			tb[i] = (int) (Math.random() * (ls - li + 1)) + li;
			System.out.printf("%5d", tb[i]);

		}
		return tb;
	}

}
