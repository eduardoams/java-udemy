package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {

		//DateTimeFormatter: https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatterBuilder.html
		
		//Data hora atual
		LocalDate d01 = LocalDate.now(); 		 //2023-04-21
		LocalDateTime d02 = LocalDateTime.now(); //2023-04-21T14:49:51.025228763
		Instant d03 = Instant.now(); 			 //2023-04-21T17:52:40.369040314Z (com fuso, global de Londres)
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		
		//Data hora a partir de um texto ISO 8601
		LocalDate d04 = LocalDate.parse("1998-11-02"); 					//1998-11-02
		LocalDateTime d05 = LocalDateTime.parse("1998-11-02T22:22:01"); //1998-11-02T22:22:01
		Instant d06 = Instant.parse("1998-11-02T22:22:01Z"); 			//1998-11-02T22:22:01Z (horário de Londes)
		Instant d07 = Instant.parse("1998-11-02T22:22:01-03:00"); 		//1998-11-03T01:22:01Z (horário de Londes com fuso de São Paulo)

		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);
		System.out.println("d06 = " + d06);
		System.out.println("d07 = " + d07);
		
		//Texto formato customizado (diferente do padrão yyyy-mm-dd)
		LocalDate d08 = LocalDate.parse("02/11/1998", DateTimeFormatter.ofPattern("dd/MM/yyyy")); 						    //1998-11-02
		LocalDateTime d09 = LocalDateTime.parse("02/11/1998 22:22:01", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")); //1998-11-02T22:22:01

		System.out.println("d08 = " + d08);
		System.out.println("d09 = " + d09);

		//Isolado (dia, mês, ano e horário)
		LocalDate d10 = LocalDate.of(1998, 11, 02); //1998-11-02
		LocalDateTime d11 = LocalDateTime.of(1998, 11, 02, 22, 22, 1); //1998-11-02T22:22:01

		System.out.println("d10 = " + d10);
		System.out.println("d11 = " + d11);
		
	}

}
