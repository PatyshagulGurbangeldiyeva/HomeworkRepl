package com.syntax.repl.home01;

public class Task067 {

	public static void main(String[] args) {
		/*
		 * For you to do: Write a program to print out the pattern:
		 * 1 2 3 4 5 6 7 8 9 10 
		 * 2 4 6 8 10 12 14 16 18 20 
		 * 3 6 9 12 15 18 21 24 27 30 
		 * 4 8 12 16 20 24 28 32 36 40 
		 * 5 10 15 20 25 30 35 40 45 50
		 */
		
		
		
		
		for(int i=1;i<6;i++) {
			for (int j=1;j<11;j++) {
				System.out.print((i*j)+" ");
			}System.out.println();
		}
	}

}
