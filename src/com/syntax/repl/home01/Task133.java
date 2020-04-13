package com.syntax.repl.home01;

public class Task133 {
	/* Create a method that will be available to all classes
	 *  in your project with following specifications:
	 *  Returns: a String
	 *  Name: alphabetical
	 *  Parameters: a String called str
	 *  Purpose: Return a string that is composed of each letter as long as the letter is later on in the alphabet
	 *  than its previous one.  You can assume actual parameters are lowercase.
	 *  See below examples.
	 *  Additional Info: You can use < and > to compare characters (not Strings), 
	 *  where characters later on in the alphabet are "greater". 
	 *   Examples: 'a' < 'b' ==> True
	 *  		    'a' < 'a' ==> False
	 *  			'a' > 'b' ==> False
	 *  Examples: alphabetical("hello") ==> "hlo"
	 *  		  alphabetical("software") ==> "stwr"
	 *  		  alphabetical("language") ==> "lnug"

	 */

	
	static  String str;
	  
	  public static String alphabetical(String str){
	    char[]a=str.toCharArray();
	    // Array.sort(c);
	    String s=""+a[0];
	    for (int i=1;i<a.length; i++){
	      if (a[i-1]<a[i]){
	        s+=a[i];
	      }
	    }
	    return s;
	  }
	 
	  
		//test case below (dont change):
		public static void main(String[] args){
		  Main obj=new Main();
			System.out.println(alphabetical("hello")); //"hlo"
		}
		

		// teacher's solution
//char previous = str.charAt(0);
//char current;
//String newString = "" + previous;
//
//for (int i = 1; i < str.length(); i++) {
//	current = str.charAt(i);
//	if (current > previous) {
//		newString += str.charAt(i);
//	}
//	previous = current;
//}
//return newString; }
		
		
	/*
	 * String st="apple";
	 * string char[] rev=st.toCharArray();
	 * return to character
	 * array Arrays.sort(rev);
	 * sort characters alphabetically in a char array
	 * String text="";
	 * new String for(int j=0;j<rev.length;j++) {
	 *  text+=rev[j];
	 *   }
	 * System.out.println(text);
	 */
		
		
		

}
