package com.syntax.repl.home01;

import java.util.Scanner;

public class Task077 {

	public static void main(String[] args) {
		/*
		 * For you to do: Create an array of integers that will store 5 elements taken
		 * from a user Don't print any prompt message for the user Then print out all
		 * the elements you have created in the first loop in reverse order Example:
		 * Input: 1,2,3,4,5 output:5,4,3,2,1
		 */
		
		Scanner input=new Scanner (System.in);
		
		int []num=new int [5];
		
		System.out.println("Please enter 5 elements :");
	  	
		for (int i=0;i<num.length;i++) {
			num[i]=input.nextInt();
		}
			
			for (int j=num.length-1; j>=0;j--) {
				System.out.println(num[j]);
			}	
			}
	

}