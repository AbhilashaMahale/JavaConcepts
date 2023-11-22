package com.hashcode;
import java.util.Scanner;
//Generate a PGM to take the details of the Login page
//Email: Initialize only if the @character is present
//Password: Initialize only if "atleast 6 character present"
//Mob Number: Initialize only if "atleast 10 numbers present"


public class Assigment3 {
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    System.out.println("Enter the Email");
    String Email = s.nextLine();
    int i = Email.indexOf('@');
	if(i >=0) 
	{
		
		String email = Email;
		System.out.println("email is valid: "+email);
	 
	}
	else 
	{
		String email = Email;
		System.out.println("email is Invalid: "+email);
	}

    System.out.println("Enter the Password");
	String Password = s.nextLine();
	if(Password.length() >=6) 
	{
		String password = Password;
		System.out.println("Password is valid: "+password);
	}
	else 
	{
		String password = Password;
		System.out.println("Password is Invalid Enter minimum 6 character: "+password);
	}
	
	
	
	 System.out.println("Enter the Mobile Number");
	String MobileNum = s.nextLine();	
	
	
	
	if(MobileNum.length() == 10) 
	{
		String Mobilenum = MobileNum;
		System.out.println("Mobile Number is valid: "+Mobilenum);
	}
	else 
	{
		String Mobilenum = MobileNum;
		System.out.println("Mobile Number is Invalid,Enter 10 digits: "+Mobilenum);
	}
	
	


  }
}
