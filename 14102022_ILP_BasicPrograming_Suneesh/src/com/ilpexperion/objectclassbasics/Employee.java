package com.ilpexperion.objectclassbasics;

public class Employee {

	String employeeName = "Suneesh";
	int employeeAge = 36;
	char employeeGender = 'M';
	double employeeCgpa = 8.5;

	public void displayEmployeeDetails() {
		System.out.println("*****************  Welcome to ILP Program **************************");
		System.out.println("Name" + "	 " + "Age" + "	 " + "Gender" + "	 " + "CGPA");
		System.out.println(employeeName + "	 " + employeeAge + "	 " + employeeGender + "	 " + employeeCgpa);
	}

}
