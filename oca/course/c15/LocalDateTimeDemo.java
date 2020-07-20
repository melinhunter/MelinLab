package course.c15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import static java.lang.System.out;

public class LocalDateTimeDemo {

	public static void main(String[] args) {

		LocalDate flightDate = LocalDate.of(2014, Month.MAY, 2);
		LocalTime flightTime = LocalTime.of(21, 45);
		LocalDateTime flight = LocalDateTime.of(flightDate, flightTime);
		out.println("Flight leaves: " + flight);

		LocalDateTime seminarStart = LocalDateTime.of(2016, Month.MAY, 2, 9, 30);
		out.println("Seminar starts: " + seminarStart);
		LocalDateTime seminarEnd = seminarStart.plusDays(2).plusHours(8);
		out.println("Seminar ends: " + seminarEnd);
		
		out.println("Now: " + LocalDateTime.now());

	}

}
