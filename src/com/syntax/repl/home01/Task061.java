package com.syntax.repl.home01;

public class Task061 {
	/*
	 * For you to do: Write a program that uses for loop to prints multiplication of
	 * number 3 from 1 to 10
	 * Expected Output: 3*1=3 3*2=6 3*3=9 3*4=12 3*5=15 3*6=18 3*7=21 3*8=24 3*9=27
	 * 3*10=30
	 */
	public static void main(String[] args) {
		int x=3;
		for (int a=1; a<=10;a++) {
			System.out.println(x+"*"+a+"="+x*a);
		}

	}

}