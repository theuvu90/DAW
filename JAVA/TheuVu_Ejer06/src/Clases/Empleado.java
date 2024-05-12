package Clases;

public class Empleado {
	private String nombre;
	private String apellidos;
	private String DNI;
	private String direccion;
	private long telefono;
	private double salario;
	public Empleado(String nombre, String apellidos, String dNI, String direccion, long telefono, double salario) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		DNI = dNI;
		this.direccion = direccion;
		this.telefono = telefono;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public long getTelefono() {
		return telefono;
	}
	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	@Override
	public String toString() {
		return " nombre=" + nombre + ", apellidos=" + apellidos + ", DNI=" + DNI + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", salario=" + salario;
	}
	public double incrementarSalario() {
		double salario_proximoAno=salario;
		return salario_proximoAno;
	}
	public void cambiarSupervisor() {}

}
