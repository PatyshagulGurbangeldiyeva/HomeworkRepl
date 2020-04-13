package com.syntax.repl.home01;

public class Task100 {
	
	/*
	 * Create a class 'Main' (please do not make it public as Repl will give you an
	 * error) Inside class String variable 'name' and integer variable 'roll_no'.
	 * 
	 * Creating an object of the class and assign the value of 2 to roll_no and
	 * value of "John" to name
	 * 
	 * Your program should print the following: Name is John and roll number is 2
	 */

	
	String name;
	int roll_no;
	
	
	
	
	public static void main(String[] args) {
		
		Task100 create=new Task100 ();
		create.roll_no=2;
		create.name="John";
		
		System.out.println("Name is "+create.name+" and roll number is "+create.roll_no);

	}

}
