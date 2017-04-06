package filter.collection;

import defaults.methods.PersonInterface;

public class Person implements PersonInterface{
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString(){
		return this.name + " (" + this.age + ")";
	}
	
	public static int compareAges(Person p1, Person p2){
		Integer age1 = p1.getAge();
		return age1.compareTo(p2.getAge());
	}
	
}
