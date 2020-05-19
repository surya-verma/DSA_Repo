package com.slothbears.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		
		ArrayList<String> alist = new ArrayList<String>();
		
		alist.add("Surya");
		alist.add("Raju");
		alist.add("Alex");
		alist.add("Raj");
		
		ArrayList<String> acol = new ArrayList<String>();
		
		acol.add("Oscar");
		acol.add("Gaga");
		acol.add("Salim");
		
		
		alist.addAll(acol);
		
		// Total Items in ArrayList
		System.out.println("Total Items in ArrayList = "+alist.size());

		
		// Iterate over List using for-each loop
		System.out.println("for-each loop");
		
		for(String str:alist) {
			System.out.println(str.toString());
		}
		
		// While loop Iterate using Iterator

		System.out.println("While loop Using Iterator");

		Iterator<String> itr = alist.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		
		// For loop Iterate using Iterator

		System.out.println("For loop Using Iterator");

		for (Iterator iterator = alist.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
			
		}
		
		//Sorting the collection
		
		System.out.println("After Sorting");

		Collections.sort(alist);
		
		for(String str:alist) {
			System.out.println(str.toString());
		}
		
		//Reverse the collection sorting
		
		System.out.println("Reverese Sorting");

		Collections.reverse(alist);
		
		for(String str:alist) {
			System.out.println(str.toString());
		}
		
	}

}
