package com.in28minutes;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperatorDemo {

	public static void main(String[] args) {

//		IntStream nums = IntStream.range(1, 11);
		
//		Find sum of first 10 numbers
		int sum = IntStream.range(1, 11).reduce(0, (n1,n2) -> n1+n2);
//		System.out.println("sum :"+sum);
	
		
//		find a max from list of values. we need to specify comparator
//		with optional it return empty when there is no max values to avoid null
//		we need use get() for not to get OPtional[]
		Optional<Integer> maxValue = List.of(11,22,66,23,54).stream()
			.max( (Integer o1, Integer o2) -> Integer.compare(o1, o2)
				 );
		
		System.out.println("maxValue :"+maxValue.isPresent());
		System.out.println("maxValue :"+maxValue.isEmpty());
		System.out.println("maxValue :"+maxValue.get());
		
		
		Optional<Integer> minValue = List.of(11,22,66,23,54).stream()
				.min( (Integer o1, Integer o2) -> Integer.compare(o1, o2)
					 );
			
			System.out.println("minValue :"+minValue.get());
			System.out.println();
			
			
//			print odd numbers
			System.out.println("print odd numbers");
			List.of(11,22,66,23,54).stream()
			 						.filter(e -> e%2==1)
			 						.forEach(e -> System.out.println(e));
			 
			
			List<Integer> list = List.of(11,22,66,23,54);
//			get odd numbers in list
			System.out.println("get odd numbers in list");
			List<Integer> collect = list.stream()
				.filter(e -> e%2==1)
				.collect(Collectors.toList());
						
			System.out.println(collect);
		
//			get first 10 numbers and square it , put it in list
			System.out.println("get first 10 numbers and square it , put it in list");
			List<Integer> collect2 = IntStream.range(1, 11)
					.map(e -> e*e)
					.boxed()
					.collect(Collectors.toList());
						
			System.out.println(collect2);
	}

}
