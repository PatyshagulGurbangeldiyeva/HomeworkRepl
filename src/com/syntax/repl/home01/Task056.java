package com.syntax.repl.home01;

/*For you to do: 
* Create a for loop that prints out even numbers from 2 to 14 using if condition
 *Must include the number 14 in the output 
* Output:  
 *2
 *4
 *6
 *8
 *10
 *12
 *14
  */
public class Task056 {
	public static void main(String[] args) {
 for (int a=2; a<=14;a++) {
	 if (a%2==0) {
		 System.out.println(a);
	 }
 }
	}

}
