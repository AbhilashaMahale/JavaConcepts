package com.linkedlist;

public class AgeSort implements Comparable {

	String Name;
	int Id;
	int age;
	public AgeSort(String name, int id, int age) {
		super();
		Name = name;
		Id = id;
		this.age = age;
	}
	@Override
	public String toString() {
		return "NameSort [Name=" + Name + ", Id=" + Id + ", age=" + age + "]";
	}

	@Override
	public int compareTo(Object o) {
		AgeSort s1 = (AgeSort) o;
		if(this.age>s1.age) {
			return -1;
		}
		else if(this.age<s1.age) {
			return 1;
		}
		else 
			return 0;
	}

}
