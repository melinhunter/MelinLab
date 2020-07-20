package course.c10;


import java.nio.file.*;


public class FilesTest {

	private static void testExists() {
		String thisJava = System.getProperty("user.dir") + "\\src\\course\\c10\\FilesTest.java";
		Path p = Paths.get(thisJava);
		boolean b = Files.exists(p, LinkOption.NOFOLLOW_LINKS);
		System.out.format("%s exists: %b%n", p, b);
		b = Files.notExists(p, LinkOption.NOFOLLOW_LINKS);
		System.out.format("%s does not exists: %b%n", p, b);
	}

	public static void main(String[] args) {
		testExists();

	}

}
