package Clases;

public class Lavadora extends Electrodomestico {
private double carga;
public Lavadora() {
	super();
	this.carga=5;
}
public Lavadora(double precioBase, double peso) {
	super(precioBase, peso);
	this.carga=5;
}
public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
	super(precioBase, color, consumoEnergetico, peso);
	this.carga = carga;
}
public double getCarga() {
	return carga;
}
public void setCarga(int carga) {
	this.carga = carga;
}
@Override
public String toString() {
	return "carga=" + carga +super.toString();
}
@Override
public double precioFinal() {
	if(carga>30) {
	return (super.precioFinal()+50);
	}else {
		return super.precioFinal();
	}
}




}
