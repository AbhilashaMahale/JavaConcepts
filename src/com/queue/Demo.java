package com.queue;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		p.add("A");
		p.add("B");
		p.offer("C");
		p.offer("C");
		System.out.println(p);
		System.out.println("=================");
		System.out.println(p.element());
		
		System.out.println(p.peek());
		System.out.println("========");
		System.out.println(p.remove());
		System.out.println(p);
		System.out.println(p.peek());
		System.out.println("=======");
		Iterator i = p.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		
	}

}
