package Principal;

import java.io.File;
import java.io.IOException;

import Clases.CListaTfnos;
import Clases.CPersona;

public class Inicial {

	public static void main(String[] args) throws IOException {
		
	String fichero ="amigo.dat";
	CListaTfnos amigos=new CListaTfnos(new File(fichero));
	amigos.anadir(new CPersona("juan manuel","ruiz",1234L));
	System.out.println(amigos.longitud());
	amigos.anadir(new CPersona("ana","ruiz",1234L));
	System.out.println(amigos.longitud());
	CPersona p1=amigos.valorEn(1);
	System.out.println(p1);
	
	amigos.cerrar();
	


	}

	
}
