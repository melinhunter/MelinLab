package course.c12.toBe;

public abstract class AbstractGreeting {

	abstract String getName();

	public void sayGoodMorning() {
		System.out.println(getName() + ", good morning!!");
	}

	public void sayGoodAfternoon() {
		System.out.println(getName() + ", good afternoon!!");
	}

	public void sayGoodEvening() {
		System.out.println(getName() + ", good evening!!");
	}

}
