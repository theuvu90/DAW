package ejercicios;

public class ejer03 {
//NOMBRE: THI THEU VU
	public static void main(String[] args) {
		/*
		 * Programa que lea los siguientes datos acerca de 10 empresas: ingresos del mes
		 * y gastos del mes. El programa debe calcular cuál de ellas(identificables como
		 * Empresa1, Empresa2,...,Empresa10) ha obtenido el peor
		 * resultado(ingresos-gastos) e indicar dicho resultado.
		 */

		int n = 10;
		// Vector ingresos, Vector gastos
		double ingresos[] = ingresos(n);
		double gastos[] = gastos(n);
		// Vector Resultado
		double resultado[] = new double[n];
		for (int i = 0; i < n; i++) {
			resultado[i] = ingresos[i] - gastos[i];

		}
		// imprimir
		System.out.printf("%25s %18s %20s\n", "Ingresos", "Gastos", "Resultado");
		for (int i = 0; i < n; i++) {
			System.out.printf("Empresa%d %15.2f %19.2f %19.2f", i + 1, ingresos[i], gastos[i], resultado[i]);
			System.out.println();
		}
		System.out.println();
		// Resultado peor (minimo)
		double minimo = resultado[0];
		for (int i = 0; i < n; i++) {
			if (resultado[i] < minimo) {
				minimo = resultado[i];
			}
		}
		for (int i = 0; i < n; i++) {
			if (resultado[i] == minimo) {
				System.out.println("La empresa que ha obtenido el peor resultado es Empresa" + (i + 1));

			}
		}
		System.out.printf("El peor resultado = %.2f ",minimo);

	}

	public static double[] ingresos(int n) {
		int li = 5000, ls = 10000;
		double tb[] = new double[n];

		for (int i = 0; i < n; i++) {

			tb[i] = (double) (Math.random() * (ls - li + 1)) + li;

		}
		return tb;
	}

	public static double[] gastos(int n) {
		int li = 1000, ls = 6000;
		double tb[] = new double[n];

		for (int i = 0; i < n; i++) {

			tb[i] = (double) (Math.random() * (ls - li + 1)) + li;

		}
		return tb;
	}

}
