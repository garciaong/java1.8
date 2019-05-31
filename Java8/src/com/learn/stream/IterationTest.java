package com.learn.stream;

import java.util.stream.Stream;

public class IterationTest {

	public static void main(String[] args) {
		/**
		 * 3 
		 * 6 
		 * 9 
		 * 12 
		 * 15 
		 * 18
		 */
		Stream.iterate(1, count -> count + 1).filter(number -> number % 3 == 0).limit(6).forEach(System.out::println);
	}

}
