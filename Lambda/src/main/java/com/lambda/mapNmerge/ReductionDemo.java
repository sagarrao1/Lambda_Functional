package com.lambda.mapNmerge;

import java.util.List;
import java.util.function.BinaryOperator;

public class ReductionDemo {

	public static void main(String[] args) {
		List<Integer> ints = List.of(0,1,2,3,4,5,6,7,8,9);

		List<Integer> ints1 = List.of(0,1,2,3,4);
		List<Integer> ints2 = List.of(5,6,7,8,9);
		
		BinaryOperator<Integer> op= (i1, i2) -> i1+i2;
		
	}

}
