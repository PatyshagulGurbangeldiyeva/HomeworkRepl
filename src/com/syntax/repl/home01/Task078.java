package com.syntax.repl.home01;

import java.util.Scanner;

public class Task078 {

	public static void main(String[] args) {
		/*
		 * Create an int array of integers with a size of 5 and input values with
		 * Scanner. Don't print prompt questions for a user. Using loop print out each
		 * element of the array that should look like the output below Example: Input: 1
		 * 2 3 4 5 output: 10 20 30 40 50
		 */
		Scanner input = new Scanner(System.in);
		
		int[] num = new int[5];
		

			
		
		for (int n:num) {
			num[n] = input.nextInt();
			System.out.println(num[n]*10);
		}
		System.out.println();
	}

}
