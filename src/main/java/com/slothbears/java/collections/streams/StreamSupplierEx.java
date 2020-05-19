package com.slothbears.java.collections.streams;

import java.util.ArrayList;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSupplierEx {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();

		alist.add("Surya");
		alist.add("Raju");
		alist.add("Alex");
		alist.add("Raj");
		alist.add("Alex");
		
		Supplier<Stream<String>> streamSupplier = () -> alist.stream();
		
		streamSupplier.get().forEach(element -> System.out.println(element));
		System.out.println(streamSupplier.get().distinct().count());
		
	}

}
