package com.slothbears.java.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collectionsex {

	public static void main(String[] args) {
		
		Collection coll = new ArrayList();
		
		coll.add("SURYA ! ");
		coll.add("Hello World!!");
		
		for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.print(object.toString());
		}

	}

}
