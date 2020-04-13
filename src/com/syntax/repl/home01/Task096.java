package com.syntax.repl.home01;

import java.util.Scanner;

public class Task096 {

	public static void main(String[] args) {
		/*
		 * Given the following inputs: String s;
		 * 
		 * Write a for loop that will print out the reverse of the string.
		 * 
		 * Sample input/outputs: In: manhattan-----> nattahnam
		 */
		
		 Scanner inp = new Scanner(System.in);
		    System.out.print("In:");
		    String s = inp.nextLine();
		    //write your code below
		    
		    String reverse="";
		    
		    for (int i=s.length()-1; i>=0; i--) {
		    	reverse=reverse+s.charAt(i);
		    }
System.out.println(reverse);
	}

}
