package com.abstraction;
import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the type of Employee");
		String EmployeeTyp1 = s.nextLine();
		System.out.println("The Type found is " +EmployeeTyp1);
		CalculateBonus B = new CalculateBonus();
		Employee E1 = B.BonusCalc(EmployeeTyp1);
		System.out.println(E1.GetBonus());
		
	}

}

