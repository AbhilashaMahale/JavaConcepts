package com.utilization;

import java.util.Scanner;

import com.implementation.User;
import com.creation.*;


public class MainUser {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter your pin");
		System.out.println("to make transaction through ATM enter 1234");
		System.out.println("to make transaction through ATM enter 1000");
		int p = s.nextInt();
		Transaction T = new Transaction();
		User u1 = T.createObject(p);
		u1.transfer();//follows golden java rule
	}

}
