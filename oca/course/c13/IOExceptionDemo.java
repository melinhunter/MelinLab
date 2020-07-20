package course.c13;

import java.io.File;
import java.io.IOException;

public class IOExceptionDemo {
	public static void main(String args[]) {
		try {
			testCheckedException();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void testCheckedException() throws IOException {
		String path = System.getProperty("user.dir") + "/src/course/c13/temp/";
		File f = new File(path + "test.txt");
		f.createNewFile();
		System.out.println("File is created? " + f.exists());
	}

}
