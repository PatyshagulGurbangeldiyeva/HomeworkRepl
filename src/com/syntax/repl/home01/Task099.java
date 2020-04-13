package com.syntax.repl.home01;

import java.util.Scanner;

public class Task099 {

	public static void main(String[] args) {
		/*
		 * Inputs: String word;
		 * 
		 * Write a for loop that will loop through every character of a word and print
		 * out each character, each on a separate line
		 * 
		 * Sample inputs/outputs: In: hello
		 *  h 
		 *  e 
		 *  l
		 *  l
		 *  o
		 * 		 
		 */

		Scanner inp = new Scanner(System.in);
		System.out.println("In: ");

		String word = inp.nextLine();

		word = word.replace(" ", "");
		String words = "";

		for (int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);

			System.out.println(letter);

		}

	}

}
