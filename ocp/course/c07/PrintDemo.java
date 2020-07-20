package course.c07;

import java.io.PrintStream;
import java.io.PrintWriter;

public class PrintDemo {

	public static void testPrintWriter(String s) {
		PrintWriter pw = new PrintWriter(System.out, true);
		pw.println(s);
		
	}

	public static void testPrintStream(String s) {
		PrintStream ps = new PrintStream(System.out);
		ps.println(s);
		ps.flush();
	}
	
	public static void main(String[] args) {
		String s = "test print something......";
		System.out.println(s);
		
		testPrintWriter(s);
		
		testPrintStream(s);
	}
}