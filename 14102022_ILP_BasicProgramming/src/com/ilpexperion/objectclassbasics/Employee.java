package com.ilpexperion.objectclassbasics;

public class Employee {
	
	int employeeAge=22;
	char employeeGender='F';
	String employeeName="Fadia Haris";
	double employeeCgpa=9.19;
	
	public void displayEmployeeDetails()
	{
		System.out.println("*************** Welcome to ILP Program ***************");
		System.out.println("Name" + "		Age" + "	Gender" + "  CGPA");
		System.out.println(employeeName + "	" + employeeAge + "	" + employeeGender + "	" + employeeCgpa);

	}
}

