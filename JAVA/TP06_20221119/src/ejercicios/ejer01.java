package ejercicios;

public class ejer01 {

	public static void main(String[] args) {
		// Crear 10 notas aleatorias entre 0,10 y
		// obtener la nota maxima y la minima
		int li = 0, ls = 10, nota;
		int maximo = -1, minimo = 11;// siempre que el intervalo es predefinido

		for (int i = 1; i <= 10; i++) {

			nota = (int) (Math.random() * (ls - li + 1)) + li;
			System.out.println(nota);
			if (nota > maximo) {
				maximo = nota;
			}
			if (nota < minimo) {
				minimo = nota;
			}
		}
		System.out.println("el valor maximo="+maximo);
		System.out.println("el valor minimo="+minimo);

	}

}
