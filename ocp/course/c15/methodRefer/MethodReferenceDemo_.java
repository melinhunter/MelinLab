package course.c15.methodRefer;

import java.util.*;
import java.util.function.Supplier;

import course.c15.Person;

class PersonComparator {
	public int compareName(Person a, Person b) {
		return a.getName().compareTo(b.getName());
	}

	public static int compareEmail(Person a, Person b) {
		return a.getEmail().compareToIgnoreCase(b.getEmail());
	}
}

public class MethodReferenceDemo_ {

	public static void main(String args[]) {
		test1();
		test2();
		test3();
		test4();
	}

	private static void show(Object[] arr) {
		for (Object p : arr) {
			System.out.println(p.toString());
		}
		System.out.println("------------------------------------");
	}

	// Reference to a Static Method
	public static void test1() {
		Person[] people = Person.createArray();
		Arrays.sort(people, Person::compareName);
		// Arrays.sort(people, (a, b) -> Person.compareName(a, b));
		show(people);
		Arrays.sort(people, PersonComparator::compareEmail);
		// Arrays.sort(people, (a, b) -> PersonComparator.compareEmail(a, b));
		show(people);
	}

	// Reference to an Instance Method of a Particular Object
	public static void test2() {
		Person[] people = Person.createArray();
		
		Person p = new Person();
		Arrays.sort(people, p::compareAge);
		// Arrays.sort(people, (a, b) -> p.compareAge(a, b));
		show(people);
		
		PersonComparator pc = new PersonComparator();
		Arrays.sort(people, pc::compareName);
		// Arrays.sort(people, (a, b) -> pc.compareName(a, b));
		show(people);
	}

	// Reference to an Instance Method of an Arbitrary Object of a Particular Type
	public static void test3() {
		Person[] people = Person.createArray();
		
		Arrays.sort(people, Person::compareNameTo);
		// Arrays.sort(people, (a, b) -> a.compareNameTo(b));
		show(people);
		
		Arrays.sort(people, Person::compareAgeTo);
		// Arrays.sort(people, (a, b) -> a.compareAgeTo(b));
		show(people);
		
	}

	// Reference to constructor
	public static void test4() {
		Supplier<MethodReferenceDemo_> supplier = MethodReferenceDemo_::new;
		// Supplier<MethodReferenceDemo_> supplier = () -> new MethodReferenceDemo_();
		System.out.println(supplier.get().getClass());
	}

}
