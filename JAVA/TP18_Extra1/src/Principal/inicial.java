package Principal;

import java.io.File;
import java.io.IOException;

import Clases.CListaTfnos;
import Clases.Persona;

public class inicial {

	public static void main(String[] args) throws IOException {
		String fichero="alumnos.dat";
		CListaTfnos falumnos=new CListaTfnos(new File(fichero));
		falumnos.añadir(new Persona("Jose Manuel1","c/abc 123",12345l));
		System.out.println(falumnos.longitud());
		falumnos.añadir(new Persona("Ana Maria1","c/abc 123",12345l));
		System.out.println(falumnos.longitud());
		falumnos.añadir(new Persona("Jose Manuel2","c/abc 123",12345l));
		System.out.println(falumnos.longitud());
		
		for(int i=0;i<falumnos.longitud();i++) {
			Persona p=falumnos.valorEn(i);
			System.out.println(i+" "+p);
		}
		falumnos.cerrar();
	}

}
