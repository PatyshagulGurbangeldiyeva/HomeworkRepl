package com.syntax.repl.home01;

public class Task126 {
	/* Write a method header on line two with the following specs:
	 * Returns: a String Name: thirdLetter Parameters: a String called s
	 * Then complete the method by programming the following behavior Returns every
	 * 3rd letter of the String s, starting from the first letter. See below
	 * examples.
	 * Examples: thirdLetter("hello there") ==> "hltr" thirdLetter("technology") ==>
	 * "thly"
	 */
	
	String thirdLetter (String s) {
		String eachthird="";
		for (int i=0; i<s.length(); i+=3) {
			eachthird=eachthird+s.charAt(i);
		}
		return eachthird;
	}
	
	public static void main(String [] args) {
		Task126 obj=new Task126();
		System.out.println(obj.thirdLetter("hello there")); 
		
	}

}
