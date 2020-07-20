package course.c14;

public class Animal {
	private String name;
	private boolean canJump;
	private boolean canSwim;

	public Animal(String name, boolean canJump, boolean canSwim) {
		this.name = name;
		this.canJump = canJump;
		this.canSwim = canSwim;
	}

	public boolean canJump() {
		return canJump;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return name;
	}
}