package course.c12.toBe2;

public class ReturnClothing {

	public static void dealReturn(Returnable r) {
		r.doReturn();
	}

	public static void main(String[] args) {
		Returnable r = new Shirt('L', 1, "my shirt", 'B', 1000.5);
		dealReturn(r);

		Trousers t = new Trousers('M', 1, "my trouser", 'B', 1200.5);
		dealReturn(t);

	}

}
