package com.in28minutes;

import java.util.List;
import java.util.Optional;

public class OptionalDemo {

	public static void main(String[] args) {
//		find a max from list of values. we need to specify comparator
//		with optional it return empty when there is no max values to avoid null
//		we need use get() for not to get OPtional[]
		
		Optional<Integer> max = List.of(23,45,67,12).stream().filter(e -> e%2==0)
		.max( (n1,n2) -> Integer.compare(n1, n2));
		
		System.out.println("max isEmpty : "+max.isEmpty());
		System.out.println("max isPresent : "+max.isPresent());
		System.out.println("max : "+max.get());
		
		
//		No even numbers present then OPtional will return empty not null
//		you can control to return 0 using orElse(0) custom default value
		Integer max2 = List.of(23,45,67,11,44).stream().filter(e -> e%2==0)
				.max( (n1,n2) -> Integer.compare(n1, n2))
				.orElse(0);
		
		System.out.println("max2 : "+max2);
		
		
	}

}
