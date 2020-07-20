package course.c12.toBe;

public class CastingDemo {

	public static void main(String[] args) {

		Clothing c = new Trousers('M', 1, "my trouser", 'B', 1200.5);

		// c.getGender(); // will compile error!!

		Trousers t = (Trousers) c;
		// casting from Clothing to Trousers

		t.getGender(); // OK

	}

}
