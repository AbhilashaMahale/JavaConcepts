package com.linkedlist;

import java.util.LinkedList;
import java.util.Iterator;

public class Demo {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add(29);
		l.add("dinga");
		l.add('a');
		l.add(29);
		l.add(null);
		l.add(1,"ram");
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		LinkedList l2 = new LinkedList(l);
		System.out.println(l2);
		l2.add("rita");
		l2.add(true);
		l2.add(67.9);
		System.out.println(l2);
		l2.removeAll(l);
		System.out.println(l2);
		
	}

}
