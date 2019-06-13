package com.learn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionTest {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("^I");
		Matcher m = p.matcher("I don't care...");
		System.out.println(m.replaceAll("You"));
		//You don't care...
		p = Pattern.compile("me$");
		m = p.matcher("Give it to me");
		System.out.println(m.replaceAll("you"));
		//Give it to you
		p = Pattern.compile("will");
		m = p.matcher("I will give it to you");
		System.out.println(m.replaceAll("will not"));
		//I will not give it to you
		//matches a string that has ab followed by zero or more c
		p = Pattern.compile("abc*");
		m = p.matcher("abccc");
		System.out.println(m.replaceAll("d"));
		//d
		m = p.matcher("ab");
		System.out.println(m.replaceAll("d"));
		//d
		System.out.println(Pattern.matches("[a-z]", "v"));//true
		System.out.println(Pattern.matches("[a-z]", "abc123"));//false
		System.out.println(Pattern.matches("[a-z]", "abc"));//false
		System.out.println(Pattern.matches("[a-zA-Z]*", "AabcA"));//true
		System.out.println(Pattern.matches("[a-z][A-Z]*", "abcA"));//false
		System.out.println(Pattern.matches("[a-z]*[A-Z]*", "abcA"));//true
		System.out.println(Pattern.matches("[a-z][A-Z]*", "AabcA"));//false
		System.out.println(Pattern.matches("[a-z]*[A-Z]*", "abcA"));//true
		System.out.println(Pattern.matches("[^a-z]*[^A-Z]*", "abcA"));//false
		System.out.println(Pattern.matches("[^a-z]*[^A-Z]*", "123"));//true
		System.out.println(Pattern.matches("[^0-9]*", "abcDEF"));//true
		System.out.println(Pattern.matches("[(^0-9)a-z]*", "abcDEF"));//false
		System.out.println(Pattern.matches("[^0-9]*[a-z]*", "abcDEF"));//true
		System.out.println(Pattern.matches("[(^0-9)a-z]*", "abcdef"));//true
		System.out.println(Pattern.matches("a[a-z]{1,2}", "abcdef"));//false, after 'a' has at least 1 and max 2 'a to z'
		System.out.println(Pattern.matches("a[a-z]{1,5}", "abcdef"));//true
		System.out.println(Pattern.matches("a[a-z]{6,8}", "abcdef"));//false
		//With prefix AC followed by 5 digits and ends by 3 alphabets
		System.out.println(Pattern.matches("AC[0-9]{5}[A-Z]{3}", "AC1234GIG"));//false
		System.out.println(Pattern.matches("AC[0-9]{5}[A-Z]{3}", "AC123456GIG"));//false
		System.out.println(Pattern.matches("AC[0-9]{5}[A-Z]{3}", "AC12345GI"));//false
		System.out.println(Pattern.matches("AC[0-9]{5}[A-Z]{3}", "AC12345GIGF"));//false
		System.out.println(Pattern.matches("AC[0-9]{5}[A-Z]{3}", "AC12345GIG"));//true
		System.out.println(Pattern.matches("\\d*", "1234"));//true
		System.out.println(Pattern.matches("\\w*", "abvFsEW_eRR"));//true, matches a word character (alphanumeric character plus underscore)
		System.out.println(Pattern.matches("[\\w\\s]*", "ali baba one_two"));//true, matches a word character (alphanumeric character plus underscore) & matches a whitespace character (includes tabs and line breaks)
		System.out.println(Pattern.matches(".*", "a &*4$=S_"));//true, matches any character
		System.out.println(Pattern.matches("Mon(day)?", "Monday"));//true, matches Mon and day is optional
	}

}
