package com.abstraction;

public class Operations extends Employee{
	
	@Override public float GetBonus() {
		return (super.GetBonus()+8);
	}

}
