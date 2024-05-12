package Clases;

import java.util.Objects;

public class Asiento {
private char letra;
private int numero;

public Asiento(char letra, int numero) {
	super();
	this.letra = letra;
	this.numero = numero;
}
public char getLetra() {
	return letra;
}
public void setLetra(char letra) {
	this.letra = letra;
}
public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
@Override
public int hashCode() {
	return Objects.hash(letra, numero);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Asiento other = (Asiento) obj;
	return letra == other.letra && numero == other.numero;
}

}
