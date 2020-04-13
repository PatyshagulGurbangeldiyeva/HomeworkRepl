package com.syntax.repl.home01;

public class Task157 {
	/*In Parent Class create a method with name method() that will print  "Parent method"
	 * Override method() in Child class that will print "Child method"
	 * In Main Class create objects of child and parent class and call its method. 
	 * Expected Output:
	 * Parent method
	 * Child method
	 */
	
 void method() {
	System.out.println("Parent class");
}
}
class Child extends Task157{
	
	void method () {
		
		System.out.println("Child class");
	}
	
}



