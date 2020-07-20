package course.c12;

class First {
}
class Second {
	@Override
	public String toString() {
		return "I am Second";
	}
}
public class ToStringTest {
	public static void main(String[] args) {
		System.out.println(new Object());
		System.out.println(new First());
		System.out.println(new Second());
		System.out.println(new Second().toString());
	}
}
