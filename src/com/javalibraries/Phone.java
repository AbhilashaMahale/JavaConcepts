package com.javalibraries;

public class Phone {
	
	String Brand;
	int price;
	public Phone(String brand, int price) {
		super();
		Brand = brand;
		this.price = price;
	}
	
	public void Reviews() {
		System.out.println("Reviews updated");
	}
	/*
	@Override
	public String toString() {
		return "Phone{Brand:"+Brand+"price:"+price+}";
      }
*/

}
