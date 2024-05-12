package Clases;

public class Television extends Electrodomestico {
	private double resolucion;
	private boolean sintonizador_TDT;

	public Television() {
		super();
		this.resolucion = 20;
		this.sintonizador_TDT = false;
	}

	public Television(double precioBase, double peso) {
		super(precioBase, peso);
		this.resolucion = 20;
		this.sintonizador_TDT = false;
	}
	
	public Television(double precioBase, String color, char consumoEnergetico, double peso,double resolucion, boolean sintonizador_TDT) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizador_TDT = sintonizador_TDT;
	}

	public double getResolucion() {
		return resolucion;
	}

	public void setResolucion(double resolucion) {
		this.resolucion = resolucion;
	}

	public boolean isSintonizador_TDT() {
		return sintonizador_TDT;
	}

	public void setSintonizador_TDT(boolean sintonizador_TDT) {
		this.sintonizador_TDT = sintonizador_TDT;
	}

	@Override
	public double precioFinal() {
		if(resolucion>40) {
			if(sintonizador_TDT=false) {
			return super.precioFinal()*1.3;
			}else {return super.precioFinal()*1.3 + 50;}
		}else {
			if(sintonizador_TDT=false) {
				return super.precioFinal();
				}else {return super.precioFinal() + 50;}
		}
		
	}
	
	
	

}
