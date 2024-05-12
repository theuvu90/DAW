package Ejercicios;

import java.util.HashMap;
import java.util.Map;

public class Ejer01 {

	public static void main(String[] args) {
		HashMap<String,Double> lista= new HashMap<String,Double>();
		lista.put("Pera", 1.45);
		lista.put("Kiwi", 5.45);
		lista.put("Manzana", 3.45);
		lista.put("Melocotones", 2.45);
		
		lista.put("Pera", 4.56);
		
		System.out.println(lista.get("Pera"));
		
		if(lista.containsKey("Uvas")) {
			System.out.println(lista.get("Uvas"));
		}else {
			System.out.println("No tengo uvas");
		}
		if(lista.containsValue(5.45)) {
			System.out.println("Si tengo");
		}else {
			System.out.println("No tengo un precio que es 5.45");
		}
		
		for(String clave: lista.keySet()) {
			System.out.printf("%-15s %.2f\n",clave,lista.get(clave));
			
		}
		
		for(Double valor:lista.values())System.out.println(valor);
		
		for(Map.Entry<String, Double> par: lista.entrySet())
			System.out.printf("%-15s %.2f\n",par.getKey(),par.getValue());
		
		
		

	}

}
