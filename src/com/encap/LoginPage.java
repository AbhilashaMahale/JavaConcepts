package com.encap;

public class LoginPage {
	public static void main(String[] args) {
		Login L = new Login();
		System.out.println(L.getEMail());
		System.out.println(L.getPWD());
		L.SetEmail("Sammy");
		System.out.println(L.getEMail());
		L.SetPWD("Agsy");
		System.out.println(L.getPWD());
	}

}
