package course.c15.tobe;

public abstract class ClassWithShow {
	public abstract String getName();
	public void show() {
		System.out.println(this.getName() + "\t" + "----------------------");
	}
}
