package com.stream;

import static java.util.Arrays.stream;

import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamDemo {

	public static void main(String[] args) {
		Stream<String> stream2 = Stream.of("one","two");
//		stream2.forEach(s -> System.out.println(s));
		
//		Stream<String> stream3 = Stream.generate(() -> "one");
//		stream3.forEach(s -> System.out.println(s));
		
//		Stream<String> stream4 = Stream.iterate("+", s -> s + "+");
//		stream4.forEach(s -> System.out.println(s));
		
//		IntStream intStream = ThreadLocalRandom.current().ints();
//		intStream.forEach(s -> System.out.println(s));
		
		IntStream charStream = "hello".chars();
//		System.out.println(charStream..);
		
		Builder<String> builder = Stream.builder();
		
		builder.add("one").add("two").accept("four");;
		Stream<String> build = builder.build();
		build.forEach(s-> System.out.println(s));
		
		
		
		
		
		
	}

}
