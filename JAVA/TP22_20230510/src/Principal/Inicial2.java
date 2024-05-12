package Principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inicial2 {
	static BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));

	public static int alea(int li, int ls) {
		return (int) (Math.random() * (ls - li + 1)) + li;
	}
	public static void resolucion(String pro1, String juga1) {
		// Ejemplo pro=1245, juga=1634
		String n1, n2;
		int aciertos = 0, coincidencias = 0;
		String pro=pro1.toUpperCase(),juga=juga1.toUpperCase();
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
		String colores="RAVZNMBG";
		int ncolores=5,intentos=5;
		String propuesta="",jugador="",num;
		while (propuesta.length() != ncolores) {
			num=String.valueOf(colores.charAt(alea(0,colores.length()-1)));
			
			if (propuesta.indexOf(num) == -1)
				propuesta += num;
		}
		System.out.println(propuesta);
		
		for (int i = 1; i <= intentos; i++) {
			System.out.println("Indique los " + String.valueOf(ncolores) + " colores");
			jugador = sc.readLine();
			if (jugador.length() == ncolores) {
				if (propuesta.toUpperCase().equals(jugador.toUpperCase())) {
					System.out.println("Enhorabuena ha acertado en el intento " + i);
					break;
				} else {
					resolucion(propuesta, jugador);
				}
			}else {
				System.out.println("El numero tiene que ser de " +String.valueOf(ncolores+" colores"));
				i--;
			}

		}
		if (!propuesta.toUpperCase().equals(jugador.toUpperCase()))
			System.out.println("Lo siento desmasiados intentos");


	}

}
