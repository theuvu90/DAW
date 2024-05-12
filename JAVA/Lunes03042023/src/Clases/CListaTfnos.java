package Clases;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CListaTfnos {
	
	private RandomAccessFile fes;
	
	private int nregs;
	
	private int tamañoReg=140;

	public CListaTfnos(File fichero) throws IOException {
		if ( fichero.exists() && !fichero.isFile()  ) throw new IOException(fichero.getName()+" no es un fichero");
		
		fes=new RandomAccessFile(fichero,"rw");
		
		nregs=(int)Math.ceil((double)fes.length()/tamañoReg);
		
	}
	/*******************************************************************/
	public void cerrar() throws IOException { fes.close();}
	/*******************************************************************/
	public int longitud() { return nregs;}
	/******************************************************************/
	public boolean ponerValorEn(int i,Persona obj) throws IOException {
		
		if (!(i>=0 && i<=nregs)) {
			System.out.println("El registro indicado esta fuera de los limites.");
			return false;
		}
		
			fes.seek(i*tamañoReg);
			fes.writeUTF(obj.getNombre());
			fes.writeUTF(obj.getDireccion());
			fes.writeLong(obj.getTelefono());
			return true;
		
	}
	/*****************************************************************/
	public Persona valorEn(int i) throws IOException {
		Persona p=null;
		if (!(i>=0 && i<=nregs)) {
			System.out.println("El registro indicado esta fuera de los limites.");
			return p;
		}
		fes.seek(i*tamañoReg);
		String nombre=fes.readUTF();
		String direccion=fes.readUTF();
		Long telefono=fes.readLong();
		p=new Persona(nombre,direccion,telefono);
		return p;
		
	}
	/*****************************************************************/
	public void añadir(Persona obj) throws IOException {
		if (ponerValorEn(nregs,obj))nregs++;
	}
	/****************************************************************/
	public boolean eliminar(long tel) throws IOException {
		
		for(int i=0;i<nregs;i++) {
			Persona p=valorEn(i);
			
			if (p.getTelefono()==tel) {
				p.setTelefono(0l);
				return ponerValorEn(i,p);
			}
		}
		return false;
	}
	/****************************************************************/
	
	public int buscar(String nombre,int pos) throws IOException {
		
		if (nombre==null || pos<0 || pos>=nregs)return -1;
		
		for(int i=pos;i<nregs;i++) {
			Persona p=valorEn(i);
			//if (p.getNombre().compareToIgnoreCase(nombre)==0) return i;
			if (p.getNombre().toUpperCase().indexOf(nombre.toUpperCase())>-1)return i;
		}
		return -1;
		
		
	}
	

}
