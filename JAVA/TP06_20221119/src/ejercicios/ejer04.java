package ejercicios;

public class ejer04 {

	public static void main(String[] args) {
		String semana[]= {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		System.out.println(semana.length); 
		System.out.println("El primer elemento es "+semana[0]);
		System.out.println("El ultimo elemento es "+semana[semana.length-1]);
		for(int i=0;i<=semana.length-1;i++) {
			System.out.println(i+" "+semana[i]);
		}

	}

}
