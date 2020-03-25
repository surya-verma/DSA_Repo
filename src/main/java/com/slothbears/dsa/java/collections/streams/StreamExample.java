package com.slothbears.dsa.java.collections.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

/*There are many ways to create a stream instance of different sources. 
 * Once created, the instance will not modify its source, 
 * therefore allowing the creation of multiple instances from a single source.
 * */

public class StreamExample {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();

		alist.add("Surya");
		alist.add("Raju");
		alist.add("Alex");
		alist.add("Raj");
		alist.add("Alex");

		Stream<String> alistStream = alist.stream();

		alistStream.forEach(element -> System.out.println(element));

		long count = alist.stream().distinct().count();

		System.out.println(count);

	}

}
