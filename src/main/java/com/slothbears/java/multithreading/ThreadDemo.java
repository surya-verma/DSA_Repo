package com.slothbears.java.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {

		ThreadExampleFirst thread1 = new ThreadExampleFirst();
		ThreadExampleSecond thread2 = new ThreadExampleSecond();
		thread1.run();
		thread2.run();

		System.out.println("Threads ran but not in a multithreaded way");

		Thread th1 = new Thread(new ThreadExampleFirst(), "th1");
		Thread th2 = new Thread(new ThreadExampleSecond(), "th2");
		th1.start();
		th2.start();

		System.out.println("Great!! Multithreading Works");
	}

}

/*
 * Why don’t we call run() method directly, why call start() method?
 * 
 * We can call run() method if we want but then it would behave just like a
 * normal method and we would not be able to take the advantage of
 * multithreading. When the run method gets called though start() method then a
 * new separate thread is being allocated to the execution of run method, so if
 * more than one thread calls start() method that means their run method is
 * being executed by separate threads (these threads run simultaneously).
 * 
 * On the other hand if the run() method of these threads are being called
 * directly then the execution of all of them is being handled by the same
 * current thread and no multithreading will take place, hence the output would
 * reflect the sequential execution of threads in the specified order.
 * 
 */