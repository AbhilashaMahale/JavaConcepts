package com.threadcustomised;

public class Demo extends Thread {
	@Override 
	public void run() {
		for(int i = 1;i<=5;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Demo d = new Demo();
		d.start();
		
	}

}
