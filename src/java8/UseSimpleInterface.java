package java8;

import java8.interfaces.SimpleInterface;

public class UseSimpleInterface {

	public static void main(String[] args) {
		
		//Instantiate functional interface
		SimpleInterface obj = () -> System.out.println("Say something");
		obj.doSomething();

	}

}
