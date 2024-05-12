package Principal;

import java.time.LocalDate;

import Clases.Persona;

public class Ejer05 {

	public static void main(String[] args) {
		Persona p1=new Persona("Juan","Ruiz",LocalDate.of(2020, 10, 25));
		Persona p2=new Persona("Ana","Martinez");
		System.out.println(p1.toString());
		System.out.println(p1);
		System.out.println(p2);

	}

}
