package com.syntax.repl.home01;

public class Task057 {
	/*
	 * For you to do: Create a for loop that prints out odd numbers from 5 to 22
	 * Must not include the number 22 in the output
	 * Expected Output: 5 7 9 11 13 15 17 19 21
	 */
	public static void main(String[] args) {
	
		for (int a=5; a<22;a++) {
			if (a%2!=0) {
				System.out.println(a);
			}
		}

	}

}
