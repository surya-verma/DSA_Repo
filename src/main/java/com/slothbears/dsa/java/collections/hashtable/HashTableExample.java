package com.slothbears.dsa.java.collections.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {

	public static void main(String args[]) {
		// Creating a Hashtable
		Hashtable<String, String> hashtable = new Hashtable<String, String>();

		// Adding Key and Value pairs to Hashtable
		hashtable.put("Key1", "Chaitanya");
		hashtable.put("Key2", "Ajeet");
		hashtable.put("Key3", "Peter");
		hashtable.put("Key4", "Ricky");
		hashtable.put("Key5", "Mona");

		Enumeration<String> keys = hashtable.keys();
		while (keys.hasMoreElements()) {
			String key = keys.nextElement();
			String name = hashtable.get(key);
			System.out.println(key + " , " + name);
		}
	}

}
