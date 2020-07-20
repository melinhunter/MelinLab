package course.c06;

public class NullTest {

	public static void main(String[] args) {

		course.c04.Shirt nullTest = null;

		System.out.println(nullTest);

		// System.out.println(null);

		String s1 = null + "Hi";
		String s2 = "Hi" + null;

		System.out.println(s1);

		System.out.println(s2);

	}

}
