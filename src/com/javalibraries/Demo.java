package com.javalibraries;

public class Demo {
	
	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.toString());
		Demo d2 = new Demo();
		System.out.println(d2.toString());
		System.out.println(d2);//toString() method is implicitly called
	}
	

}
