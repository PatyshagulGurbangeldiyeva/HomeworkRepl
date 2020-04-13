package com.syntax.repl.home01;

public class Task136 {
	
		  
	String schoolName,lastDayOfClass;
	  int batch,year;
	   
	  
	   protected Task136(){
	   // System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	  }
	 protected Task136 (String str1, int a, int b, String str2){
	   schoolName=str1;
	   batch=a;
	   year=b;
	   lastDayOfClass=str2;
	  
	 }
	  protected void method () {
		  System.out.println(schoolName+" "+batch+" "+year+" "+lastDayOfClass);
	  }
	 
	
	}
class Main {
	  public static void main (String []args){
		  Task136 task1=new Task136();
		  Task136 task2=new Task136("Syntax",6,2020,"07/30/2020");
		 System.out.println("hello"); 
		  task2.method();

	  }	
	}

		  
		  
		  
		


