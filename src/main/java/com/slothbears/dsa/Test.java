package com.slothbears.dsa;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {

		int i=1;
		HashMap<String , Integer> abc = new HashMap<String, Integer>();
		abc.put(null, 2);
		abc.put(i+"", 3);
		abc.put("i", 4);
		abc.get(i);
		
		
	}

}
