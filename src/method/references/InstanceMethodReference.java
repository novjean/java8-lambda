package method.references;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import filter.collection.Person;

public class InstanceMethodReference {

	public static void main(String[] args) {
		
		InstanceMethodReference mainClass = new InstanceMethodReference();
		mainClass.sortData();
	}
	
	public void sortData(){
		List<Person> people = new ArrayList<>();
		
		people.add(new Person("Joe", 48));
		people.add(new Person("Mary", 30));
		people.add(new Person("Mike", 73));
		
		Collections.sort(people, this :: compareAges);		//since dealing with the instance of the class already
		people.forEach(p -> System.out.println(p));
	}
	
	public int compareAges(Person p1, Person p2){
		Integer age1 = p1.getAge();
		return age1.compareTo(p2.getAge());
	}

}
