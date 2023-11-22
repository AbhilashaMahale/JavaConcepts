package com.linkedlist;

import java.util.Collections;
import java.util.ArrayList;

public class StringSorting {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("abhi");
		a.add("afreen");
		a.add("swati");
		a.add("samy");
		a.add("preeti");
		System.out.println(a);
		System.out.println("======sorting=====");
		Collections.sort(a);
		System.out.println(a);
		Collections.reverse(a);
		System.out.println(a);
	}

}
