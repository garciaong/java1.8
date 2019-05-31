package com.learn.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndMapTest {

	public static void main(String[] args) {

		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
		List<Integer> squares = num.stream().map(n -> n * n).collect(Collectors.toList());
		//[1, 4, 9, 16, 25, 36]
		System.out.println(squares);
		
	}

}
