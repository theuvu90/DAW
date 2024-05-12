package Clases;

import java.time.LocalDate;

public class Persona {
	private String Nombre;
	private String Apellidos;
	private LocalDate Fecha_Nacimiento;
	
	public Persona(String nombre, String apellidos, LocalDate fecha_Nacimiento) {
		super();
		this.Nombre = nombre;
		this.Apellidos = apellidos;
		this.Fecha_Nacimiento = fecha_Nacimiento;
	}

	public Persona(String nombre, String apellidos) {
		super();
		Nombre = nombre;
		Apellidos = apellidos;
		this.Fecha_Nacimiento=LocalDate.now();
	}

	@Override
	public String toString() {
		return "Persona [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Fecha_Nacimiento=" + Fecha_Nacimiento
				+ "]";
	}
	
	
	
	

}
