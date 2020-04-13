package com.syntax.repl.home01;

public class Task055 {
	/*
	 * For you to do: Create a for loop that prints out even numbers from 10 to 0
	 * Must not include the number 0 in the output
	 * Output: 10 8 6 4 2
	 */
	public static void main(String[] args) {
		
		for (int a=10; a>0;a--) {
			if (a%2==0) {
				System.out.println(a);
			}
		}

	}

}
