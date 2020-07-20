package course.c07.regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BoundaryCharExample {
	public static void main(String[] args) {
		String t = "it was the hardest of times or it was the memorable of times";

		Pattern p1 = Pattern.compile("^it.*?times");
		Matcher m1 = p1.matcher(t);
		while (m1.find()) {
			System.out.println("Found p1: " + m1.group());
		}

		Pattern p2 = Pattern.compile("\\sit.*times$");
		Matcher m2 = p2.matcher(t);
		while (m2.find()) {
			System.out.println("Found p2: " + m2.group());
		}

		Pattern p3 = Pattern.compile("\\bor\\b.{3}");
		Matcher m3 = p3.matcher(t);
		while (m3.find()) {
			System.out.println("Found p3: " + m3.group() + ".");
		}
	}
}