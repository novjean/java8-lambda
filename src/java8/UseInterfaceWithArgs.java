package java8;

import java8.interfaces.InterfaceWithArgs;

public class UseInterfaceWithArgs {

	public static void main(String[] args) {
		
		InterfaceWithArgs obj = (v1, v2) -> {
			int result = v1*v2;
			System.out.println("Result : " + result);
		};
		obj.calculate(10, 5);
	}

}
