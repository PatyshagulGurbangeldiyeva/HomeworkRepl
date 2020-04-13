package com.syntax.repl.home01;

public class Task162 {
	/*Call them in main method
	 * Expected Output:
	 * Final method with boolean parameter
	 * Final method with String parameter
	 */
	
	public final void m1(boolean value) {
		System.out.println("Final method with boolean parameter");
	}
	public final void m1(String sta) {
		System.out.println("Final method with string parameter");
	}

	public static void main(String[] args) {
		Task162 obj=new Task162();
		obj.m1(true);
		obj.m1("hello");

		
	}

}
