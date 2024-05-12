package Clases;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Biblioteca {

	private RandomAccessFile fes;
	private int nregs;
	private int tamañoReg=200;
	
	public Biblioteca(File fichero) throws IOException {
        if ( fichero.exists() && !fichero.isFile()  ) throw new IOException(fichero.getName()+" no es un fichero");
		fes=new RandomAccessFile(fichero,"rw");
		nregs=(int)Math.ceil((double)fes.length()/tamañoReg);
	}
	/*******************************************************************/
	public void cerrar() throws IOException { fes.close();}
	/*******************************************************************/
	public int longitud() { return nregs;}
	/*******************************************************************/
	public Libro valorEn( int i ) throws IOException{
	    if (i >= 0 && i < nregs){
	      fes.seek(i * tamañoReg); // situar el puntero de L/E
	      String ISBN, Titulo,Autor,Editorial;
	      int Año;
	      ISBN = fes.readUTF();
	      Titulo = fes.readUTF();
	      Autor = fes.readUTF();
	      Editorial = fes.readUTF();
          Año=fes.readInt(); 
	      
	      return new Libro(ISBN, Titulo,Autor,Editorial,Año);
	    }else{
	      System.out.println("número de registro fuera de límites");
	      return null;
	    }
	  }
	/*******************************************************************/
	public boolean ponerValorEn( int i, Libro objeto ) throws IOException{
		  
	    if (i >= 0 && i <= nregs) {
	      if (objeto.tamaño() + 4 > tamañoReg)
	        System.err.println("tamaño del registro excedido");
	      else{
	        fes.seek(i * tamañoReg); // situar el puntero de L/E
	        fes.writeUTF(objeto.getISBN());
	        fes.writeUTF(objeto.getTitulo());
	        fes.writeUTF(objeto.getAutor());
	        fes.writeUTF(objeto.getEditorial());
	        fes.writeInt(objeto.getAño());

	        return true;
	      }
	    } else
	      System.err.println("número de registro fuera de límites");
	    return false;
	  }
	/*******************************************************************/
	public void añadir(Libro obj) throws IOException{
	    if (ponerValorEn( nregs, obj )) nregs++;
	}
	/*******************************************************************/
	  public int buscar(String str, int pos) throws IOException{
		    Libro obj;
		    String nom;
		    if (str == null) return -1;
		    if (pos < 0) pos = 0;
		    for ( int reg_i = pos; reg_i < nregs; reg_i++ ){
		      obj = valorEn(reg_i);
		      nom = obj.getTitulo();
		      if (nom.indexOf(str) > -1) return reg_i;
		    }
		    return -1;
		  }
	  /*******************************************************************/
	  public boolean eliminar(String isbn) throws IOException{
		    Libro obj;
		    for ( int reg_i = 0; reg_i < nregs; reg_i++ ) {
		      obj = valorEn(reg_i);
		      if (obj.getISBN().equals(isbn)){
		        
		    	  obj.setAño(-1);
		        
		        ponerValorEn( reg_i, obj );
		        return true;
		      }
		    }
		    return false;
		  }
}
