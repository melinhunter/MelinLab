package course.c12.toBe;

public class DisplayClothing {

	public static void displayClothing(Clothing c) {
		c.display();
	}

	public static void main(String[] args) {
		Clothing r = new Shirt('L', 1, "my shirt", 'B', 1000.5);
		displayClothing(r);

		Sock s = new Sock(1, "my sock", 'B', 50);
		displayClothing(s);

		Clothing t = new Trousers('M', 1, "my trouser", 'B', 1200.5);
		displayClothing(t);
	}
}
