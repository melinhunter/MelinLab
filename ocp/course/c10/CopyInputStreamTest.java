package course.c10;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyInputStreamTest {
	public static void main(String[] args) throws IOException {
		Path to = Paths.get("dir/c10/oracle.html/").toAbsolutePath();
		URL url = URI.create("http://www.oracle.com/").toURL();
		try (InputStream from = url.openStream()) {
			Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
			System.out.println("Copy finished...");
		}
	}
}
