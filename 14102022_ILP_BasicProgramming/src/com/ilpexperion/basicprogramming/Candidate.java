package com.ilpexperion.basicprogramming;

public class Candidate {

	public static void main(String[] args) {
		
		int employeeAge= 22;
		char employeeGender = 'F';
		String employeeName = "Fadia Haris";
		String trainingName = "*************** Welcome to ILP Program ***************";
		float employeeCgpa = 9.19f; //double can be used without conversion, by default it is taken as double and need to be converted to float using f.
		System.out.println(trainingName);
		System.out.println("Name" + "		Age" + "	Gender" + "  CGPA");
		System.out.println(employeeName + "	 "+employeeAge + "	" + employeeGender + "	" + employeeCgpa);

	}

}
