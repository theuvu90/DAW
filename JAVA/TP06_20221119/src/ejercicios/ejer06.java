package ejercicios;

public class ejer06 {

	public static void main(String[] args) {
		double alturas[]= new double[5]; 
		System.out.println("El numero de alturas = "+alturas.length);
		alturas[0]=1.5;
		alturas[1]=1.76;
		alturas[2]=alturas[0]+10;
		alturas[alturas.length-1]=2.06;
		
		for(int i=0; i<alturas.length;i++) {
			System.out.println(i+" "+alturas[i]);
		}

	}

}
