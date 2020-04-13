package com.syntax.repl.home01;

public class Task095 {

	public static void main(String[] args) {
		/*
		 * For you to do:
		 * 
		 * Create a String given="Hello Syntax friends". Using String methods from given
		 * String create new String "Welcome Syntax family"
		 * 
		 * Expected Output: Welcome Syntax family
		 */
		
		String given="Hello Syntax friends";
		String s1=given.replace("Hello", "Welcome");
		
		
		String s2=s1.replace("friends", "family");
		System.out.println(s2);

	}

}
