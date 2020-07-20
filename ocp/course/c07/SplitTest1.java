package course.c07;

import java.util.Scanner;
import java.util.StringTokenizer;

public class SplitTest1 {

	public static void main(String[] args) {
		// demoString();
		// demoStringTokenizer();
		demoScanner();
	}

	public static void demoString() {
		String shirts = "1st Shirt, 2nd Shirt, 3rd Shirt, 4th Shirt";
		System.out.println(shirts.replaceAll(". ", "@"));
		String[] results = shirts.split(". ");
		for (String shirtStr : results) {
			System.out.println(shirtStr);
		}
	}

	public static void demoStringTokenizer() {
		String shirts = "1st Shirt, 2nd Shirt, 3rd Shirt, 4th Shirt";
		StringTokenizer st = new StringTokenizer(shirts, ", ");
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken() + "@");
		}
	}

	public static void demoScanner() {
		String str = "1.11, 2.22, 3.33";
		double sum = 0;
		Scanner scan = new Scanner(str).useDelimiter(", ");
		try {
			while (scan.hasNextDouble()) {
				double d = scan.nextDouble();
				System.out.println(d);
				sum += d;
			}
			System.out.println("Sum: " + sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
