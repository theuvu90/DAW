package Principal;

import java.util.ArrayList;

public class Ejer01 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		lista.add("Jose");
		lista.add("Maria");
		lista.add("Juan");
		lista.add("Andres");
		lista.add("Luis");
		lista.add("Maria");
		
		lista.add(0,"Ana"); // Insertar en una posicion dada
		
		for(String item : lista)System.out.println(item);
		lista.remove(1);
		
		System.out.println();
		for(String item : lista)System.out.println(item);
		boolean nueva = lista.remove("Andrea"); // devolver true o false
		System.out.println(nueva);
		
		nueva = lista.contains("Juan");
		System.out.println(nueva);
		System.out.println(lista.indexOf("Maria"));
		System.out.println(lista.indexOf("Andrea"));
		
		for(int i=0; i<lista.size();i++)System.out.println(i+" "+lista.get(i));
		
		lista.remove(10); // error porque no existe index 10
		// lista.clear();  borrar todos los elementos de la lista
		
		System.out.println(lista.indexOf("Maria")); // si no está devuelve -1
		System.out.println(lista.lastIndexOf("Maria"));
		
		lista.set(2, "Maria Mercedes"); // modificar contenido en index 2
		
		
		
		
		
		
		
		
		

	}

}
