package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UseComparator {

	public static void main(String[] args) {
		
		List<String> strings = new ArrayList<String>();
		strings.add("AAA");
		strings.add("bbb");
		strings.add("CCC");
		strings.add("ddd");
		strings.add("eee");
		
		//Simple case-sensitive sort operation
		Collections.sort(strings);
		System.out.println("Simple sort");
		for(String str: strings)
			System.out.println(str);
		
		//Case-insensitive sort with an anonymous class
		Collections.sort(strings, new Comparator<String>() {		//Generic specifies what type of comparison

			@Override
			public int compare(String str1, String str2) {
				return str1.compareToIgnoreCase(str2);
			}
		});
		System.out.println("Sort with comparator");
		for(String str:strings){
			System.out.println(str);
		}
		
		//Using Lambda
		Comparator<String> comp = (str1, str2) -> {
			return str1.compareToIgnoreCase(str2);
		};
		Collections.sort(strings, comp);
		System.out.println("Sort with comparator in lambda");
		for(String str:strings){
			System.out.println(str);
		}

	}

}
