package com.ImmutableString;

public class StringBufferEx {
	
	public static void main(String[] args) {
		/*
	StringBuffer S1 = new StringBuffer("Hello");
	StringBuffer S2 = S1;
	StringBuffer S3 = new StringBuffer("GDMRNG");
	StringBuffer S4 = S1;
	System.out.println(S1==S2);
	System.out.println(S3==S2);
	System.out.println(S4==S3);
	
	String H1 = new String("Hey");
	String H2 = H1;
	String H3 = new String("He He");
	String H4 = H1;
	System.out.println(H1==H2);
	System.out.println(H3==H2);
	System.out.println(H4==H3);
	
	*/
	String V1 = "NEW";
	String V2 = "NEW";
	System.out.println(V1==V2);
	//System.out.println(V1);
	//System.out.println(V2);
	System.out.println("=======");
	System.out.println("V1 hasshcode "+V1.hashCode());
	System.out.println("V2 hashcode" +V2.hashCode());
	System.out.println("V1.Equals V2"+V1.equals(V2));
	
	StringBuffer W1 = new StringBuffer("OLD");
	StringBuffer W2 = new StringBuffer("OLD");
	System.out.println(W1==W2);
	System.out.println("W1 hasshcode "+W1.hashCode());
	System.out.println("W2 hashcode" +W2.hashCode());
	//System.out.println(W1);
	//System.out.println(W2);
	System.out.println("W1.Equals W2"+W1.equals(W2));
	
	
}
	
}
