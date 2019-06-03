package com.learn.methodreference;

import java.util.function.Consumer;

public class Calculator {

	private int result;

	public void add(int a, int b) {
		result = a + b;
	}
	
	public void print(Consumer<String> a) {
		a.accept(String.valueOf(result));
	}


}
