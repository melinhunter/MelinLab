package course.c13;

public class ExceptionDemo {

	private static void test() {
		int[] intArray = new int[5];
		// intArray[4] = 27;
		intArray[5] = 27;
	}

	public static void main(String[] args) {
		test();
	}
}