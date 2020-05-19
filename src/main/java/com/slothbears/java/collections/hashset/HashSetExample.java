package com.slothbears.java.collections.hashset;

import java.util.HashSet;
import java.util.Iterator;

/*
 * Points to Note about HashSet:

1.HashSet doesn’t maintain any order, the elements would be returned in any random order.
2.HashSet doesn’t allow duplicates. If you try to add a duplicate element in HashSet, 
the old value would be overwritten.
3.HashSet allows null values however if you insert more than one nulls it would still return only one null value.
4.HashSet is non-synchronized.
5.The iterator returned by this class is fail-fast which means iterator would throw ConcurrentModificationException 
	if HashSet has been modified after creation of iterator, by any means except iterator’s own remove method.
 * */

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<String> setStringEx = new HashSet<String>();
		
		setStringEx.add(null);
		setStringEx.add("surya");
		setStringEx.add("Raj");
		setStringEx.add("gautam");
		setStringEx.add(null);
		
		System.out.println(setStringEx);
		
		Iterator<String> itrObj = setStringEx.iterator();
		
		while(itrObj.hasNext()) {
			System.out.println(itrObj.next());
		}
		

	}

}
