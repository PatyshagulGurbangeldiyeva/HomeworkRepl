package com.syntax.repl.home01;

public class Task072 {

	public static void main(String[] args) {
		/*
		 * For you to do: Write a program that creates an array with the following
		 * values{s, a, y, b, n, c, t, d, a, e, x} Print the values so the output should
		 * look like below Output:syntax
		 */

		char []letter= {'s','a','y','b','n','c','t','d','a','e','x'};
		for (int i=0;i<11;i++) {
			if (i==0 || i==2 || i==4 || i==6 || i==8 || i==10) {
				System.out.print(letter[i]);
			}
		}
	}

}
