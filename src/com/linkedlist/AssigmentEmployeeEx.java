package com.linkedlist;
import java.util.ArrayList;

import com.comparemethod.Comparable;

public class AssigmentEmployeeEx  {


	String Name;
	int Id;
	double Salary;
	String Department;
	
	public AssigmentEmployeeEx(String name, int id, double salary, String department) {
		super();
		Name = name;
		Id = id;
		Salary = salary;
		Department = department;
	}

	@Override
	public String toString() {
		return "AssigmentEmployee [Name=" + Name + ", Id=" + Id + ", Salary=" + Salary + ", Department=" + Department
				+ "]";
	}
	}	

