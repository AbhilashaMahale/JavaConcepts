package com.exceptions;

public class Propogation {
	public static void check() throws Exception {
		throw new Exception();
	}
	
	public static void main(String[] args) {
		try {
		check();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
