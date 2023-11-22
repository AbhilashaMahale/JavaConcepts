package com.threadcustomised;

public class Demo2 implements Runnable{
	
	//using runnable interface

	@Override
	public void run() {
		for(int i = 5;i>0;i--) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		Thread t1 = new Thread(d);//create thread object and reference variable of sub class
		t1.start();
		
	}
	

}
