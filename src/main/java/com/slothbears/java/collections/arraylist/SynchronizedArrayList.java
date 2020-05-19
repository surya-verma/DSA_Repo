package com.slothbears.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//There are two ways to synchronize explicitly:
//
//1.Using Collections.synchronizedList() method
//2.Using thread-safe variant of ArrayList: CopyOnWriteArrayList

public class SynchronizedArrayList {

	public static void main(String[] args) {

		ArrayList<String> alist = (ArrayList<String>) Collections.synchronizedList(new ArrayList<String>());

		alist.add("Surya");
		alist.add("Raju");
		alist.add("Alex");
		alist.add("Raj");
		
	    System.out.println("Iterating synchronized ArrayList:");
	    
	    synchronized (alist) {
			Iterator<String> listItr = alist.iterator();
			while(listItr.hasNext()) {
				System.out.println(listItr.next().toString());
			}
		}
		
	    CopyOnWriteArrayList<String> blist= new CopyOnWriteArrayList<String>();
	    
	  //Adding elements to synchronized ArrayList
	    blist.add("Pen");
	    blist.add("NoteBook");
	    blist.add("Ink");

	    System.out.println("Displaying synchronized ArrayList Elements:");
	    //Synchronized block is not required in this method
	    Iterator<String> iterator = blist.iterator(); 
	    while (iterator.hasNext()) {
	       System.out.println(iterator.next());
	  }

	}

}
