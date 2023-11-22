package com.comparator;

public class Student {

		String Name;
		int Id;
		int age;
		public Student(String name, int id, int age) {
			super();
			Name = name;
			Id = id;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Student [Name=" + Name + ", Id=" + Id + ", age=" + age + "]";
		}
		

}
