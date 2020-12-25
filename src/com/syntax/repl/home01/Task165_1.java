package com.syntax.repl.home01;

public class Task165_1 extends Task165 {
	

		@Override
		 void m1() {
			System.out.println("m1 without parameters");
			
		}

		@Override
		 void m1(int a) {
			System.out.println("m1 with parameter");
			
		}
		public static void main (String [] args){
			Task165 obj=new Task165_1();
			obj.m1();
			obj.m1(100);
		}
		
	}



