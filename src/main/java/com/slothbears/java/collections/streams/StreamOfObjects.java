package com.slothbears.java.collections.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfObjects {

	public static void main(String[] args) {
		
		Employee[] arrayOfEmps = {
			    new Employee(1, "Jeff Bezos", 100000.0), 
			    new Employee(2, "Bill Gates", 200000.0), 
			    new Employee(3, "Mark Zuckerberg", 300000.0)
			};

		Supplier<Stream<Employee>> empStreamSupplier = () -> Stream.of(arrayOfEmps);
		
		empStreamSupplier.get().forEach(employee -> System.out.println(employee.toString()));
		
		//empStreamSupplier.get().collect(Collectors.toMap(e -> e.empid, e ->e, BinaryOperator.maxBy(Comparator.comparingDouble(e->e.salary))));
	}

}
