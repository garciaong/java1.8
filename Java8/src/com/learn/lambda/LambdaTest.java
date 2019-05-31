package com.learn.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		customPrint();
		customSum();
		customList();
	}

	private static void customPrint() {
		String content = "What's is going on?";
		CustomPrint print = (s) -> System.out.println(s);
		// What's is going on?
		print.printConsole(content);
	}

	private static void customSum() {
		CustomSum sumInterface = (a, b) -> sum(a, b);
		// 3
		System.out.println(sumInterface.sum(1, 2));

		MethodReference obj = new MethodReference();
		CustomSum sumInterface2 = obj::sum;
		// 3
		System.out.println(sumInterface2.sum(1, 2));
	}

	private static int sum(int a, int b) {
		return a + b;
	}

	private static void customList() {
		List<String> list = new ArrayList<String>();
		list.add("Rick");
		list.add("Negan");
		list.add("Daryl");
		list.add("Glenn");
		list.add("Carl");
		/**
		 * Rick 
		 * Negan 
		 * Daryl 
		 * Glenn 
		 * Carl
		 */
		list.forEach(
				// lambda expression
				(names) -> System.out.println(names));
		/**
		 * Rick 
		 * Negan 
		 * Daryl 
		 * Glenn 
		 * Carl
		 */
		list.forEach(System.out::println);
	}
}
