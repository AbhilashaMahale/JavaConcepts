package com.linkedlist;

import java.util.ArrayList;
import java.util.Iterator;
public class EmployeeDriver {

	public static void main(String[] args) {
	
		ArrayList a = new ArrayList();
		
		a.add(new AssigmentEmployeeEx("Dhruv",12,50000,"Operations"));
		a.add(new AssigmentEmployeeEx("Prasanna",13,70000,"HR"));
		a.add(new AssigmentEmployeeEx("Nisha",14,40000,"Non Technical"));
		a.add(new AssigmentEmployeeEx("Ramya",15,60000,"Finance"));
		System.out.println(a);

	}

}
