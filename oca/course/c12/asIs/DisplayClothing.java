package course.c12.asIs;

public class DisplayClothing {

	public static void displayShirt(Shirt r) {
		r.display();
	}

	public static void displayTrouser(Trousers t) {
		t.display();
	}

	public static void displaySock(Sock s) {
		s.display();
	}

	public static void main(String[] args) {
		Shirt r = new Shirt('L', 1, "my shirt", 'B', 1000.5);
		displayShirt(r);
		
		Sock s = new Sock(1, "my sock", 'B', 50);
		displaySock(s);
		
		Trousers t = new Trousers('M', 1, "my trouser", 'B', 1200.5);
		displayTrouser(t);
	}
}
