package com.syntax.repl.home01;

import java.util.Scanner;

public class Task035 {

	public static void main(String[] args) {
		// For you to do:
		//Create a program that prompt user with question:  "Do you need a loan?"
		//If the result is true then prompt user with question: "What is your credit score?". Otherwise eligibility is "Unknown"
			//Based on the score define users eligibility:
			//if score is below  600 --> eligibility = "Not eligible"
			//if score is between 600 and 700 inclusive -->  eligibility = "Maybe eligible"
			//if score is between 701 and 800 inclusive -->  eligibility = "Eligible"
			//if score is higher than any other previous values --> eligibility = "Definitely eligible" .   

			//Output: 
			//"The eligibility is ____"
		
		
		    Scanner input=new Scanner (System.in);
		    
		    boolean answer=true;
		    String eligibility="Yes or No";
		    int score;
		    
		    System.out.println("Do you need a loan?");
		    answer=input.nextBoolean();
		   
		       if (answer==true){
		          System.out.println("What is your credit score?");
		           score=input.nextInt();
		            if (score<600){
		        eligibility="not eligible";
		            }else if (score>=600 && score<=700){
		        eligibility="may be eligible";
		           }else if (score>=701 && score<=800){
		        eligibility="eligible";
		           }else {
		        eligibility="definitely eligible";
		      }
		      
		      
		    }else {
		      eligibility="Unknown";
		    }
		    
		    System.out.println("The eligibility is "+eligibility);
		  }

		}