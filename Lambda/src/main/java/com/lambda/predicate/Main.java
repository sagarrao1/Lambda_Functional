package com.lambda.predicate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Predicate<String> p1 = (String s) -> s.length()<20;  
		Predicate<String> p2 = (String s) -> s.length()>5;
		
		Predicate<String> p3 = p1.and(p2);
		Predicate<String> p4 = p1.or(p2);

		boolean b = p1.test("Hello");
		System.out.println("Hello is shorter than 20 chars :" +b);
		
		System.out.println("P3 for Yes : "+ p3.test("Yes"));
		System.out.println("P3 for Good morning : "+ p3.test("Good morning"));
		System.out.println("P3 for Good morning hello world : "+ p3.test("Good morning hello world"));
		
		System.out.println("P4 for Yes : "+ p4.test("Yes"));
		System.out.println("P4 for Good morning : "+ p4.test("Good morning"));
		System.out.println("P4 for Good morning hello world : "+ p4.test("Good morning hello world"));
		
		
		Predicate<String> p5 = Predicate.isEqualTo("Yes");
		
		
		System.out.println("P5 for Yes : "+p5.test("Yes"));
		System.out.println("P5 for No : "+p5.test("No"));
		
		Predicate<Integer> p6 = Predicate.isEqualTo(1);
		
		
		System.out.println("P6 for 1 : "+p6.test(1));
		System.out.println("P6 for 2 : "+p6.test(2));
	}
 
}
