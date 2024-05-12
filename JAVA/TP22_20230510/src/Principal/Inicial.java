package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inicial {
	static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}

	public static void resolucion(String pro, String juga) {
		// Ejemplo pro=1245, juga=1634
		String n1, n2;
		int aciertos = 0, coincidencias = 0;
		for (int i = 0; i < pro.length(); i++) {
			n1 = String.valueOf(pro.charAt(i));
			n2 = String.valueOf(juga.charAt(i));
			if (n1.equals(n2)) {
				aciertos++;
			} else if (juga.indexOf(n1) >= 0)
				coincidencias++;

		}
		System.out.println("El numero de aciertos es " + aciertos);
		System.out.println("El numero de coincidencias es " + coincidencias);
	}

	public static void main(String[] args) throws IOException {
		//String numeros="0123456789";
		String[] numeros = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		String num;
		int ndigitos = 5, intentos = 5;
		String propuesta = "";
		String jugador = "";
		while (propuesta.length() != ndigitos) {
			//num=String.valueOf(numeros.charAt(alea(0,numeros.length()-1)));
			num = numeros[alea(0, numeros.length - 1)];
			if (propuesta.indexOf(num) == -1)
				propuesta += num;
		}
		System.out.println(propuesta);

		for (int i = 1; i <= intentos; i++) {
			System.out.println("Indique el numero de " + String.valueOf(ndigitos) + " digitos");
			jugador = sc.readLine();
			if (jugador.length() == ndigitos) {
				if (propuesta.equals(jugador)) {
					System.out.println("Enhorabuena ha acertado en el intento " + i);
					break;
				} else {
					resolucion(propuesta, jugador);
				}
			}else {
				System.out.println("El numero tiene que ser de " +String.valueOf(ndigitos+" digitos"));
				i--;
			}

		}
		if (!propuesta.equals(jugador))
			System.out.println("Lo siento desmasiados intentos");

	}

}
