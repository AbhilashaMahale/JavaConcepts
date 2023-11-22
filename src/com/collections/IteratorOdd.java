package com.collections;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorOdd {
	public static void main(String[] args) {
		
		ArrayList a  = new ArrayList();
		a.add(20);
		a.add(4);
		a.add(8);
		a.add(6);
		a.add(7);
		a.add(2);
		a.add(3);
		a.add(39);
		a.add(47);
		a.add(56);
		a.add(68);
		a.add(72);
		a.add(99);
		
		System.out.println("array list is "+a);
		Iterator i = a.iterator();
		int count = 0;
		//Integer w = 23;
		while(i.hasNext()) 
		{
			Integer num = (Integer) i.next();
			if(num%2 != 0) {
				System.out.println(num);
				count++;
			}
			
		} 
		System.out.println("total ODD number count is "+count);
	}

}
