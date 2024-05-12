package Clases;

public class Electrodomestico {
	private double precioBase;
	private String color;
	private char consumoEnergetico;
	private double peso;
	public Electrodomestico() {
		this.precioBase = 100;
		this.color = "blanco";
		this.consumoEnergetico = 'F';
		this.peso = 5;
	}
	public Electrodomestico(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = "blanco";
		this.consumoEnergetico = 'F';
	}
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public String getColor() {
		return color;
		
	}
	public void setColor(String color) {
		if(comprobarColor(color)==true) {
		this.color=color;
		}else {this.color="blanco";}
	}
	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}
	public void setConsumoEnergetico(char consumoEnergetico) {
		if(comprobarConsumoEnergetico(consumoEnergetico)==true) {
			this.consumoEnergetico=consumoEnergetico;
			}else {this.consumoEnergetico='F';}
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso;
	}
	
	public boolean comprobarConsumoEnergetico(char letra) {		
		char a[]={'A','B','C','D','E','F'};
		for(int i=0;i<a.length;i++) {			
			if(Character.toString(letra).equalsIgnoreCase(Character.toString(a[i])))return true;
		}
		return false;
	}
	
	

	public boolean comprobarColor(String color) {		
		String a[]={"blanco","negro","rojo","azul","gris"};
		for(int i=0;i<a.length;i++) {
			if(color.equalsIgnoreCase(a[i]))return true;
		}
		return false;
	}

	public double precioFinal() {
		double precioFinal=precioBase;		
		
		if(consumoEnergetico=='A') {
			precioFinal+=100;
		}else if(consumoEnergetico=='B'){
			precioFinal+=80;
		}else if(consumoEnergetico=='C'){
			precioFinal+=60;			
		}else if(consumoEnergetico=='D'){
			precioFinal+=50;			
		}else if(consumoEnergetico=='E'){
			precioFinal+=30;			
		}else{precioFinal+=10;}
		
		if(peso<20) {
			precioFinal+=10;
		}else if(peso<50){
			precioFinal+=50;
		}else if(peso<80){
			precioFinal+=80;
		}else{precioFinal+=100;}
		
		return precioFinal;
	}
	
	
	

}
