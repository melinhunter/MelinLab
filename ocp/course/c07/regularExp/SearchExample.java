package course.c07.regularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchExample {
	public static void main(String[] args) {
		searchByPattern();
		searchByString();
	}
	private static void searchByPattern() {
		Pattern pattern = Pattern.compile("new");
		String str = "It is a good news";
		Matcher matcher = pattern.matcher(str);
		System.out.println(matcher.find());
	}
	private static void searchByString() {
		String str = "It is a good news";
		System.out.println(str.contains("new"));
		System.out.println(str.indexOf("new") > -1 ? true : false);
	}
}