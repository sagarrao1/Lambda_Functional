package com.in28minutes;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {

	@Override
	public boolean test(Integer t) {
		return t%2==0;
	}
	
}

class PrintConsumer implements Consumer<Integer> {

	@Override
	public void accept(Integer t) {
		System.out.println(t);
	}
	
}

class squareNumberMapper implements Function<Integer, Integer> {

	@Override
	public Integer apply(Integer t) {
		return t*t;
	}
	
}

public class LambdaBehindScreenRunner {
	
	/*
	 * By Lambda expression e -> e%2==0 , we are providing implementation for that
	 * functional interface unimplemented method here boolean test(T t)
	 */

	public static void main(String[] args) {

		List.of(23,45,67,12,36,48)
		.stream()
		.filter(e -> e%2==0)
		.map(n -> n*n)
		.forEach(e -> System.out.println(e));
		
		System.out.println("both are same ");
//		Same above using custom defined implementation classes
		
		List.of(23,45,67,12,36,48)
			.stream()
//			.filter(e -> e%2==0)
			.filter(new EvenNumberPredicate()) // by using custom class which implemented Predicate interface
			.map(new squareNumberMapper())
			.forEach(new PrintConsumer());
		
//		filter uses  functional interface Predicate
//		.filter(new EvenNumberPredicate())
//		Stream<T> filter(Predicate<? super T> predicate);
//		boolean test(T t);
		
//		forEach uses  functional interface Consumer
//		void forEach(Consumer<? super T> action);
//		void accept(T t);
		
//		 map use  functional interface Function 
//		<R> Stream<R> map(Function<? super T, ? extends R> mapper);
//		R apply(T t);
		
		
	}

}
