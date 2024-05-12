package Principal;

import java.time.LocalDate;

public class Ejer02 {
	public static LocalDate UltimoViernes(LocalDate fe) {
		while(!fe.getDayOfWeek().toString().equals("FRIDAY")){
			fe=fe.plusDays(-1);
		}
		return fe;
	}

	public static void main(String[] args) {
		// En mi empresa pagan los ultimos viernes de cada mes
		// Indicar, en el año en curso, los dias de pago.
//		int anno = LocalDate.now().getYear();
//		LocalDate fecha;
//		for(int i=1; i<=12; i++) {
//			fecha=LocalDate.of(anno, i, 1); //El primer dia del mes
		//}
		
//		LocalDate hoy=LocalDate.now();
//		System.out.println(hoy);
//		System.out.println(hoy.plusMonths(3));
//		System.out.println(hoy.plusMonths(-3));
//		hoy =hoy.plusYears(1).plusMonths(3).plusDays(1);
//		System.out.println(hoy);
		
		int anno =LocalDate.now().getYear();
		LocalDate fecha;
		for(int i=1;i<=12;i++) {
			fecha=LocalDate.of(anno, i, 1);  // El primer dia de cada mes
			fecha=fecha.plusMonths(1).plusDays(-1);
			
			fecha=UltimoViernes(fecha);
			System.out.printf("%-20s %d\n",fecha.getMonth().toString(),fecha.getDayOfMonth());
		}
		
		
	}

}
