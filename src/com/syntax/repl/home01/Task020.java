package com.syntax.repl.home01;

import java.util.Scanner;

public class Task020 {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please Enter First Name");
		
		String firstName=input.nextLine();
		
		System.out.println("Please Enter Surname");
		
		String surName=input.nextLine();

		System.out.println(firstName+" "+surName);
	}

}
