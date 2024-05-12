package Clases;

public abstract class FiguraGeometrica {
private double lado1;

public FiguraGeometrica(double lado1) {
	super();
	this.lado1 = lado1;
}

public double getLado1() {
	return lado1;
}

public void setLado1(double lado1) {
	this.lado1 = lado1;
}

public abstract double perimetro();
public abstract double area();
@Override
public String toString() {
	return "FiguraGeometrica [lado1=" + lado1 + "]";
}

}
