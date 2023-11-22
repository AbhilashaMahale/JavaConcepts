package com.hashset;
import java.util.*;

public class Demo {
	public static void main(String[] args) {
		HashSet s = new HashSet();
		s.add("dinga");
		s.add(null);
		s.add(23);
		s.add(true);
		s.add(23);
		s.add('d');
		System.out.println(s);
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}

}
