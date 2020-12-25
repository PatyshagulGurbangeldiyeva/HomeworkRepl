package com.syntax.repl.home01;

import java.util.Iterator;
import java.util.LinkedList;

public class Task184 {

//	Create Linked List that will store first 10 numbers of fibonacci series
//
//	Print number from Linked List 1 by 1 all in 1 line
//
//	Expected Output:
//	0 1 1 2 3 5 8 13 21 34 
	
	
	public static void main (String [] args) {
		LinkedList <Integer> fib=new LinkedList<>();
		
		Integer a=0;
		Integer b=1;
		Integer c;
		
		
		for (int i=1; i<=10; i++) {
			fib.add(a);
			c=a+b;
			a=b;
			b=c;
		}
		
		Iterator <Integer> it=fib.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" "); 
		}
		
	}
}
