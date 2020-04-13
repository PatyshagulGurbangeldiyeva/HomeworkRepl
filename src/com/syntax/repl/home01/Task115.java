package com.syntax.repl.home01;

public class Task115 {
	
		  String censorLetter (String a, char b){
		    String word=a.replace(b,'*');
		    return word;
		    }
		    	
		   
		 
		  
		  public static void main (String [] args){
		    Task115 obj=new Task115 ();
		    System.out.println(obj.censorLetter ("computer schience", 'e'));
		  }
		}
		 


