package com.slothbears.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamBasicExample {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList.stream().forEach(s-> System.out.println(s));

		//Filter and Print
		myList.stream()
				.filter( s -> s.startsWith("c"))
				.forEach( s -> System.out.println(s) );

		List<String> alist = myList.stream().filter( s -> s.startsWith("a")).collect(Collectors.toList());
		alist.stream()
				.map(s -> s.toUpperCase())
				.forEach(a -> System.out.println(a));

		myList.stream().sorted().forEach(s-> System.out.println(s));
	}

}
