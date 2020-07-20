package course.c07.regularExp;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OtherPatternsTest {
	public static void main(String[] args) throws IOException {
		StringBuilder htmlContent = new StringBuilder();
		Path source = Paths.get(
				"src/course/c07/regularExp/OtherPatternsTest.html")
				.toAbsolutePath();
		Charset cs = Charset.forName("BIG5");
		List<String> lines = Files.readAllLines(source, cs);
		for (String s : lines) {
			htmlContent.append(s);
		}
		
		System.out.println("-- Found ip ------- ");
		String ip = "[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}";
		showMatched(htmlContent, ip);
		
		System.out.println("\n-- Found email ------- ");
		String email = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}";
		showMatched(htmlContent, email);
		
		System.out.println("\n-- Found url ------- ");
		String url = "http?:\\/\\/[-a-zA-Z0-9@:%._\\+~#=]{2,256}\\.[a-z]{2,6}"
				+ "\\b([-a-zA-Z0-9@:%_\\+.~#?&//=]*)";
		showMatched(htmlContent, url);
		
		System.out.println("\n-- Found htmlTag ------- ");
		String htmlTag = "</?[a-z][a-z0-9]*[^<>]*>";
		showMatched(htmlContent, htmlTag);
	}
	private static void showMatched(StringBuilder html, String regularExp) {
		Pattern p = Pattern.compile(regularExp);
		Matcher m = p.matcher(html.toString());
		while (m.find()) {
			System.out.println(m.group());
		}
	}
}
