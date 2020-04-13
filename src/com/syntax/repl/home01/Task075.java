package com.syntax.repl.home01;

public class Task075 {

	public static void main(String[] args) {
		/*
		 * For you to do: Using the following array. {45, 78, 12, 67, 55, 89, 23, 77,88}
		 * Create a for loop to extract values from that array so your output looks as
		 * below: Expected Output:78 13 11
		 *  Note: Find out what is the start point an how
		 * much you need to increment to get the result.
		 */

		int[] num = { 45, 78, 12, 67, 55, 89, 23, 77, 88 };
		for (int i = 0; i <3; i++) {
		if (i==1) {
			System.out.print(num[1]+" ");
		}else if (i==2) {
			System.out.print(num[2]+1+" ");
			System.out.print(num[2]-1+ " ");
		}
		}
	}

}
