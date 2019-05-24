package com.learn.lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

	public static void main(String[] args) {
		customSum();
		customList();
	}

	private static void customPrint() {
		String content = "What's is going on?";
		CustomPrint print = (s) -> System.out.println(s);
		print.printConsole(content);
	}

	private static void customSum() {
		String content = "What's is going on?";
		CustomSum sumInterface = (a, b) -> sum(a, b);
		System.out.println(sumInterface.sum(1, 2));

		MethodReference obj = new MethodReference();
		CustomSum sumInterface2 = obj::sum;
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
		list.forEach(
				// lambda expression
				(names) -> System.out.println(names));
		list.forEach(System.out::println);
	}
}
