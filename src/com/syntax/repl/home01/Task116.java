package com.syntax.repl.home01;

public class Task116 {
	
		   
		   int year;
		   String schoolName;
		   int batch; 
		   
		   void print(){
		     System.out.println ("I am a student of batch "+batch+" studying at "+schoolName+" in the year of "+year);
		   }

		   public static void main (String [] args){
		     Task116 obj=new Task116 ();
		     
		     obj.year=2020;
		     obj.schoolName="Syntax";
		     obj.batch=6;
		     obj.print();
		     
		   }
		 

}
