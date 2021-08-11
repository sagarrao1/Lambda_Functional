package com.in28minutes;

import java.util.List;

/*filtering is intermediate operation. it takes stream of objects or stream of stream
or stream of integers and return stream
forEach is terminal operation. it takes values does some action or process or consumes
takes stream as input and return one result a back , sum , max, min
we can have multiple intermediate operations but one terminal operation like return result as sum or list

 Before FP, we used to do imperative style of programming like take sum var and loop
 through numbers and calculate sum
 in this we are telling what to do and how to do
 in FP , we call it as declarative programming, we tell what to do not how to do
 which does not use mutation, we are keep on updating sum variable
 fp will be faster than old way
*/
public class FPNumberRunner {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(4,6,35,22,14,17);
		
//		numbers.stream().forEach(e -> System.out.println(e) );
//		numbers.stream().forEach(System.out::println); // using method reference
		
//		finding sum of numbers
		Integer sum = FpSum(numbers);		
		System.out.println("Sum using FP: "+sum);
		
		Integer sumN = normalSum(numbers);		
		System.out.println("Sum using normal program: "+sumN);
		
		
//		Sum of odd numbers
		Integer sum1 = numbers.stream().filter(n -> n%2==1)
					.reduce(0, (n1,n2)-> n1+n2);
//		System.out.println("Sum of odd numbers : "+sum1);
		
		
		List<Integer> nums = List.of(4,6,35,22,5,14,17,5);
		
		//sort and print
//		nums.stream().sorted().forEach(e -> System.out.println(e));
		
		//distinct values print
//		nums.stream().distinct().forEach(e -> System.out.println(e));
//		nums.stream().distinct().sorted().forEach(e -> System.out.println(e));
		
		// do a square of distinct values
		nums.stream().distinct()
					.sorted()
					.map(e -> e*e)
					.forEach(e -> System.out.println(e));
		
	}

	private static Integer FpSum(List<Integer> numbers) {
		return numbers.stream().reduce(0, (n1,n2)-> {
//			System.out.println("number 1: "+n1 + " number2: "+n2 );
			return n1+n2; 
			});
	}

	private static Integer normalSum(List<Integer> numbers) {
		int sum=0;
		for (Integer number : numbers) {
			sum += number;  // mutation
		}
		return sum;
		
	}
}
