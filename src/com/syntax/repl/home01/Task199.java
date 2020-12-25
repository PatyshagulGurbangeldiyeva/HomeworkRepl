package com.syntax.repl.home01;
import java.util.*;
import java.util.Map.Entry;

public class Task199 {
	
//	Create HashMap 
//	add values as below
//
//	map.put("mango", 10); 
//	map.put("apple", 30); 
//	map.put("orange", 20); 
//	map.put("mango", 40); 
//	map.put("mango", 40);     
//
//	Using iterator retrieve all keys and values if the format below:
//
//	Expected Output:
//	Key = orange and value = 20
//	Key = apple and value = 30
//	Key = mango and value = 40

	
	  public static void main (String [] args){
	    
	    HashMap <String, Integer> map=new HashMap<>();
	    map.put("mango", 10); 
	    map.put("apple", 30); 
	    map.put("orange", 20); 
	    map.put("mango", 40); 
	    map.put("mango", 40);  
	    
//	    System.out.println("****** getting obj by using .values()********");---> we cannot get keys when we use values
//	    Collection <Integer> val=map.values();
//	    
//	    System.out.println("***** using iterator******");
//	    Iterator <Integer> it=val.iterator();
//	    
//	    while (it.hasNext()){
//	      int k=it.next();
//	      System.out.println("Key = "+map.getKey()+" and the values = "+k);
//	    }
//	    System.out.println();  
	    
	    System.out.println("**** using keySet *******");
	    
	   Set <String>keys= map.keySet();
	   
	   Iterator<String>key=keys.iterator();
	   
	   while (key.hasNext()) {
		   String k=key.next();
		   System.out.println("Key= "+k+" and the value= "+map.get(k));
	   }
	   
	   System.out.println();
	   System.out.println("****** using entrySet ******");
	   
	   Set <Entry <String, Integer>>entry=map.entrySet();
	   
	   Iterator <Entry<String, Integer>> it=entry.iterator();
	   while (it.hasNext()) {
		   Entry<String, Integer>next=it.next();
		   System.out.println("Key= "+next.getKey()+ " and the value= "+next.getValue());
	   }
	  }
	  
	  
}