package com.plurasight;

import java.util.function.Predicate;

public class PredicateDemo {

	
	
	public static void main(String[] args) {

		//Without Lamba in jdk 7
		Predicate<String> p = new Predicate<String>() {
			
			@Override
			public boolean test(String t) {
				return t.length()<20;
			}
		};

		
		//With Lambda after jdk 8 and above
		//We cannot write method reference since it is usfin argument 20
		Predicate<String> predicate= s -> s.length()<20;
		
		System.out.println(predicate.test("Hello World  sagar"));
		
		
		
		
	}

}
