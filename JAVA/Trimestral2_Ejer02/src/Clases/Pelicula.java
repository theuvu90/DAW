package Clases;

public class Pelicula {
private String titulo;
private double duracion;
private int edad_minima;
private String directo;
public Pelicula(String titulo, double duracion, int edad_minima, String directo) {
	super();
	this.titulo = titulo;
	this.duracion = duracion;
	this.edad_minima = edad_minima;
	this.directo = directo;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo) {
	this.titulo = titulo;
}
public double getDuracion() {
	return duracion;
}
public void setDuracion(double duracion) {
	this.duracion = duracion;
}
public int getEdad_minima() {
	return edad_minima;
}
public void setEdad_minima(int edad_minima) {
	this.edad_minima = edad_minima;
}
public String getDirecto() {
	return directo;
}
public void setDirecto(String directo) {
	this.directo = directo;
}


}
