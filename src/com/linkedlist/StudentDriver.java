package com.linkedlist;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.ArrayList;

public class StudentDriver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList();
		
		a.add(new Student("dinga",12,23));
		a.add(new Student("abhi",13,70));
		a.add(new Student("samy",14,80));
		a.add(new Student("yuv",15,90));
		System.out.println(a);
		
	}

}
