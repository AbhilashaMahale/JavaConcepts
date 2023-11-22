package com.treeset;
import java.util.*;

public class Demo {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet();
		t.add(23);
		t.add(56);
		t.add(45);
		t.add(12);
		t.add(15);
		//t.add("dinga");//exception handlinh
		System.out.println(t);
		for(Integer i:t) {
			System.out.println(i);
		}
		

	}

}
