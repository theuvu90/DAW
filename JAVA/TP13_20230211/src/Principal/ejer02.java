package Principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import Clases.*;


public class ejer02 {

	public static void main(String[] args) {
		Camion cm1=new Camion("Scania","sc21","Blanco",LocalDate.of(2000,10,10),25,5);
		cm1.setColor("Azul");
		cm1.setNejes(10);
		System.out.println(cm1);
		System.out.println(cm1.Antiguedad());
		Moto m1=new Moto("Honda","H21","Verde",LocalDate.now(),1200);
		Coche c1=new Coche("Opel","Vectra","Negro",LocalDate.of(2001,1,1));
		System.out.println(m1);
		System.out.println(m1.Antiguedad());
		System.out.println(c1);
		System.out.println(c1.Antiguedad());
		
		//Polimorfismo
		ArrayList<Coche> flota = new ArrayList<Coche>();
		flota.add(cm1);
		flota.add(m1);
		flota.add(c1);
		for(Coche item: flota)System.out.println(item);
		HashMap<String,Coche> otro = new HashMap<String,Coche>();
		otro.put("1111", c1);
		otro.put("2222", m1);
		otro.put("3333", cm1);
		otro.put("4444", new Coche("Mercedes","vito","Blanco"));
		
		System.out.println("\n \n =========================\n\n");
		
		for(String clave: otro.keySet())System.out.println(clave+" "+otro.get(clave).Antiguedad());

	}

}
