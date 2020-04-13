package com.syntax.repl.home01;

public class Task062 {
	/*
	 * For you to do: Using for loop Print 1 to 10 Numbers except 5 and 6
	 * Expected Output: 1 2 3 4 7 8 9 10
	 */
	public static void main(String[] args) {
		
		for (int x=1;x<=10;x++) {
			if (x!=5 && x!=6) {
				System.out.println(x);
			}
		}

	}

}
