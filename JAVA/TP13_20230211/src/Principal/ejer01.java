package Principal;

import java.time.LocalDate;
import java.util.ArrayList;

import Clases.Coche;

public class ejer01 {

	public static void main(String[] args) {
		Coche c1 = new Coche("Opel","Vetra","Blanco",LocalDate.of(2000, 10, 10));		
		Coche c2 = new Coche("Opel","Vetra","Blanco",LocalDate.of(2000, 10, 10));
		String v1="hola", v2="hola";
		int w1=10,w2=10;
		System.out.println(v1.equals(v2));
		System.out.println(w1==w2);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		ArrayList<Coche> lista = new ArrayList<Coche>();
		lista.add(c1);
		lista.add(c2);
		lista.remove(new Coche("Opel","Vetra","Blanco",LocalDate.of(2000, 10, 10)));
		for(Coche c : lista)System.out.println(c);
		
		
	}

}
