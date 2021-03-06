package defaults.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import filter.collection.Person;

public class UseStaticMethod {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Predicate<Person> predOlder = (p) -> p.getAge()>=65;
		Predicate<Person> predYounger = (p) -> p.getAge()<=40;
		
		displayPeople(people, predYounger);

	}
	private static void displayPeople(List<Person> people, Predicate<Person> pred) {
		people.forEach((person) ->{
			if(pred.test(person)){
				String info = PersonInterface.getPersonInfo2(person);
				System.out.println(info);
			}
				
		});
	}
}
