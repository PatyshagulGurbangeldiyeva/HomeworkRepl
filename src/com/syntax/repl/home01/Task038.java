package com.syntax.repl.home01;

import java.util.Scanner;

public class Task038 {

	public static void main(String[] args) {
		// For you to do:
		//Prompt user with a question: "Is it weekend?"
			//If it is not a weekend --> subject="Manual testing"
			//Otherwise --> subject="Java"

			//Output: 
			//"Today you will be learning ____"
		
		Scanner input=new Scanner (System.in);
		String answer;
		String output;
		
		System.out.println("Is it weekend?");
		answer=input.nextLine();
		
		if (!(answer.equals("Yes"))) {
			output="manual testing";
		}else {
			output="java";
		}
		System.out.println("Today you will be learning "+output);

	}

}
