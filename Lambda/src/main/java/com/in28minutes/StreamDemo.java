package com.in28minutes;

import java.util.List;

public class StreamDemo {

	public static void main(String[] args) {
		List<String> list=  List.of("Apple","Bat","Cat","Dog");
		List<Integer> ints = List.of(1,2,3,4,5,6,7,8,9);
		
//		printBasic(list);
//		printFP(list);
		
//		printBasicFiltering(list);
//		printFP_Filtering(list);

		ints.stream()
		    .filter(e -> (e%2==0))
		    .forEach(e -> System.out.println(e));
		
		
//		ints.stream().forEach(e -> System.out.println(e));
		
	}

	private static void printBasic(List<String> list) {
		for (String string : list) {
			System.out.println(string);
		}
	}

//	print using Funtional programming using lambda and streams
	private static void printFP(List<String> list) {
		list.stream()
			.forEach( e ->  System.out.println("element : " + e)
			);
	}
	
	
	private static void printBasicFiltering(List<String> list) {
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
			}
		}
	}

//	print using Funtional programming using lambda and streams
	private static void printFP_Filtering(List<String> list) {
		list.stream()
			.filter(e -> e.endsWith("at"))
			.forEach( e ->  System.out.println("element : " + e)
			);
	}
}
