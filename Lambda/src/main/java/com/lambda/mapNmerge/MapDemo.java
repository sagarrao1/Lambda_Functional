package com.lambda.mapNmerge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		Person p1=  new Person("Sagar", 40);
		Person p2=  new Person("Ravi", 42);
		Person p3=  new Person("Murali", 34);
		Person p4=  new Person("Sanju", 28);
		Person p5=  new Person("Ganesh", 80);
		Person p6=  new Person("jeff", 15);
		Person p7=  new Person("Padma", 25);

		List<Person> people = new ArrayList<>(List.of(p1,p2,p3));
		
		City boston =  new City("boston");
		City karimnagar =  new City("karimnagar");
		City medchal =  new City("medchal");
		
		Map<City , List<Person>> map = new HashMap<>();
		
//		3 ways we add elements to map
//		map.put(boston, people);  // till jdk7
		
		
		map.putIfAbsent(boston, new ArrayList<>()); //from jdk 8 onwards
		map.get(boston).add(p1);  //from jdk 8 onwards
		
//		using lambda expression
		map.computeIfAbsent(medchal, city -> new ArrayList<>());
		map.computeIfAbsent(medchal, city -> new ArrayList<>()).add(p6);
		
			
		
		System.out.println("people from paris : "+ map.getOrDefault(boston, Collections.EMPTY_LIST)  );
		System.out.println("people from medchal : "+ map.getOrDefault(medchal, Collections.EMPTY_LIST)  );
		System.out.println("people from karimnagar : "+ map.getOrDefault(karimnagar, Collections.EMPTY_LIST)  );
		
		
		
	}
	

}
