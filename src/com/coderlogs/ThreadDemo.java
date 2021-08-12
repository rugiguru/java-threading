package com.coderlogs;

class Coder extends Thread {
	
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

class Logs extends Thread {
	
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

public class ThreadDemo {
	
	public static void main(String[] args) {
		
		Coder cd  = new Coder();
		Logs lg = new Logs();
		
		cd.start();
		lg.start();
	}

}
