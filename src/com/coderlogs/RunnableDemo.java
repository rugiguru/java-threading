package com.coderlogs;

class CoderTest implements Runnable {
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("coder");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}

}

class LogsTest implements Runnable {
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("logs");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}

}

public class RunnableDemo {
	
	public static void main(String[] args) {
		
		CoderTest cd  = new CoderTest();
		LogsTest lg = new LogsTest();
		
		Thread t1 = new Thread(cd);
		Thread t2 = new Thread(lg);
		
		t1.start();
		t2.start();
	}

}
