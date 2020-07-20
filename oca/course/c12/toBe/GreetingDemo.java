package course.c12.toBe;

class MyGreeting extends AbstractGreeting {
	@Override
	String getName() {
		return "Jim";
	}
}

public class GreetingDemo {
	public static void main(String[] args) {
		new MyGreeting().sayGoodAfternoon();
	}
}
