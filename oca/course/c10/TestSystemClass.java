package course.c10;

import java.util.*;

public class TestSystemClass {

	public static void main(String[] args) {
		System.out.println(System.getenv()); // 一行列出全部環境變數
		System.out.println(System.getenv("JAVA_HOME"));

		System.out.println("-----------------------------------------------");
		
		for (Iterator<String> iter = System.getenv().keySet().iterator(); iter.hasNext();) {
			String key = iter.next();
			System.out.println(key + " = " + System.getenv().get(key));
		}

	}

}
