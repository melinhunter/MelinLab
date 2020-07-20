package course.c15;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

import static java.lang.System.out;

public class LocalDateDemo {

	public static void main(String[] args) {

		LocalDate now = LocalDate.now();
		out.println("Now: " + now);

		LocalDate birthDate = LocalDate.of(1995, 5, 23); // Java's Birthday

		out.println("Java's Bday: " + birthDate);
		out.println("Is Java's Bday in the past? " + birthDate.isBefore(now));
		out.println("Is Java's Bday in a leap year? " + birthDate.isLeapYear());
		out.println("Java's Bday day of the week: " + birthDate.getDayOfWeek());
		out.println("Java's Bday day of the Month: " + birthDate.getDayOfMonth());
		out.println("Java's Bday day of the Year: " + birthDate.getDayOfYear());

		LocalDate nowAfter1Month = now.plusMonths(1);
		out.println("The date after 1 month: " + nowAfter1Month);

		LocalDate nextMonday = now.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		out.println("First Monday after now: " + nextMonday);
		
		LocalDate birthDate1 = LocalDate.of(1995, Month.MAY, 23); // Java's Birthday
		out.println("Is the same date? " + birthDate.isEqual(birthDate1));
	}

}
