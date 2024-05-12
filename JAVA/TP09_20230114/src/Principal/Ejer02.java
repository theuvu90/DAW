package Principal;

import java.util.ArrayList;

public class Ejer02 {

	public static void buscar(ArrayList<String> li, String cadena, int ocurrencia) {
		int c = 0, posi = -1;
		for (int i = 0; i < li.size(); i++) {
			if (cadena.equals(li.get(i))) {
				c++;
				if (c == ocurrencia) {
					posi = i;
					break;
				}
			}
			;
		}
	}

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Jose");
		lista.add("Maria");
		lista.add("Juan");
		lista.add("Andres");
		lista.add("Luis");
		lista.add("Maria");

		buscar(lista, "Maria", 2);

	}

}
