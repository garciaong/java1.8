package com.learn.methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceTest {

	public static void main(String [] args) {
		String[] sa = {"I hate","I love","I don't know who is"};
		List<String> ls = Arrays.asList(sa);
		ls.stream().forEach(IronMan::check);
		
		Calculator cal = new Calculator();
		cal.add(1, 2);
		cal.print(Printer::print);
	}
	
}
