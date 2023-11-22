package com.hashcode;
//override object class methods in string class
//allocation of string object


public class Sample2 {
	
	public static void main(String[] args) {
	String s1 = "Java";
	String s2 = "SQL";
	System.out.println(s1==s2);
	String s3 = "SQL";
	System.out.println(s2==s3);
	String s4 = new String("Dinga");
	String s5 = new String("Dinga");
	System.out.println(s4==s5);

	}
}
