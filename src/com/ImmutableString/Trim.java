package com.ImmutableString;

public class Trim {
	public static void main(String[] args) {
		String S = " Karthik  ";
		System.out.println(S.length());
		String S1 = S.trim();
		System.out.println(S1);
		System.out.println(S1.length());
		String S2 = "java is a programming language";
		System.out.println(S.contains(S2));
		System.out.println(S1.toLowerCase());
		System.out.println(S1.toUpperCase());
		System.out.println(S.indexOf('K'));
		System.out.println(S2.lastIndexOf('g'));
		
	}

}
