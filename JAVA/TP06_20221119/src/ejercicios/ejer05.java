package ejercicios;

public class ejer05 {

	public static void main(String[] args) {
		double alturas[]= {10.02,20.19,30.47,40.93,50.95};
		System.out.println("El numero de alturas ="+alturas.length); 
		System.out.println("El primer altura es "+alturas[0]);
		System.out.println("El ultimo altura es "+alturas[alturas.length-1]);
		for(int i=0;i<alturas.length;i++) {
			System.out.println(i+" "+alturas[i]);
		}

	}

}
