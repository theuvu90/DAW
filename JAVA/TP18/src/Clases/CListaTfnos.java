package Clases;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CListaTfnos {
	
	private RandomAccessFile fes;
	private int nrgs;
	private int tamano=140;
	
	public CListaTfnos(File fichero) throws IOException {
		if(fichero.exists()&& !fichero.isFile()) throw new IOException(fichero.getName()+" no existe");
		fes = new RandomAccessFile(fichero,"rw");
		nrgs= (int)Math.ceil((double)fes.length()/(double)tamano);
		// Math.ceil el numero entero mayor o igual que el numero
	}
	public void cerrar() throws IOException {fes.close();}
	public int longitud() {return nrgs;}
	
	public boolean ponerValorEn(int i, CPersona p) throws IOException {
		if(!(i>=0 && i<nrgs)) {
			System.out.println("El valor de "+i+" esta fuera de rango");
			return false;
		}
		fes.seek(i*tamano);
		fes.writeUTF(p.getNombre());
		fes.writeUTF(p.getDireccion());
		fes.writeLong(p.getTelefono());
		return true;
	}
	
	public void anadir(CPersona p) throws IOException {
		if(ponerValorEn(nrgs,p))nrgs++;
	}
	
	public CPersona valorEn(int i) throws IOException {
		if(!(i>=0 && i<nrgs)) {
			System.out.println("El valor de "+i+" esta fuera de rango");
			return null;
		}
		fes.seek(i*tamano);
		String nombre=fes.readUTF();
		String direccion=fes.readUTF();
		Long telefono=fes.readLong();
		return new CPersona(nombre,direccion,telefono);
	}
	public int buscar(String bnombre, int pos) throws IOException {
		CPersona p=null;
		if(bnombre==null)return -1;
		if(pos<0)pos=0;
		
		for(int i=pos; i<=nrgs;i++) {
			p=valorEn(i);
			if(p.getNombre().equals(bnombre))return i;
		}
		return -1;
	}

}
