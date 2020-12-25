package com.syntax.repl.home01;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Task188 {

	public static void main(String[] args) {
		
//		Create a method that will remove an element based on the specified condition
//		from given List and return new List;
//
//		 Expected Output:  
//		[USA, Kazakhstan, Pakistan, Russia]

		
		List<String> countries = new LinkedList<>();
		countries.add("Armenia");
		countries.add("USA");
		countries.add("Kazakhstan");
		countries.add("Australia");
		countries.add("Pakistan");
		countries.add("Russia");
		countries.add("Azerbaijan");
		
		Iterator <String> remove=countries.iterator();
		
		while(remove.hasNext()) {
			if ( remove.next().startsWith("A")) {
				remove.remove();
			}
		}
		System.out.println(countries);
	}

}
