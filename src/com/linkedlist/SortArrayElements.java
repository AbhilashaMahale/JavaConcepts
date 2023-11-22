package com.linkedlist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayElements {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(23);
		a.add(45);
		a.add(19);
		a.add(34);
		a.add(67);
		a.add(10);
		System.out.println(a);
		System.out.println("======sorting=====");
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}


}
