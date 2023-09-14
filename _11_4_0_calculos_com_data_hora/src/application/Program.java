package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		//OPERANDO DATAS
		
		//LocalDate
		LocalDate pastWeekLocalDate = d04.minusDays(7); //2022-07-13
		LocalDate nextWeekLocalDate = d04.plusDays(7); //2022-07-27
		
		System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
		System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);
		
		//LocalDateTime
		LocalDateTime pastWeekLocalDateTime = d05.minusDays(7); //2022-07-13T01:30:26
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7); //2022-07-27T01:30:26
		LocalDateTime pastHourLocalDateTime = d05.minusHours(1); //2022-07-20T00:30:26
		LocalDateTime nextHourLocalDateTime = d05.plusHours(1); //2022-07-20T02:30:26
		
		System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = " + nextWeekLocalDateTime);
		System.out.println("pastHourLocalDateTime = " + pastHourLocalDateTime);
		System.out.println("nextHourLocalDateTime = " + nextHourLocalDateTime);
		
		//Instant
		Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS); //2022-07-13T01:30:26Z
		Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS); //2022-07-27T01:30:26Z
		Instant pastHourInstant = d06.minus(1, ChronoUnit.HOURS); //2022-07-20T00:30:26Z
		Instant nextHourInstant = d06.plus(1, ChronoUnit.HOURS); //2022-07-20T02:30:26Z

		System.out.println("pastWeekInstant = " + pastWeekInstant);
		System.out.println("nextWeekInstant = " + nextWeekInstant);
		System.out.println("pastHourInstant = " + pastHourInstant);
		System.out.println("nextHourInstant = " + nextHourInstant);
		
		//DURAÇÃO ENTRE DATAS
		
		//LocalDate t1, LocalDateTime t2 e Instant t3
		//Convertendo para LocalDate para LocalDatetime
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
		Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
		Duration t3 = Duration.between(pastWeekInstant, d06);
				
		System.out.println("t1 dias = " + t1.toDays());
		System.out.println("t2 dias = " + t2.toDays());
		System.out.println("t3 dias = " + t3.toDays());
		
	}

}
