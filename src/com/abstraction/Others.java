package com.abstraction;

public class Others extends Employee {
	@Override public float GetBonus() {
		return (super.GetBonus()+4);
	}

}
