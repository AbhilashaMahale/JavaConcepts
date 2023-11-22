package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(29);
		l.add("dinga");
		l.add('a');
		l.add(29);
		l.add(null);
		l.add(1,"ram");
		ListIterator i = l.listIterator(6);
		while(i.hasPrevious()) {
			System.out.println(i.previous());
		}
		
        
		
	}

}
