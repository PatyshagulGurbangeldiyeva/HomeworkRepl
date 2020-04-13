package com.syntax.repl.home01;

import java.util.Scanner;

public class Task021 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("How old are you?");
				
		int age=input.nextInt();
		
		System.out.println("Enter your age "+30);
		
		int after=age+10;
		
		System.out.println("Your age after 10 years is "+after);

	}

}
