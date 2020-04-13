package com.syntax.repl.home01;

public class Task163 {
	
	/*Create an instance final method that will reverse a String and return that new String
	 * Call method from the main method
	 * Expected Output:olleh 
	 */
	
	 final String reverse(String str){
		 String  reverse=" ";
	    for (int i=str.length()-1; i>=0;i--){
	     
	      reverse=reverse+str.charAt(i);
	      
	    }
	    return reverse;
	  }


	public static void main(String[] args) {
		 Task163 obj=new Task163 ();
		  String n=obj.reverse("hello");
		  System.out.println(n);

	}

}
