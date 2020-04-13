package com.syntax.repl.home01;

import java.util.Scanner;

public class Task034 {

	public static void main(String[] args) {
		// Write a program to find the largest number among three distinct numbers using
		// nested if condition
		// Please use Scanner class to take input from users

		// Expected Output:
		// Please enter 3 distinct numbers
		// The largest number is 14

		Scanner input = new Scanner(System.in);
		double n1, n2, n3;
		

		System.out.println("Please enter three distinct numbers:");
		n1 = input.nextDouble();
		n2 = input.nextDouble();
		n3 = input.nextDouble();

		double largest; 
		if (n1 > n2) {
			if (n1 > n3) {
				largest = n1;
			} else {
				largest=n3;
			}
			
			
		}else {
			if (n2>n3) {
				largest=n2;
			}else {
				largest=n3;
			}
			
			
			
		}
		System.out.println("The largets number is " + largest);// if the output in if so we will not initialize
		
	}
}
