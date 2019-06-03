package com.learn.foreach;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ObjectInListTest {

	public static void main(String [] args) {
		Player aubameyang = new Player("Aubameyang","Striker",29);
		Player lacazette = new Player("Lacazette","Striker",27);
		Player leno = new Player("Leno","Keeper",25);
		
		List<Player> players = new ArrayList<Player>();
		players.add(aubameyang);
		players.add(lacazette);
		players.add(leno);
		
		players.stream().filter(player -> player.getAge()<26).map(player -> player.getName()).forEach(System.out::println);
		double averageAge = players.stream().mapToDouble(player -> player.getAge()).average().orElse(0.0);
		System.out.println(averageAge);
		System.out.println(players.stream().max(Comparator.comparing(Player::getAge)).get().getName());
		System.out.println(players.stream().min(Comparator.comparing(Player::getAge)).get().getName());
	}
	
}
