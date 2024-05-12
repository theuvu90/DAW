package Principal;

import java.time.LocalDate;

public class Ejer03 {
	//Imprimir los dias fin de semana de todo el año
	public static LocalDate findeSemana (LocalDate fe) {
		while(
				!(fe.getDayOfWeek().toString().equals("SATURDAY")
				||
				fe.getDayOfWeek().toString().equals("SUNDAY"))
				
				) {
			fe=fe.plusDays(1);
			
		}
		return fe;
	}

	public static void main(String[] args) {
		int anno = LocalDate.now().getYear();
		LocalDate fecha= LocalDate.of(anno, 1, 1);
		fecha=findeSemana(fecha);
		
		int n=fecha.getDayOfWeek().toString().equals("SUNDAY")? -1:1;
		
		while(fecha.getYear()==anno) {
			if(n==1) {
				System.out.printf("%-15s %2d %-15s %2d\n",
						fecha.getMonth().toString(),
						fecha.getDayOfMonth(),
						fecha.plusDays(1).getMonth().toString(),
						fecha.plusDays(1).getDayOfMonth()		
				
						);
			}else {
				System.out.printf("%-15s %2d %-15s %2d\n",
						fecha.plusDays(-1).getMonth().toString(),
						fecha.plusDays(-1).getDayOfMonth(),
						fecha.getMonth().toString(),
						fecha.getDayOfMonth()
						
						);
			}
			
			
			fecha=fecha.plusDays(7);
			
		}

	}

}
