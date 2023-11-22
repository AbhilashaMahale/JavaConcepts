	package com.abstraction;
	
	public class HR extends Employee {
		@Override public float GetBonus() {
			return (super.GetBonus()+2);
		}
	
	}
