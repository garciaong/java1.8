package com.learn.foreach;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		Map<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(1, "Monkey");
		hmap.put(2, "Dog");
		hmap.put(3, "Cat");
		hmap.put(4, "Lion");
		hmap.put(5, "Tiger");
		hmap.put(6, "Bear");
		/**
		 * 1 - Monkey 
		 * 2 - Dog 
		 * 3 - Cat 
		 * 4 - Lion 
		 * 5 - Tiger 
		 * 6 - Bear
		 */
		/*
		 * forEach to iterate and display each key and value pair of HashMap.
		 */
		hmap.forEach((key, value) -> System.out.println(key + " - " + value));
		/** Value associated with key 4 is: Lion */
		/*
		 * forEach to iterate a Map and display the value of a particular key
		 */
		hmap.forEach((key, value) -> {
			if (key == 4) {
				System.out.println("Value associated with key 4 is: " + value);
			}
		});
		/** Key associated with Value Cat is: 3 */
		/*
		 * forEach to iterate a Map and display the key associated with a particular
		 * value
		 */
		hmap.forEach((key, value) -> {
			if ("Cat".equals(value)) {
				System.out.println("Key associated with Value Cat is: " + key);
			}
		});
	}

}
