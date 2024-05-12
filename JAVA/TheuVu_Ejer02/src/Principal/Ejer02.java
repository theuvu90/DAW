package Principal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import Clases.*;

public class Ejer02 {

	private static final String Hashmap = null;

	public static void main(String[] args) {

		double precio = 15;

		Espectador e1 = new Espectador("Ana", 9, 15);
		Espectador e2 = new Espectador("Bruno", 10, 30);
		Espectador e3 = new Espectador("Emma", 7, 5);
		Espectador e4 = new Espectador("Antonio", 30, 20);
		Espectador e5 = new Espectador("David", 10, 25);
		Espectador e6 = new Espectador("Lucia", 20, 19);
		Espectador e7 = new Espectador("Mateo", 11, 10);
		Espectador e8 = new Espectador("Manuel", 25, 50);

		ArrayList<Espectador> listaEspec = new ArrayList<Espectador>();
		listaEspec.add(e1);
		listaEspec.add(e2);
		listaEspec.add(e3);
		listaEspec.add(e4);
		listaEspec.add(e5);
		listaEspec.add(e6);
		listaEspec.add(e7);
		listaEspec.add(e8);

		imprimirTablaAsiento();
		HashMap<String, String> lista = new HashMap<String, String>();

		for (Espectador e : listaEspec) {
			System.out.println(e.getNombre());
			Pelicula p = elegirPeli(e);
			while (poderVerPeli(e, p, precio) == true) {

				System.out.println("Elegir un asiento en la tabla arriba: ");
				Scanner sc = new Scanner(System.in);
				String Asiento = sc.nextLine();
				if (lista.containsKey(Asiento)) {
					System.out.println("El asiento esta ocupado, elegir otro asiento");
				} else {
					lista.put(Asiento, e.toString());
					System.out.println(e.getNombre() + " puede sentar en asiento " + Asiento);
					break;
				}
			}
			if (poderVerPeli(e, p, precio) == false) {
				System.out.println("No puede ver la pelicula");
			}

		}

	}

	public static Pelicula elegirPeli(Espectador e) {
		Pelicula p1 = new Pelicula("Super Mario Bros", 90, 8, "Michael Jelenic");
		Pelicula p2 = new Pelicula("ABCDEF", 60, 18, "Juan");
		Pelicula p3 = new Pelicula("GHIJK", 60, 4, "Jose");
		ArrayList<Pelicula> listaPeli = new ArrayList<Pelicula>();
		listaPeli.add(p1);
		listaPeli.add(p2);
		listaPeli.add(p3);
		Scanner sc = new Scanner(System.in);

		System.out.println("Elegir pelicula:");
		String peli = sc.nextLine();
		Pelicula p = p1;
		for (Pelicula pe : listaPeli) {
			if (pe.getTitulo().equalsIgnoreCase(peli))
				p = pe;
		}
		return p;
	}

	public static boolean poderVerPeli(Espectador e, Pelicula p, double precio) {
		e.getDinero();
		e.getEdad();
		p.getEdad_minima();
		if (e.getDinero() >= precio && e.getEdad() >= p.getEdad_minima()) {
			return true;
		} else {
			return false;
		}
	}

	public static void imprimirTablaAsiento() {
		int fila[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		String columna[] = { "A", "B", "C", "D", "E", "F", "G", "H", "I" };
		String asiento[][] = new String[8][9];
		System.out.println("La tabla de los asientos:");
		for (int i = fila.length - 1; i >= 0; i--) {
			for (int j = 0; j < columna.length; j++) {
				asiento[i][j] = Integer.toString(fila[i]) + columna[j];
				System.out.print(asiento[i][j] + " ");
			}
			System.out.println();
		}
	}

}
