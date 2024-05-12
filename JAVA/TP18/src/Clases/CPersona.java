package Clases;

public class CPersona {
	private String Nombre;
	private String Direccion;
	private Long Telefono;
	public CPersona(String nombre, String direccion, Long telefono) {
		super();
		this.Nombre = nombre;
		this.Direccion = direccion;
		this.Telefono = telefono;
	}
	public CPersona(String nombre, String direccion) {
		super();
		this.Nombre = nombre;
		this.Direccion = direccion;
		this.Telefono = 0L;
	}
	public String getNombre() {return Nombre;}
	public void setNombre(String nombre) {Nombre = nombre;}
	
	public String getDireccion() {return Direccion;}
	public void setDireccion(String direccion) {Direccion = direccion;}
	
	public Long getTelefono() {return Telefono;}
	public void setTelefono(Long telefono) {Telefono = telefono;}
	
	@Override
	public String toString() {
		return "Nombre=" + Nombre + ", Direccion=" + Direccion + ", Telefono=" + Telefono;
	}
	
	
	
	

}
