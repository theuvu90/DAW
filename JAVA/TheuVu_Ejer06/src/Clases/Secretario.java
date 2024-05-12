package Clases;

public class Secretario extends Empleado {
private String despacho;
private long fax;
public Secretario(String nombre, String apellidos, String dNI, String direccion, long telefono, double salario,String despacho,long fax) {
	super(nombre, apellidos, dNI, direccion, telefono, salario);
	this.despacho=despacho;
	this.fax=fax;	
}
public String getDespacho() {
	return despacho;
}
public void setDespacho(String despacho) {
	this.despacho = despacho;
}
public long getFax() {
	return fax;
}
public void setFax(long fax) {
	this.fax = fax;
}
@Override
public String toString() {
	return "Secretario [despacho=" + despacho + ", fax=" + fax + "]" +super.toString();
}
@Override
public double incrementarSalario() {	
	return 1.05*super.incrementarSalario();
	
}


}
