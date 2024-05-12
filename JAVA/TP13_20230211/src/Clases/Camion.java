package Clases;

import java.time.LocalDate;

public class Camion extends Coche {
//heredado todos los atributos del coche
	
	private double Tara;
	private double Nejes;
	public Camion(String marca, String modelo, String color, LocalDate fecha_Fabricacion, double tara, double nejes) {
		super(marca, modelo, color, fecha_Fabricacion);
		Tara = tara;
		Nejes = nejes;
	}
	
	public double getTara() {
		return Tara;
	}

	public void setTara(double tara) {
		Tara = tara;
	}

	public double getNejes() {
		return Nejes;
	}

	public void setNejes(double nejes) {
		Nejes = nejes;
	}

	@Override
	public String toString() {
		return "Camion [Tara=" + Tara + ", Nejes=" + Nejes + ","+ super.toString();
	}
	
	
}
