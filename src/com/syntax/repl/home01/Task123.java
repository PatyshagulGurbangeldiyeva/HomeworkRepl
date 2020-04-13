package com.syntax.repl.home01;

public class Task123 {
	
	/*For you to do:
	*Create two methods:
	*The first method should be a non-static method that will print out the following message:
	*"Programming is amazing."
	*The second method should be a static method that will print out the following message:
	*"Java is awesome."
	*Execute both methods
	*Expected Output:
	*Programming is amazing.
	*Java is awesome.*/
	
	String amaze() {
		return "Programming is amazing";
		}
	public static String awsome() {
		return "Java is awesome";
	}
	
	public static void main (String [] aregs) {
		
		Task123 obj= new Task123();
		System.out.println(obj.amaze());
		
		String say=obj.awsome();
		System.out.println(say);
	}
	
}
