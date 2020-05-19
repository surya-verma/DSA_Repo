package com.slothbears.dsa.java.multithreading;

public class ThreadExampleSecond implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Thread Created by implementing Runnable Class" + Thread.currentThread().getId() + " is starting");
			Thread.sleep(300);
			System.out.println("Thread Created by implementing Runnable Class" + Thread.currentThread().getId() + " is completed");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
