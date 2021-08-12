package com.coderlogs;

public class LambdaDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(() -> {
			
			for (int i = 0; i < 5; i++) {
				System.out.println("coder" + Thread.currentThread());
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					
				}
			}
		
		}, "Coder Thread");
		Thread t2 = new Thread(() -> {
			
			for (int i = 0; i < 5; i++) {
				System.out.println("logs");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					
				}
			}
		
		}, "Logs Thread");
		
//		methods on threads
		System.out.println(t1.getName());

		System.out.println(t2.getName());
//		t1.setName("test");
//		t1.getPriority()
//		t1.setPriority(10);
		
		t1.start();
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			// TODO: handle exception
		}
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println(t1.isAlive());
		System.out.println("I am called from main hread");
		
		
	}

}
