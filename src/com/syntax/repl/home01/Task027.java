package com.syntax.repl.home01;

import java.util.Scanner;

public class Task027 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner (System.in);
		
		System.out.print("Please enter your age ");
		int age=in.nextInt();
		
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("You are not eligible to vote");
		}
		

	}

}
