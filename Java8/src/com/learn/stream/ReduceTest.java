package com.learn.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.learn.foreach.Player;

public class ReduceTest {

	public static void main(String[] args) {
		Player aubameyang = new Player("Aubameyang", "Striker", 29);
		Player lacazette = new Player("Lacazette", "Striker", 27);
		Player leno = new Player("Leno", "Keeper", 25);

		List<Player> players = new ArrayList<Player>();
		players.add(aubameyang);
		players.add(lacazette);
		players.add(leno);

		Player player = players.stream().reduce(new Player(null, null, 0), (result,player1) -> {if("Lacazette".equals(player1.getName()))result=player1;return result;});
		System.out.println(player.getName());
		/**
		 * 0 
		 * 1 
		 * 3 
		 * 6 
		 * 10 
		 * 15
		 */
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int result = numbers.stream().reduce(0, (a, b) -> {
			System.out.println(a);
			return a + b;
		});
		System.out.println(result);
	}

}
