package lambda.basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TraversingLambda {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("eee");
		
		Collections.sort(strings);
		System.out.println("Simple sort");
		
		//Traversing with Lambda and foreach
		strings.forEach((str) -> System.out.println(str));
		
		//Traverse with for:each
//		for(String str:strings)
//			System.out.println(str);

		//Iterating with iterator
//		Iterator<String> i = strings.iterator();
//		while(i.hasNext()){
//			System.out.println(i.next());
//		}
	}

}
