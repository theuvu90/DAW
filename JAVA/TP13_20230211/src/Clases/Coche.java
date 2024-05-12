package Clases;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Coche {
	private String Marca;
	private String Modelo;
	private String Color;
	private LocalDate Fecha_Fabricacion;
	
	public Coche(String marca, String modelo, String color, LocalDate fecha_Fabricacion) {
		super();
		Marca = marca;
		Modelo = modelo;
		Color = color;
		Fecha_Fabricacion = fecha_Fabricacion;
	}
	public Coche(String marca, String modelo, String color) {
		super();
		Marca = marca;
		Modelo = modelo;
		Color = color;
		Fecha_Fabricacion = LocalDate.now();
	}
	public int Antiguedad() {
		return Period.between(Fecha_Fabricacion, LocalDate.now()).getYears();
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public LocalDate getFecha_Fabricacion() {
		return Fecha_Fabricacion;
	}
	public void setFecha_Fabricacion(LocalDate fecha_Fabricacion) {
		Fecha_Fabricacion = fecha_Fabricacion;
		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Color, Fecha_Fabricacion, Marca, Modelo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		return Objects.equals(Color, other.Color) && Objects.equals(Fecha_Fabricacion, other.Fecha_Fabricacion)
				&& Objects.equals(Marca, other.Marca) && Objects.equals(Modelo, other.Modelo);
	}
	@Override
	public String toString() {
		return "Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + ", Fecha_Fabricacion="
				+ Fecha_Fabricacion + "]";
	}
	
	
	

	
	

}
