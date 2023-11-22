package com.linkedlist;

import java.util.Collections;
import java.util.ArrayList;

public class IdSortDriver {
	public static void main(String[] args) {
		ArrayList A = new ArrayList();
		A.add(new IdSort("dinga",12,23));
		A.add(new IdSort("abhi",15,31));
		A.add(new IdSort("Yasmin",11,37));
		A.add(new IdSort("Sharan",13,28));
		System.out.println(A);
		Collections.sort(A);;
		System.out.println("after sorting");
		System.out.println(A);
	}
}
