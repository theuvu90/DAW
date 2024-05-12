package Clases;

public class Vendedor extends Empleado {
	private String coche_matricula;
	private String area_venta;

	public Vendedor(String nombre, String apellidos, String dNI, String direccion, long telefono, double salario,
			String coche_matricula, String area_venta) {
		super(nombre, apellidos, dNI, direccion, telefono, salario);
		this.coche_matricula = coche_matricula;
		this.area_venta = area_venta;
	}

	public String getCoche_matricula() {
		return coche_matricula;
	}

	public void setCoche_matricula(String coche_matricula) {
		this.coche_matricula = coche_matricula;
	}

	public String getArea_venta() {
		return area_venta;
	}

	public void setArea_venta(String area_venta) {
		this.area_venta = area_venta;
	}

	@Override
	public String toString() {
		return "Vendedor [coche_matricula=" + coche_matricula + ", area_venta=" + area_venta + "]" + super.toString();
	}

	@Override
	public double incrementarSalario() {
		return 1.1 * super.incrementarSalario();
	}

	public String cambiarCoche(String cocheNuevo_matricula) {
		coche_matricula = cocheNuevo_matricula;
		return coche_matricula;
	}

	public void darAltaCliente(String listaCliente[], String cliente) {
		String listaCliente_nuevo[] = new String[listaCliente.length + 1];
		for (int i = 0; i < listaCliente.length + 1; i++) {
			if (i == listaCliente.length) {
				listaCliente_nuevo[i] = cliente;
			} else {
				listaCliente_nuevo[i] = listaCliente[i];
			}
			System.out.println(listaCliente_nuevo[i]);
		}
				

	}
	
	public void darBajaCliente(String listaCliente[], String cliente) {
		String listaCliente_nuevo[] = new String[listaCliente.length - 1];
		int index=-1;
		for (int i = 0; i < listaCliente.length; i++) {
			if (listaCliente[i]==cliente) {
				index=i; break;}
		}
		for(int i=0; i<index;i++) {
			listaCliente_nuevo[i]= listaCliente[i];
			System.out.println(listaCliente_nuevo[i]);
		}
		System.out.println();
		for(int i=index;i<listaCliente.length - 1;i++) {
			listaCliente_nuevo[i]= listaCliente[i+1];
			System.out.println(listaCliente_nuevo[i]);
		}

	}


}
