package com.linkedlist;
import java.util.*;

public class NameSort implements Comparable {


	String Name;
	int Id;
	int age;
	public NameSort(String name, int id, int age) {
		super();
		this.Name = name;
		this.Id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "NameSort [Name=" + Name + ", Id=" + Id + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		NameSort s1 = (NameSort) o;
		return  this.Name.compareTo(s1.Name);

	
	}


}
