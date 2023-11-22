package com.abstraction;

public class CalculateBonus {
	float d;
	public Employee BonusCalc(String EmployeeType) {
		//System.out.println("lets find another" +EmployeeType);
		if(EmployeeType == "HR") 
		{
			
			System.out.println("Employee Type is === "+EmployeeType);
			Employee E  = new HR();
			
			//d = E.GetBonus();
			//System.out.println("d = E.GetBonus();" +d);
			return E;
		}
		else if(EmployeeType == "Operations")
		{
			System.out.println("Employee Type is +++ "+EmployeeType);
			Operations Op = new Operations();
			Employee E = Op;
			//d = E.GetBonus();
			//System.out.println("Operations bonus is "+d);
			return E;
		}
			
		else if(EmployeeType == "Others")
		{
			System.out.println("Employee Type is ----"+EmployeeType);
            Others O = new Others();
            Employee E = O;
            //d = E.GetBonus();
            //System.out.println("Bonus for others is"+d);
            return E;
		}
		else {
			return null;
		}
	}
}

