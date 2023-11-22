package com.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsList {
	public static void main(String[] args) {
		ArrayList a  = new ArrayList();
		a.add(23);
		a.add(67.8);
		a.add("abd");
		a.add('w');
		a.add(null);
		System.out.println(a);
		Iterator i = a.iterator();
		/*
		while(i.hasNext()) 
		{
			System.out.println(i.next());
		}*/
		int count = 0;
		Integer w = 23;
		while(i.hasNext()) 
		{
			if(i.next() == w) {
				count++;
			}
			
		} 
		System.out.println(count);

		/*	for (Object i:a)
		{
		System.out.println(i);

		}
		
		System.out.println(a);
		System.out.println(a.contains(67.8));
		System.out.println(a.contains("fgh"));
		a.remove("abc");
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println("=========================");
		ArrayList a1 = new ArrayList();
		a1.add(true);
		a1.add(45);
		a1.add(34.4);
		System.out.println(a1);
		a1.addAll(a);
		System.out.println(a1);
		System.out.println(a1.containsAll(a));
		a1.retainAll(a);
		a1.removeAll(a);
		System.out.println(a);
		a1.clear();
		System.out.println(a1);*/
		
		
	}

}
