package com.plurasight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Executors;

class ComparatorI implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return Integer.compare(o1.length(), o2.length());
	}
}

public class ComparatorDemo {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>(List.of("Apple", "Banana", "Cat"));
//		list.sort(new ComparatorI());
//		System.out.println(list);

		String[] myArray= {"Apple","Banana","Cat"};				
		Arrays.sort(myArray, new ComparatorI());
		
//	for (String string : myArray) {
//		System.out.println(string);
//	}
	
	Runnable r = new Runnable() {		
		@Override
		public void run() {
			int i=0;
			while (i++ <10) {
				System.out.println("Runnable interface... " +i);
			}
			
		}
	};
	
	
	Executors.newSingleThreadExecutor().execute(r);
	
	}
}
