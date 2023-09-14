package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		
		//DateTimeFormatter: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatterBuilder.html
		
		LocalDate d04 = LocalDate.parse("1998-11-02"); 					//1998-11-02
		LocalDateTime d05 = LocalDateTime.parse("1998-11-02T22:22:01"); //1998-11-02T22:22:01
		Instant d06 = Instant.parse("2023-01-01T01:20:00Z");
		
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;

		System.out.println("d04 = " + d04.format(fmt01)); //02/11/1998
		System.out.println("d04 = " + fmt01.format(d04)); //02/11/1998

		System.out.println("d05 = " + fmt02.format(d05)); //02/11/1998, 22:22:01
		System.out.println("d05 = " + fmt04.format(d05)); //1998-11-02T22:22:01
		
		
		//Antes de imprimir de forma customizada uma data hora global (Instant), precisa converter para data hora local
		System.out.println("d06 = " + fmt03.format(d06)); //31/12/2022, 22:20:00
		System.out.println("d06 = " + fmt05.format(d06)); //2023-01-01T01:20:00Z
		System.out.println("d06 = " + d06); //2023-01-01T01:20:00Z
		
	}

}
