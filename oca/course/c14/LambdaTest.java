package course.c14;

@FunctionalInterface
interface MyI1 {
	int getInt();
}

@FunctionalInterface
interface MyI2 {
	int getInt(int x);
}

@FunctionalInterface
interface MyI3 {
	int getInt(int x, int y);
}

@FunctionalInterface
interface MyI4 {
	boolean get(String a, String b);
}

@FunctionalInterface
interface MyI5 {
	void noGet(String a, String b);
}

public class LambdaTest {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		MyI1 i11 = () -> 100;
		// I1 i13 = -> 100; //NG

		MyI2 i21 = (int x) -> 2 * x;
		MyI2 i22 = (x) -> 2 * x;
		MyI2 i23 = x -> 2 * x;

		MyI3 i31 = (int x, int y) -> x + y;
		MyI3 i32 = (x, y) -> x + y;
		// I3 i33 = x, y -> x + y; //NG

		MyI4 i41 = (a, b) -> a.startsWith(b);
		MyI4 i42 = (a, b) -> a.length() > b.length();

		MyI5 i51 = (a, b) -> a.startsWith(b);
		// I5 i52 = (a, b) -> a.length() > b.length(); //NG

	}

	public void noReturn(String x, String y) {
		x.length(); // compiled
		// x.length() + y.length(); //can't compile
		int z = x.length() + y.length(); // compiled
	}

	public int doReturn(String x, String y) {
		x.length(); // compiled
		// x.length() + y.length(); //not compiled
		int z = x.length() + y.length(); // compiled
		return x.length() + y.length(); // compiled
	}

}
