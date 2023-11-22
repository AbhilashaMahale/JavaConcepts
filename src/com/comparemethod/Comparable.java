package com.comparemethod;

public class Comparable {
	public static void main(String[] args) {
		String x = "AbhilA";
		String y = "Abhil";
		System.out.println(x.compareTo(y));
		System.out.println(x.compareTo(x));
		System.out.println(y.compareTo(x));
		System.out.println("======");
		Integer i = 20;
		Integer j = 30;
		System.out.println(i.compareTo(j));
		System.out.println(i.compareTo(i));
		System.out.println(j.compareTo(i));
		System.out.println("====");
		Double a = 4.5;
		Double b = 2.5;
		System.out.println(a.compareTo(b));
		System.out.println(b.compareTo(b));
		System.out.println(b.compareTo(a));
		
	}

}
