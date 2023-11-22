package com.exceptions;
import java.util.Scanner;

public class Assignment1 {
		
		public static void Options(char Ch) throws CustExcepAssigment
		{
			
			if(Ch == 'A' || Ch == 'B' || Ch == 'C' || Ch == 'D')
			{
			
				System.out.println("Option selected is "+Ch);
			}
			else
			{
				throw new CustExcepAssigment();
			}
		}
		
	public static void main(String[] args) {
		System.out.println("main starts");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the options");
		
		try { 
		  char Z = sc.next().charAt(0);
	      Options(Z);
			
		} catch(CustExcepAssigment e){
			e.printStackTrace();
		}
		System.out.println("=====");

		}

}
