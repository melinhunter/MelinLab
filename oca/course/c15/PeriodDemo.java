package course.c15;

import static java.lang.System.out;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodDemo {

	public static void main(String[] args) {
	//	demo1();
	//	demo2();
		demo3();
	}
	
	private static void demo1() {
		
		LocalDate christmas = LocalDate.of(2016, Month.DECEMBER, 25);
		LocalDate today = LocalDate.now();
		out.println("today: " + today);
		long days = ChronoUnit.DAYS.between(today, christmas);
		System.out.println("There are " + days + " days until Christmas");

		Period periodUntilXMas = Period.between(today, christmas);
		System.out.println("There are " 
				+ periodUntilXMas.getMonths() + " months, " 
				+ periodUntilXMas.getDays() + " days "
				+ "until Christmas");
	}

	private static void demo2() {
		LocalDate today = LocalDate.now();
		LocalDate d1 = LocalDate.now();
		plusDay(d1);
		System.out.println("d1: " + d1);
		
		LocalDate d2 = LocalDate.now();
		plusDayByPeriod(today, Period.ofMonths(1));
		plusDayByPeriod(today, Period.ofDays(1));
		plusDayByPeriod(today, Period.ofWeeks(1));
		plusDayByPeriod(today, Period.ofYears(1));
		System.out.println("d2: " + d2);
	}
	
	private static void plusDay(LocalDate d) {
		d = d.plusMonths(1).plusDays(1).plusWeeks(1).plusYears(1);
//		d = d.plusMonths(1);
//		d = d.plusDays(1);
//		d = d.plusWeeks(1);
//		d = d.plusYears(1);
	}
	
	// method is reusable
	private static void plusDayByPeriod(LocalDate d, Period p) {
		d = d.plus(p);
	}

	private static void demo3() {
		
		Period p1 = Period.ofMonths(1).ofWeeks(1);
		System.out.println("Today + p1: " + LocalDate.now().plus(p1));
		
		Period p2 = Period.ofMonths(1);
		p2 = Period.ofWeeks(1);
		System.out.println("Today + p1: " + LocalDate.now().plus(p2));

	}
	

}
