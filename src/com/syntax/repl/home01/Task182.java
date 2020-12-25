package com.syntax.repl.home01;

import java.util.ArrayList;
import java.util.Scanner;

public class Task182 {

	public static void main(String[] args) {
		
//		Using Scanner class add 5 elements into ArrayList 
//		and then print all elements from that ArrayList all in 1 line
//
//		Numbers in:
//		4
//		62
//		8
//		5
//		4
//
//		Expected Output:
//		4 62 8 5 4 

		Scanner input=new Scanner (System.in);
		
		// int num=input.nextInt();
		
		ArrayList <Integer> num=new ArrayList<>();
		
		num.add(input.nextInt());
		num.add(input.nextInt());
		num.add(input.nextInt());
		num.add(input.nextInt());
		num.add(input.nextInt());
		
		System.out.println(num);  // when you are printing the collection you will print in []

		// but the question was one by one we don't need []

		// we will use for loop
				
		for (int i=0; i<num.size();i++) {  
			System.out.print(num.get(i)+" "); // getting one by one elements
			System.out.println();
		}
		
	
		
		
		// second way enhanced loop
		
		for (Integer c:num) {
			System.out.print(c+" ");
		}
	}

}
