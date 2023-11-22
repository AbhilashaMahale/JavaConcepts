package com.exceptions;

public class Customised  {
	
	public static void add(int a, int b) throws CustomisedExceptionEx
	{
		if(a>= 0 && b>=0) 
		{
			int res = a+b;
			System.out.println("res");
		}
		else
		{
			throw new CustomisedExceptionEx();
		}
	}
	
public static void main(String[] args) {
	System.out.println("main starts");
	try { 
		
      add(2,3);
		
	} catch(CustomisedExceptionEx e){
		e.printStackTrace();
	}
	System.out.println("=====");
	try {
		add(1,-6);
	} catch (CustomisedExceptionEx e) {
		System.out.println("Input numbers are negative");
	}
	}

}
