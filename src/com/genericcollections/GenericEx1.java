package com.genericcollections;
import java.util.ArrayList;

public class GenericEx1 {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList();
		//a.add(20.0);
		a.add(10);
		a.add(50);
		a.add(40);
		for(int j:a) {
			System.out.println(j);
		}
		System.out.println("=================");
		
		
		ArrayList<String> a1 = new ArrayList();
		a1.add(null);
		a1.add("dinga");
		//a1.add('c');
		
		for(String s:a1) {
			System.out.println(s);
		}
		System.out.println("=================");
		
		
		
	}

}
