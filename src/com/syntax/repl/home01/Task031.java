package com.syntax.repl.home01;

import java.util.Scanner;

public class Task031 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Is it sunny outside?");
		
		boolean isSunny=input.nextBoolean();

		if (isSunny) {
			System.out.println("It is sunny day, I should go somewhere!");
			
			System.out.println("What is the temperature outside?");

			int tempt = input.nextInt();

			if (tempt > 85) {
				System.out.println("I am going to the beach");
			} else {
				System.out.println("I am going to the park");
			}
		} else {
			System.out.println("I stay at home and practice my Java");
		}

	}

}
