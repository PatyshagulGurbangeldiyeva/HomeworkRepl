package com.syntax.repl.home01;
import java.util.*;
public class Task193 {
	


	  public static void main(String [] args){
	    
	    LinkedHashSet <String> obj=new LinkedHashSet();
	    obj.add("null");
	    obj.add("Sohil");
	    obj.add("Diego");
	    obj.add("Alijon");
	    obj.add("Asel");
	    obj.add("Sumair");
	    
	    for (String o:obj){
	      System.out.println(o);
	    }
	    
	    Iterator <String> it=obj.iterator();
	    while(it.hasNext()){
	      System.out.println(it.next());
	    }
	  }

	}

