package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault()); //2022-07-19
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal")); //2022-07-20
		
		LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault()); //2022-07-19T22:30:26
		LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal")); //2022-07-20T02:30:26
		
		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
		System.out.println("r3 = " + r3);
		System.out.println("r4 = " + r4);
		
		//Obtendo valores apartados
		System.out.println("d04 dia = " + d04.getDayOfMonth()); //20
		System.out.println("d04 mês = " + d04.getMonthValue()); //7
		System.out.println("d04 ano = " + d04.getYear()); //2022
		
		System.out.println("d05 dia = " + d05.getDayOfMonth()); //20
		System.out.println("d05 mês = " + d05.getMonthValue()); //7
		System.out.println("d05 ano = " + d05.getYear()); //2022
		System.out.println("d05 hora = " + d05.getHour()); //1
		System.out.println("d05 minuto = " + d05.getMinute()); //30
		System.out.println("d05 segundo = " + d05.getSecond()); //26
		
	}

}
