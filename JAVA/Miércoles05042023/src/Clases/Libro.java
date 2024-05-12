package Clases;

public class Libro {
  private String ISBN;
  private String Titulo;
  private String Autor;
  private String Editorial;
  private int Año;
  
public Libro(String iSBN, String titulo, String autor, String editorial, int año) {
	super();
	ISBN = iSBN;
	Titulo = titulo;
	Autor = autor;
	Editorial = editorial;
	Año = año;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public String getTitulo() {
	return Titulo;
}
public void setTitulo(String titulo) {
	Titulo = titulo;
}
public String getAutor() {
	return Autor;
}
public void setAutor(String autor) {
	Autor = autor;
}
public String getEditorial() {
	return Editorial;
}
public void setEditorial(String editorial) {
	Editorial = editorial;
}
public int getAño() {
	return Año;
}
public void setAño(int año) {
	Año = año;
}
@Override
public String toString() {
	return "Libro [ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Editorial=" + Editorial + ", Año="
			+ Año + "]";
}
public int tamaño() {
	return ISBN.length()*2+Titulo.length()*2+Autor.length()*2+Editorial.length()*2+4;
}
}
