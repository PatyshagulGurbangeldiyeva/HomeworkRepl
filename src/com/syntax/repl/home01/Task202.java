package com.syntax.repl.home01;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.*;


public class Task202 {
	
	
	
	

	  public static void main (String [] args){
	    
	    HashMap <String, String> map=new HashMap<>();
	    map.put("ONE","AAA");
	    map.put("TWO","BBB");
	    map.put("THREE", "CCC");
	    map.put("FOUR","DDD");
	    map.put("FIVE","EEE");
	    
	    Set <Entry<String,String>> entry=map.entrySet();
	    
	    for (Entry<String, String> e:entry){
	      System.out.println(e.getKey()+" : "+e.getValue());
	    }
	    
	    
	  }

	}


