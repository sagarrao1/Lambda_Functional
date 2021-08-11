package com.in28minutes;

import java.util.List;

public class MethodReferenceRunner {

	public static void main(String[] args) {
		List.of("Apple","Bat","Cat","Elephant")
			.stream()
			.map(n -> n.length())
			.forEach(e -> System.out.println(e));

		System.out.println();
		System.out.println("Both are same");
		
		List.of("Apple","Bat","Cat","Dog","Elephant")
		.stream()
		.map(String::length)
//		.forEach(System.out::println); 
		.forEach(MethodReferenceRunner::print); // using custom method for method reference
	
		Integer max1 = List.of(23,45,67,11,44).stream()
				.filter(n ->n%2==0)
				.max( (n1,n2) -> Integer.compare(n1, n2))
				.orElse(0);
		System.out.println("max1 :"+max1);
		
		Integer max2 = List.of(23,45,67,11,44).stream()
				.filter(MethodReferenceRunner::customFilter)
//				.max( MethodReferenceRunner::customComparator) // another way as below
				.max( Integer::compare) 
				.orElse(0);
		System.out.println("max2 :"+max2);
	}
	
	public static boolean customFilter(Integer t) {
		return t%2==0;
	}	
	
	public static Integer customComparator(Integer n1, Integer n2) {
		return Integer.compare(n1, n2);
	}
	
	public static void print(Integer t) {
		System.out.println(t);
	}
	
	

}
