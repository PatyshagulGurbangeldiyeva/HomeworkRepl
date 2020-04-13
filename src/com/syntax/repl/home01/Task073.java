package com.syntax.repl.home01;

public class Task073 {

	public static void main(String[] args) {
		/*For you to do:
		 * Write a program that creates an array of strings 
		 * with the following values{"This", "is", "array", "of", "strings"} 
		 * and prints all values in one line.
		 * Output: This is array of strings
		 */

 String []word= {"This","is","array","of","strings"};
 for (int i=0;i<word.length;i++) {
	 System.out.print(word[i]+" ");
 }
	}

}
