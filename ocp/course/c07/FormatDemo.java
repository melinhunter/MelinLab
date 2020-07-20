package course.c07;

import java.io.PrintWriter;

public class FormatDemo {

	public static void testDecimal() {
		System.out.println("1234567890");
		System.out.println("---------------");
		System.out.printf("%6d, %n", 99);
		System.out.printf("%-6d, %n", 99);
		System.out.printf("%06d, %n", 99);
		System.out.printf("%6d, %n", 9999999);
		System.out.printf("%-6d, %n", 9999999);
		System.out.printf("%06d, %n", 9999999);
	}

	public static void testFloating() {
		System.out.println("123456789012345");
		System.out.println("---------------");
		// no <.precision>
		System.out.printf("%14f, %n", 123.67);
		System.out.printf("%014f, %n", 123.67);
		System.out.printf("%-14f, %n", 123.67);
		// with <.precision>
		System.out.printf("%.1f, %n", 123.67);
		System.out.printf("%.4f, %n", 123.67);
		System.out.printf("%14.4f, %n", 123.67);
		System.out.printf("%014.4f, %n", 123.67);
		System.out.printf("%-14.4f, %n", 123.67);
		System.out.printf("%3.5f, %n", 123.67);
		System.out.println("---------------");
		System.out.println("123456789012345");
		System.out.println("---------------");
		// no <.precision>
		System.out.printf("%14f, %n", 123.1234567);
		System.out.printf("%014f, %n", 123.1234567);
		System.out.printf("%-14f, %n", 123.1234567);
		// with <.precision>
		System.out.printf("%.1f, %n", 123.1234567);
		System.out.printf("%.4f, %n", 123.1234567);
		System.out.printf("%14.4f, %n", 123.1234567);
		System.out.printf("%014.4f, %n", 123.1234567);
		System.out.printf("%-14.4f, %n", 123.1234567);
		System.out.printf("%3.5f, %n", 123.1234567);
	}

	public static void advanced() {
		double price = 99.99;
		int quantity = 4;
		String color = "red";
		/* System.out.printf */
		System.out.printf("There are %02d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
		/* System.out.format */
		System.out.format("There are %02d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
		/* String.format */
		String out = String.format("There are %02d %s Polo shirts that cost $%3.2f.", quantity, color, price);
		System.out.println(out);
		/* PrintWriter.printf */
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.printf("There are %02d %s Polo shirts that cost $%3.2f.\n", quantity, color, price);
	}

	public static void main(String[] args) {
		testDecimal();
		testFloating();
		advanced();

		testCharacter();
		testString();
		testBoolean();
	}

	public static void testString() {
		System.out.printf("%s%n", "jim");
		System.out.printf("%s%n", "JIM");
		System.out.printf("%S%n", "jim");
		System.out.printf("'%4s'%n", "jim");
		System.out.printf("'%4.2s'%n", "jim");
		System.out.printf("'%4.5s'%n", "jimjim");
		System.out.printf("'%4s'%n", "jimjim");
		System.out.printf("%s,%s,%s %n", "j", "i", "m");
		System.out.printf("%3$s,%2$s,%1$s %n", "j", "i", "m");
		System.out.printf("%s%n", null);
		System.out.printf("%s%n", new java.util.ArrayList());
	}

	public static void testBoolean() {
		System.out.printf("'%B', '%4b', '%.2b'%n", true, false, true);
		System.out.printf("'%b', '%6b', '%.4b'%n", "A", "B", "C");
		System.out.printf("%b %n", 2016);
		System.out.printf("%b %n", new Object());
		System.out.printf("%b %n", null);
	}

	public static void testCharacter() {
		byte b = 126;
		Byte bb = new Byte(b);
		short s = 1277;
		Short ss = new Short(s);
		int i = 1299;
		Integer ii = new Integer(i);
		char c1 = 1234;
		char c2 = '\u8A2D';
		Character cc = new Character(c2);
		System.out.printf("%C%n", 'b');
		System.out.printf("%c%n", b);
		System.out.printf("%C%n", bb);
		System.out.printf("%C%n", s);
		System.out.printf("%c%n", ss);
		System.out.printf("%C%n", i);
		System.out.printf("%C%n", ii);
		System.out.printf("'%5C'%n", c1);
		System.out.printf("'%-5C'%n", c2);
		System.out.printf("%C%n", cc);
	}

}