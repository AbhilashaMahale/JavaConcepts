package com.javalibraries;

public class DriverBox {
	public static void main(String[] args) {
		Box b1 = new Box(10.0,"Abhi");
		Box b2 = new Box(20.0,"Samy");
		System.out.println(b1==b2);
		System.out.println("=====");
		System.out.println(b1.equals(b2));
	}

}
