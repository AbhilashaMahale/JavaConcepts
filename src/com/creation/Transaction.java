package com.creation;
import com.implementation.*;

public class Transaction {
	public User createObject(int pin) {
		if(pin == 1234) {
			System.out.println("User is traneferirng money from ATM");
			ATM A = new ATM();
			User u = A;
			return u;
		}
		else if(pin == 1000) {
			System.out.println("User is traneferirng money from Webservices");
			WebServices W = new WebServices();
			User u = W;
			return u;
		}
		else {
			System.out.println("You have entered invalid input");
			return null;
		}
	}

}
