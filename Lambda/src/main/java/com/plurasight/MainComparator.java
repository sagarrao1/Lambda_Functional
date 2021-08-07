package com.plurasight;

import java.util.Comparator;
import java.util.function.Function;

public class MainComparator {

	public static void main(String[] args) {

		Comparator<Person> cmpAge = (p1, p2) -> p1.getAge() - p2.getAge();
		Comparator<Person> cmpFistName = (Person s1, Person s2) -> s1.getFirstName().compareTo(s2.getFirstName());
		Comparator<Person> cmpLastName = (s1, s2) -> s1.getLastName().compareTo(s2.getLastName());		
		
		
		Function<Person, Integer> f1 = p -> p.getAge();
		Function<Person, String> f2 = p -> p.getFirstName();
		Function<Person, String> f3 = p -> p.getLastName();
		
//		Comparator<Person> cmpPersonAge= Comparator.comparing( (Person p) -> p.getAge());
		Comparator<Person> cmpPersonAge= Comparator.comparing( Person::getAge);
		Comparator<Person> cmpPersonFirstName= Comparator.comparing(Person::getFirstName);
		
		
//		it compares age first then if age is same it compares to First name 
		Comparator<Person> cmp = cmpPersonAge.thenComparing(cmpPersonFirstName);
	}

}

