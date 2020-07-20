package course.c14;

public class CheckCanJump implements IChecker {
	public boolean test(Animal a) {
		return a.canJump();
	}
}