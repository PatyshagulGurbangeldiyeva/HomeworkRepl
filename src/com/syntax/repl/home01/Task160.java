package com.syntax.repl.home01;

public class Task160 {
	/* Create a class Animal in which define instance variable type, 
	 * constructor that will initialize instance variables and 2 methods eat and sleep.
	 * Create a subclass Cat
	 *  in which override method sleep
	 * Create 3 Kitten subclasses of a 
	 * Cat class and override method eat
	 * for 1 kitten - eats milk
	 * for 2 kitten - eats snack
	 * for 3 kitten - eats everything
	 * In main method create object of Cat class and all 3 kittens classes
	 *  and store into an array of Animals. Call available methods:
	 */

String name;
public Task160(String name){
	this.name=name;
}
void eat () {
	System.out.println(name+" eats");
}
void sleep() {
	System.out.println(name+"can sleep");
}

 





	

}
