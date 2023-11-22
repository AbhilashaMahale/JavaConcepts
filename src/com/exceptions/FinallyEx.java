package com.exceptions;

public class FinallyEx {
	
	public static void test(int a) {
		try 
		{
			int res = 500/a;
			System.out.println(res);
		} catch(ArithmeticException a1)
		{
			a1.getMessage();
			
		}
		finally 
		{
			System.out.println("ArithmeticException handled");
		}
		try
		{
		int f[] = {10,20,30,40};
		System.out.println(f[20]);
		}
		catch(ArrayIndexOutOfBoundsException a2)
		{
			a2.getMessage();
		}
		finally
		{
			System.out.println("Array exception handled");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("main starts");
		test(0);
		System.out.println("main ends");
	}
	

}
