package defaults.methods;

import filter.collection.Person;

public interface PersonInterface {

	String getName();
	void setName(String name);
	int getAge();
	void setAge(int age);
	
	default String getPersonInfo(){
		return getName() + "(" + getAge() + ")";
	}
	
	static String getPersonInfo2(Person p){
		return p.getName() + "(" + p.getAge() + ")";
	}
}
