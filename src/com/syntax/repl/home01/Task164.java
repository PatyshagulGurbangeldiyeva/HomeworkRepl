package com.syntax.repl.home01;

public class Task164 {
	/*Create final method avgElements that will 
	 * average all the elements in an integer array (passed to the method as a parameter)
	 *  and return the average
	 * result: 4.8
	 */

		
	public static void main(String[] args) {
		
			int[] a = {2,7,3,8,4};
			System.out.println(avgElements(a)); //should print 4.8
		

	}
	
	public static final double avgElements(int []arr){
		  double average=0;
		  for (int i=0; i<arr.length;i++){
		    average+=arr[i];
		  }
		  
		  return average/arr.length;
		}

}
