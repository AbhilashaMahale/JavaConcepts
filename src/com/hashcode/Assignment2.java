package com.hashcode;
import java.util.Scanner;
//write a pgm to count how many times character 'a' have occured in given string

public class Assignment2 {
	
	public static void main(String[] args) {
	
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the name");
	String s1 = s.nextLine();
	int i2 = s1.length();
	//System.out.println(i2);
		
	int count = 0;
	for(int i =0;i<i2;i++) {
		if(s1.charAt(i )== 'a') 
		{			
			count++;	
		}
	  }
	System.out.println("Count of character 'a' in the given string is: "+count);
	}

}
