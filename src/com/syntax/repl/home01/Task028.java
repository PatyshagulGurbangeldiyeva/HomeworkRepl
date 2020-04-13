package com.syntax.repl.home01;

import java.util.Scanner;

public class Task028 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		
		System.out.println("Please enter the length");
		
		int length=input.nextInt();
		
		System.out.println("Please enter the width");
		
		int width=input.nextInt();
		
		if (length>width) {
			System.out.println("The shape of your object is rectangle");
		}else if (length==width) {
			System.out.println("The shape of your object is square");
		}
			
		

	}

}
