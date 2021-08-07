package com.lambda.mapNmerge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		Person p1 = new Person("Sagar", 40);
		Person p2 = new Person("Ravi", 42);
		Person p3 = new Person("Murali", 34);
		Person p4 = new Person("Sanju", 28);
		Person p5 = new Person("Ganesh", 80);
		Person p6 = new Person("jeff", 15);
		Person p7 = new Person("Padma", 25);

		List<Person> people = new ArrayList<>(List.of(p1, p2, p3));

		City boston = new City("boston");
		City karimnagar = new City("karimnagar");
		City medchal = new City("medchal");

		Map<City, List<Person>> map1 = new HashMap<>();

//		adding elements using lambda expression
		map1.computeIfAbsent(medchal, city -> new ArrayList<>()).add(p6);
		map1.computeIfAbsent(medchal, city -> new ArrayList<>()).add(p7);
		map1.computeIfAbsent(boston, city -> new ArrayList<>()).add(p1);

		System.out.println("Map 1");
		map1.forEach((cty, persons) -> System.out.println(cty + " : " + persons));

		Map<City, List<Person>> map2 = new HashMap<>();

//		adding elements using lambda expression
		map2.computeIfAbsent(karimnagar, city -> new ArrayList<>()).add(p2);
		map2.computeIfAbsent(medchal, city -> new ArrayList<>()).add(p3);
		map2.computeIfAbsent(boston, city -> new ArrayList<>()).add(p4);

		System.out.println("Map 2");
		map2.forEach((cty, persons) -> System.out.println(cty + " : " + persons));

		map2.forEach((cty, persons) -> {
			map1.merge(
					cty, persons, 
					(peopleFromMap1, peopleFromMap2) -> {
							peopleFromMap1.addAll(peopleFromMap2);
							return peopleFromMap1;
					});
			}
		);
		
		
		System.out.println("Map 1 after merging Map2");
		map1.forEach((cty,prs) -> System.out.println(cty+" : "+prs));
		
//		System.out.println("people from paris : "+ map1.getOrDefault(boston, Collections.EMPTY_LIST)  );
//		System.out.println("people from medchal : "+ map1.getOrDefault(medchal, Collections.EMPTY_LIST)  );
//		System.out.println("people from karimnagar : "+ map1.getOrDefault(karimnagar, Collections.EMPTY_LIST)  );

	}

}
