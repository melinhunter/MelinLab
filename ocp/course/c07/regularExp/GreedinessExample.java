package course.c07.regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GreedinessExample {
	public static void main(String[] args) {
		String t = "Long longlong ago, in a place far farfar away";

		Pattern p1 = Pattern.compile("ago.*");
		Matcher m1 = p1.matcher(t);
		while (m1.find()) {
			System.out.println("Found p1: " + m1.group());
		}

		Pattern p2 = Pattern.compile("pl.{3}");
		Matcher m2 = p2.matcher(t);
		while (m2.find()) {
			System.out.println("Found p2: " + m2.group());
		}

		Pattern p3 = Pattern.compile("(long){2}");
		Matcher m3 = p3.matcher(t);
		while (m3.find()) {
			System.out.println("Found p3: " + m3.group());
		}
	}
}
