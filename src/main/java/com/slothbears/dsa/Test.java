package com.slothbears.dsa;

public class Test {

	public static void main(String[] args) {

		int x=121;
		
		String xStr=Integer.toString(x);
		StringBuilder strB=new StringBuilder(xStr);
		String xStrRev=strB.reverse().toString();
		
		
		System.out.print(xStr.equals(xStrRev));
	}

}
