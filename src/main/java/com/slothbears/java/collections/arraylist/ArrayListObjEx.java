package com.slothbears.java.collections.arraylist;

import java.util.ArrayList;
import java.util.Collections;

import com.slothbears.java.collections.SortByName;
import com.slothbears.java.collections.SortByRoll;
import com.slothbears.java.collections.Student;

public class ArrayListObjEx {

	public static void main(String[] args) {
		
		ArrayList<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(223, "Chaitanya", 26));
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(209, "Ajeet", 32));

		   System.out.println("Before Sorting");
		   
		   for(Student str: arraylist){
				System.out.println(str.getRollno()+","+str.getStudentname()+","+str.getStudentage());
		   }
		   
		   Collections.sort(arraylist);

		   System.out.println("After Sorting by Age");

		   for(Student str: arraylist){
				System.out.println(str.getRollno()+","+str.getStudentname()+","+str.getStudentage());
		   }
		   
		   Collections.sort(arraylist, new SortByName());
		   
		   System.out.println("After Sorting by Name");

		   for(Student str: arraylist){
				System.out.println(str.getRollno()+","+str.getStudentname()+","+str.getStudentage());
		   }
		   
		   Collections.sort(arraylist, new SortByRoll());
		   
		   System.out.println("After Sorting by Roll");

		   for(Student str: arraylist){
				System.out.println(str.getRollno()+","+str.getStudentname()+","+str.getStudentage());
		   }
		   
	}

}
