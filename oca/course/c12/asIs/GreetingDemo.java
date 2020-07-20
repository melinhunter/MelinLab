package course.c12.asIs;

class MyGreeting {
	public void sayGoodMorning() {
		System.out.println("Jim, good morning!!");
	}

	public void sayGoodAfternoon() {
		System.out.println("Jim, good afternoon!!");
	}

	public void sayGoodEvening() {
		System.out.println("Jim, good evening!!");
	}
}

public class GreetingDemo {
	public static void main(String[] args) {
		new MyGreeting().sayGoodAfternoon();
	}
}
