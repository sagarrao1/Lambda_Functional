package com.in28minutes;

import java.util.List;
import java.util.stream.IntStream;

public class FpNumberRunner2 {

	public static void main(String[] args) {
		
//		Print square of first 10 numbers
		IntStream nStream = IntStream.range(1, 11);
		
//		nStream.map(e ->e*e)
//			   .forEach(e -> System.out.println(e));

		
//		Map all of these to lowerCase and print them
		List<String> names= List.of("Apple","Bat","Cat");
//		names.stream().map(e -> e.toLowerCase())
//					  .forEach(e -> System.out.println(e));
		

//		Print length of each element
		names.stream()
			 .map(e -> e.length())
			 .forEach(e -> System.out.println(e));
//		names.stream().forEach(e -> System.out.println(e+" : "+e.length()));
		
			
	}

}
