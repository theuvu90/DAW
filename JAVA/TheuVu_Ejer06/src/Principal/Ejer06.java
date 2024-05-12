package Principal;

import java.util.ArrayList;

import Clases.*;

public class Ejer06 {

	public static void main(String[] args) {
		Vendedor v = new Vendedor("Maria", "Lopez", "92365923D", "c/abc", 10L, 1000, "12345F", "DE");
		Secretario s = new Secretario("Ana", "Rodriguez", "12365923D", "c/abc", 10L, 1600, "AB", 23L);
		JefeDeZona j = new JefeDeZona("Juan", "Lopez", "92365923D", "c/abc", 10L, 2000, "acda", "Ana", "96743A");
		ArrayList<Empleado> lista = new ArrayList<Empleado>();
		lista.add(v);
		lista.add(s);
		lista.add(j);
		for (Empleado e : lista) {
			System.out.println(e);
			System.out.printf("%-10s %-10s  Salario_proximoAno = %-10f\n\n", e.getNombre(), e.getApellidos(),
					e.incrementarSalario());

		}
	}

}
