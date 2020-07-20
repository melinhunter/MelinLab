package course.c12;

class Vehicle {
	int x;

	Vehicle() {
		this(10);
	}

	Vehicle(int x) {
		this.x = x;
	}
}

class Car extends Vehicle {
	int y;

	Car() {
		super();
		this(20); // compile error
	}

	Car(int y) {
		this.y = y;
	}
}

public class TestConstructors3 {
}
