package com.coderlogs;

class Counter {
	int count;
	
	public synchronized void count() {
		count++;
	}
}

public class SyncDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Counter c = new Counter();
		
		Thread t1 = new Thread(() -> {
			
			for (int i = 1; i <= 1000; i++) {
				c.count();
			}
		
		}, "Coder Thread");
		
		Thread t2 = new Thread(() -> {
			
			for (int i = 1; i <= 1000; i++) {
				c.count();
			}
		
		}, "Logs Thread");
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		

		System.out.println("count" + c.count);
		
		
	}

}
