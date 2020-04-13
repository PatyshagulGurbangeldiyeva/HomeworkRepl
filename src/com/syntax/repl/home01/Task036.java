package com.syntax.repl.home01;

import java.util.Scanner;

public class Task036 {
	//For you to do:
	//Prompt user to input two strings : "Please enter two strings"and two integers: "Please enter two numbers"  
		//and make the comparisons:
		//if int1 and int2 are equal and word1 and word2 are equal, output "AND"
		//if int1 and int2 are equal or word1 and word2 are equal, output "OR"
		//if int1 and int2 are not equal and word1 and word2 are not equal, output "NONE"
public static void main (String[]args) {
	
	Scanner input=new Scanner (System.in);
	String output=null;
	
	System.out.println("Please enter two strings");
	String word1=input.nextLine();
	String word2=input.nextLine();
	
	System.out.println("Please enter two number");
	
	int n1=input.nextInt();
	int n2=input.nextInt();
	
	if (n1==n2 && word1.equals(word2)) {
		output="AND";
	}else if (n1==n2 || word1.equals(word2)) {
	output="OR";
	}else {
	output="NONE";
	}
	System.out.println(output);
}
}
