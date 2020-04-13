package com.syntax.repl.home01;

public class Task117 {
	/*
	 * For you to do: declare 3 instance variables to hold an integer, double and char values.
	 * Create 2 instances of the class and assign values to variables and the print
	 * them
	 * Expected Output: 
	 * 10 /10.23/ a 
	 * 100/100.23/ s */
	
	int a;
	double b;
	char c;
	
	void printAll() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
	public static void main (String []args) {
		Task117 obj1=new Task117();
		Task117 obj2=new Task117();
		
		obj1.a=10;
		obj1.b=10.23;
		obj1.c='a';
		obj1.printAll();
		
		obj2.a=100;
		obj2.b=100.23;
		obj2.c='s';
		obj2.printAll();
		
	}
	
	
	

}
