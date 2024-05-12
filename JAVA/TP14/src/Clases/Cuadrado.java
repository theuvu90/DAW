package Clases;

public class Cuadrado extends FiguraGeometrica {

	public Cuadrado(double lado1) {
		super(lado1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double perimetro() {
		return 4*this.getLado1();
	}

	@Override
	public double area() {
		return Math.pow(this.getLado1(), 2);
	}

	@Override
	public String toString() {
		return "Cuadrado " + super.toString();
	}
	
	

}
