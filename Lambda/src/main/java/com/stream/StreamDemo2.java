package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.lambda.mapNmerge.Person;

public class StreamDemo2 {
	
	public static void main(String[] args) {
		Person p1=  new Person("Sagar", 40);
		Person p2=  new Person("Ravi", 42);
		Person p3=  new Person("Murali", 34);
		Person p4=  new Person("Sanju", 28);
		Person p5=  new Person("Ganesh", 80);
		Person p6=  new Person("jeff", 15);
		Person p7=  new Person("Padma", 25);

		List<Person> people = new ArrayList<>(List.of(p1,p2,p3,p4,p5,p6,p7));
	
//		map filter print
		people.stream()
			  .map(p -> p.getAge())
//			  .peek(s -> System.out.println("-----------------------"))
//			  .peek(System.out::println)
			  .filter(p -> p>30)
			  .forEach(System.out::println);
	
	System.out.println("======================");

//	map filter print
	people.stream()
		  .filter(p -> p.getAge()>30)
		  .forEach(System.out::println);

System.out.println("======================");
	
//	skip and limit
	people.stream()
		  .skip(2)
		  .limit(3)
		  .forEach(System.out::println);
	
	System.out.println();
	System.out.println("===============Matchers ================");
	
//	anyMatch allmatch nonMatch
	boolean anyMatch = people.stream()		
							 .anyMatch(p -> p.getAge() >30);
	
	System.out.println(anyMatch);
	
	boolean allMatch = people.stream()		
			 .allMatch(p -> p.getAge() >30);

	System.out.println(allMatch);
	
	System.out.println();
	System.out.println("=======================");
	
	//find first and findAny
	Optional<Person> opt = people.stream()		
								 .findFirst();
	System.out.println(opt);
	}

	
	
}
