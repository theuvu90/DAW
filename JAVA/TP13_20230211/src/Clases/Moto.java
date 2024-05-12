package Clases;

import java.time.LocalDate;

public class Moto extends Coche {
	
	private int Cilindrada;

	public Moto(String marca, String modelo, String color, LocalDate fecha_Fabricacion, int cilindrada) {
		super(marca, modelo, color, fecha_Fabricacion);
		Cilindrada = cilindrada;
	}

	@Override
	public String toString() {
		return "Moto [Cilindrada=" + Cilindrada + " "+ super.toString();
	}
	
	

}
