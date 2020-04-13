package com.syntax.repl.home01;

/*
 * Given the following inputs:
 *int x;

  * Write a for loop that will print out a series of numbers starting at 0 
  * and ending at the x(value must be taken from a user), exclusive.
  * Example Output:
  * In: 3
  * 0 1 2
  */
import java.util.Scanner;

public class Task063 {

	public static void main(String[] args) {
		Scanner inp;
		int x;
		System.out.print("In:");
		// write code under on step 10

		// First way:
		
		inp = new Scanner(System.in);
		x = inp.nextInt();
		int a = 0;
		while (a < x) {
			System.out.print(a + " ");
			a++;
		}

		// Second way
		
		// for(a=o;a<x;a++){
		// System.out.print(a+" ");
		// }
	}

}
