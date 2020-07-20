package course.c07;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
	public static void main(String[] args) {
		Properties myProps = new Properties();
		try {
			FileInputStream fis = new FileInputStream("test.properties");
			myProps.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Server:" + myProps.getProperty("hostName"));
		System.out.println("User:" + myProps.getProperty("userName"));
		System.out.println("Password:" + myProps.getProperty("password"));
	}
}
