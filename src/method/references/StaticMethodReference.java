package method.references;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import filter.collection.Person;

public class StaticMethodReference {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));

		//Static method reference
		Collections.sort(people, Person :: compareAges);
		people.forEach(p -> System.out.println(p));
	}

}
