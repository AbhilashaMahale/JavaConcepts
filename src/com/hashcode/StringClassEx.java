package com.hashcode;

public class StringClassEx {

	public static void main(String[] args) {
		String s1 = "HELLO";
		String s2 = "hello";
		String s3 = "java";
		String s4 = "java";
		System.out.println("length of s1: "+s1.length());
		System.out.println("length of s1: "+s2.length());
		
		System.out.println("======charAt(index(char)=========");
		System.out.println(s1.charAt(3));
		//System.out.println(s1.charAt(6));//String index out of bound exception
		System.out.println(s2.charAt(4));
		System.out.println("============index of(char)=========");
		System.out.println(s1.indexOf('l'));//returns negative value when character not found
		System.out.println(s1.indexOf('L'));
		System.out.println(s2.indexOf('h'));
		System.out.println("=======indexOf(char,startindex)====");
		System.out.println(s1.indexOf('L',3));
		System.out.println("===================================");
		System.out.println("===========equals(String)==========");
		System.out.println(s1.equals(s2));
		System.out.println("====================================");
		System.out.println(s3.equals(s4));
		System.out.println("========equalsIgnoreCase(String)=====");
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.equalsIgnoreCase(s4));
		
		System.out.println("==========subString(Startinex,EndIndex-1)============================");
		System.out.println(s2.substring(0, 3));
		
		
		
		
		
		
	}

}
