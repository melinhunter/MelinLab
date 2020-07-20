package course.c12.accessCtl.test;

import course.c12.accessCtl.demo.Foo;

public class Bar extends Foo {
	private int sum = 10;

	public void reportSum() {
		sum += result; // OK
		sum += other; // NG
	}
}
