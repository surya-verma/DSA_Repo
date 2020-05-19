package com.slothbears.java.collections;

import java.util.Comparator;

public class SortByRoll implements Comparator<Student>{

	public int compare(Student o1, Student o2) {
		return o1.getRollno()-o2.getRollno();
	}

}
