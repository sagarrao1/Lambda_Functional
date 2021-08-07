package com.lambda.mapNmerge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class RemoveReplaceSortDemo {

	public static void main(String[] args) {
		Person p1=  new Person("Sagar", 40);
		Person p2=  new Person("Ravi", 42);
		Person p3=  new Person("Murali", 34);
		Person p4=  new Person("Sanju", 28);
		Person p5=  new Person("Ganesh", 80);
		Person p6=  new Person("jeff", 15);
		Person p7=  new Person("Padma", 25);
		
		List<Person> people= new ArrayList<>(List.of(p1, p2, p3, p4, p5, p6, p7));
//		System.out.println(people);
		
//		Using Lambda expression
//		people.forEach(person -> System.out.println(person));
		
//		using method reference
//		people.forEach(System.out::println);
		
		
//		Removeif 
//		people.removeIf(person -> person.getAge() <40);
//		people.forEach(person -> System.out.println(person));
		
//		replaceall
		people.replaceAll(per -> new Person(per.getName().toUpperCase(), per.getAge()));
//		people.forEach(person -> System.out.println(person));
	
	
		Comparator<Person> cmp = (Person o1, Person o2) -> Integer.compare(o1.getAge(), o2.getAge());
		
//		sort
//		people.sort(cmp);
//		people.sort(Comparator.comparing((Person p) -> p.getAge()));
//		people.sort(Comparator.comparing(Person::getAge));
		people.sort(Comparator.comparing(Person::getAge).reversed());
		people.forEach(person -> System.out.println(person));
	
	
	}
	
	
	

}
