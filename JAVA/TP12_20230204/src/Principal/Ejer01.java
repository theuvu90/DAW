package Principal;

import java.time.LocalDate;

public class Ejer01 {
//LocalDate año,mes,dia
	//LocalDateTime año, mes,dia, hora,minutos,segundos
	//LocalTime hora,minutos,segundos
	public static void main(String[] args) {
		LocalDate fecha = LocalDate.of(2023,10,1);
		LocalDate hoy=LocalDate.now();
		
		System.out.println(fecha.getDayOfWeek());
		
		System.out.println(fecha.getMonthValue());
		
		//Indicar en que dia de la semana cyumplemos años el año curso
		System.out.println(hoy.getYear());
		int anno=hoy.getYear();
		LocalDate cumple= LocalDate.of(anno,5,26);
		System.out.println(cumple.getDayOfWeek());
		System.out.println(LocalDate.of(anno,5,26).getDayOfWeek());
		System.out.println(LocalDate.of(1990, 11, 28).getDayOfWeek());
		
		
		

	}

}
