package com.linkedlist;

public class IdSort implements Comparable{
	String Name;
	int Id;
	int age;
	public IdSort(String name, int id, int age) {
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
		IdSort s1 = (IdSort) o;
		if(this.Id>s1.Id) {
			return 1;
		}
		else if(this.Id<s1.Id) {
			return -1;
		}
		else 
			return 0;
	}


}
