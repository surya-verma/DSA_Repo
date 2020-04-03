package com.slothbears.dsa.java.multithreading;

public class TestSynchronization {
	public static void main(String[] args) {

		SynchronizedBlockExample synchronizedBlockExample = new SynchronizedBlockExample();

		ThreadOne threadOne = new ThreadOne(synchronizedBlockExample);
		threadOne.setName("ThreadOne");

		ThreadTwo threadTwo = new ThreadTwo(synchronizedBlockExample);
		threadTwo.setName("ThreadTwo");

		threadOne.start();
		threadTwo.start();

	}
}
