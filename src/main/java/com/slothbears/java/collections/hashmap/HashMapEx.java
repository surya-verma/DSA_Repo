package com.slothbears.java.collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		HashMap<Integer, String> mapObj = new HashMap<Integer, String>();
		
		mapObj.put(1, "Surya");
		mapObj.put(3, "Raju");
		mapObj.put(2, "Harry");
		
		
		
		Set set = mapObj.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry mentry = (Map.Entry) itr.next();
			System.out.println(mentry.getKey());
			System.out.println(mentry.getValue());			
		}
	}

}
