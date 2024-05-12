package ejercicios;

public class ejer02 {

	public static void main(String[] args) {
		int tb[]= {10,20,30,40,50};
		System.out.println(tb.length); 
		System.out.println("El primer elemento es "+tb[0]);
		System.out.println("El ultimo elemento es "+tb[tb.length-1]);
		for(int i=0;i<=tb.length-1;i++) {
			System.out.println(i+" "+tb[i]);
		}

	}

}
