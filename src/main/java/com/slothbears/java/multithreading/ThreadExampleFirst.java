package com.slothbears.java.multithreading;

public class ThreadExampleFirst extends Thread {

	public void run() {
		try {
			System.out.println(
					"Thread Created by Extending Thread Class" + Thread.currentThread().getId() + " is starting");
			Thread.sleep(1000);
			System.out.println(
					"Thread Created by Extending Thread Class" + Thread.currentThread().getId() + " is completed");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
