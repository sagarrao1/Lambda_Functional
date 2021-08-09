package com.in28minutes;

import java.util.List;
import java.util.Optional;
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
		
	}

}
