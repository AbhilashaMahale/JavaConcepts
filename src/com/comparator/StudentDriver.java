package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

import com.linkedlist.IdSort;

public class StudentDriver {
	
	public static void main(String[] args) {
		ArrayList A = new ArrayList();
		A.add(new IdSort("dinga",12,23));
		A.add(new IdSort("abhi",15,31));
		A.add(new IdSort("Yasmin",11,37));
		A.add(new IdSort("Sharan",13,28));
		System.out.println(A);
		Collections.sort(A);
		System.out.println("after sorting");
		System.out.println(A);
		Collections.sort(A,new StudentName());
		System.out.println("======");
		System.out.println(A);
		System.out.println("====");
		Collections.sort(A,new StudentAge());
		Collections.sort(A);
		
		
	}

}
