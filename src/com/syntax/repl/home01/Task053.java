package com.syntax.repl.home01;

public class Task053 {
	/*
	 * For you to do: Using do while loop print even numbers from 20 to 1
	 * Expected Output: 20 18 16 14 12 10 8 6 4 2
	 */
	public static void main(String[] args) {
		
		int x=20;
		while (x>=1) {
			if (x%2==0) {
				System.out.println(x);
			}x--;
			
		}

	}

}
