package com.learn.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndCollectTest {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Melisandre", "Sansa", "Jon", "Daenerys", "Joffery");

		List<String> longnames = names.stream() // converting the list to stream
				.filter(str -> str.length() > 6) // filter the stream to create a new stream
				.collect(Collectors.toList()); // collect the final stream and convert it to a List
		/**	Melisandre
			Daenerys
			Joffery
		*/
		longnames.forEach(System.out::println);
	}

}
