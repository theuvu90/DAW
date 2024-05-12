package Clases;

public class JefeDeZona extends Empleado {
	private String despacho;
	private String nombre_secretario;
	private String coche_matricula;

	public JefeDeZona(String nombre, String apellidos, String dNI, String direccion, long telefono, double salario,
			String despacho, String nombre_secretario, String coche_matricula) {
		super(nombre, apellidos, dNI, direccion, telefono, salario);
		this.despacho = despacho;
		this.nombre_secretario = nombre_secretario;
		this.coche_matricula = coche_matricula;
	}

	public String getDespacho() {
		return despacho;
	}

	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}

	public String getNombre_secretario() {
		return nombre_secretario;
	}

	public void setNombre_secretario(String nombre_secretario) {
		this.nombre_secretario = nombre_secretario;
	}

	public String getCoche_matricula() {
		return coche_matricula;
	}

	public void setCoche_matricula(String coche_matricula) {
		this.coche_matricula = coche_matricula;
	}

	@Override
	public String toString() {
		return "JefeDeZona [despacho=" + despacho + ", nombre_secretario=" + nombre_secretario + ", coche_matricula="
				+ coche_matricula + "]" + super.toString();
	}

	@Override
	public double incrementarSalario() {
		return 1.2 * super.incrementarSalario();
	}
	public String cambiarSecretario(String nombre) {
		this.nombre_secretario=nombre;
		return this.nombre_secretario;
	}
	public void darAltaVendedor(String listaVendedor[], String vendedor) {
		String listaVendedor_nuevo[] = new String[listaVendedor.length + 1];
		for (int i = 0; i < listaVendedor.length + 1; i++) {
			if (i == listaVendedor.length) {
				listaVendedor_nuevo[i] = vendedor;
			} else {
				listaVendedor_nuevo[i] = listaVendedor[i];
			}
			System.out.println(listaVendedor_nuevo[i]);
		}
				

	}
	public void darBajaVendedor(String listaVendedor[], String vendedor) {
		String listaVendedor_nuevo[] = new String[listaVendedor.length - 1];
		int index=-1;
		for (int i = 0; i < listaVendedor.length; i++) {
			if (listaVendedor[i]==vendedor) {
				index=i; break;}
		}
		for(int i=0; i<index;i++) {
			listaVendedor_nuevo[i]= listaVendedor[i];
			System.out.println(listaVendedor_nuevo[i]);
		}
		System.out.println();
		for(int i=index;i<listaVendedor.length - 1;i++) {
			listaVendedor_nuevo[i]= listaVendedor[i+1];
			System.out.println(listaVendedor_nuevo[i]);
		}

	}
}
