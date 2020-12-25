package com.syntax.repl.home01;

class Task171_1 implements Functions{


	  public double adding(double firstNumber, double secondNumber){
	    return firstNumber+secondNumber;
	  }
	  
	 public double subtracting (double firstNumber, double secondNumber){
	    return firstNumber-secondNumber;
	  }
	  
	  public double multiply(double firstNumber, double secondNumber){
	    return firstNumber*secondNumber;
	  }
	  
	  public double dividing (double firstNumber, double secondNumber){
	    return firstNumber/secondNumber;
	  }
	  
	  public void display(double result){
	   System.out.println("Result is ::: "+result);
	  }
	  
	  public static void main (String [] args){
	   
	    double firstNumber=100;
	    double secondNumber=20;
	    double result;
	    
	  Task171_1 obj=new Task171_1();
	  result=obj.adding( firstNumber, secondNumber);
	  obj.display(result);

	    
	  }
	}
