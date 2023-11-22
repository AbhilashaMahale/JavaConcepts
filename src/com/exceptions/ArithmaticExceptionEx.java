package com.exceptions;
import java.util.Scanner;

public class ArithmaticExceptionEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter value of b");
        int b = sc.nextInt();
        try 
        {
            int c = a/b;
            System.out.println(c);
        }
        catch(Exception e)
        {
        	System.out.println("Arithmatic exception:Cannot divide by zero");	
        }
       
        
	}

}
