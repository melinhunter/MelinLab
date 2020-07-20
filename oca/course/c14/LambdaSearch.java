package course.c14;

import java.util.*;

public class LambdaSearch {
	public static void main(String[] args) {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal("fish", false, true));
		animals.add(new Animal("monkey", true, false));
		animals.add(new Animal("rabbit", true, false));
		animals.add(new Animal("human", true, true));

		check(animals, a -> a.canJump());
	}

	private static void check(List<Animal> animals, IChecker checker) {
		for (Animal animal : animals) {
			if (checker.test(animal))
				System.out.println(animal);
		}
	}
}