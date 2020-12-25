package com.syntax.repl.home01;

public class Task166_1 extends Task166 {
	
	void m1() {
		System.out.println("Child class providing implementation");
	}

	public static void main(String[] args) {
		
		Task166 obj=new Task166_1();
		obj.m1();
		obj.m2();

	}

}
