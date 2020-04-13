package com.syntax.repl.home01;

import java.util.Scanner;

public class Task092 {

	public static void main(String[] args) {
		/*
		 * Using Scanner class input string value. Print out the following:
		 * "The first 3 letters of ___ is ___"
		 * 
		 * For example, if the input is "banana", your output should be:
		 * "The first 3 letters of banana is ban".
		 */
		
		Scanner scan=new Scanner (System.in);
		
		System.out.print("Please write one word: ");
		String word=scan.nextLine();
		
		String first=word.substring(0,3);
		System.out.println(first);
		
	}

}
