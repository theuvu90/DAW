package Principal;

import java.util.ArrayList;

import Clases.*;

public class Ejer01 {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();
		Lavadora l1 = new Lavadora(300, 50);
		Lavadora l2 = new Lavadora(400, 60);
		Lavadora l3 = new Lavadora(1000, "negro", 'E', 100, 35);
		Lavadora l4 = new Lavadora(1200, "gris", 'F', 120, 40);
		Television t1 = new Television(315, 3);
		Television t2 = new Television(700, 8);
		Television t3 = new Television(1000, "negro", 'C', 11, 45, true);
		Television t4 = new Television(500, "negro", 'A', 5, 32, false);
		Electrodomestico e1 = new Electrodomestico();
		Electrodomestico e2 = new Electrodomestico(350, 20);
		lista.add(l1);
		lista.add(l2);
		lista.add(l3);
		lista.add(l4);
		lista.add(t1);
		lista.add(t2);
		lista.add(t3);
		lista.add(t4);
		lista.add(e1);
		lista.add(e2);
		double precioLavadora = 0;
		double precioTelevision = 0;
		double precioElectrodomestico = 0;
		double precioTotal = 0;
		for (Electrodomestico item : lista) {
			if (item instanceof Lavadora) {
				precioLavadora += item.precioFinal();
			}
			if (item instanceof Television) {
				precioTelevision += item.precioFinal();
			}
			if (item instanceof Electrodomestico) {
				precioElectrodomestico += item.precioFinal();
			}

		}
		precioTotal = precioLavadora + precioTelevision + precioElectrodomestico;
		System.out.printf("Lavadora= %-15f Television= %-15f Electrodomestico= %-15f Total= %-15f", precioLavadora,
				precioTelevision, precioElectrodomestico, precioTotal);

	}

}
