package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class CandidateDetails {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String trainingName = "*************** Welcome to ILP Program ***************";
		int employeeAge;
		char employeeGender;
		String employeeName;
		float employeeCgpa; // double can be used without conversion, by default it is taken as double and
							// need to be converted to float using f.

		System.out.println("Enter your employee name");
		employeeName = scanner.nextLine();

		System.out.println("Enter your employee age");
		employeeAge = scanner.nextInt();

		System.out.println("Enter your employee gender");
		employeeGender = scanner.next().charAt(0);

		System.out.println("Enter your employee cgpa");
		employeeCgpa = scanner.nextFloat();

		System.out.println(trainingName);
		System.out.println("Name" + "		Age" + "	Gender" + "  CGPA");
		System.out.println(employeeName + "	" + employeeAge + "	" + employeeGender + "	" + employeeCgpa);

	}

}
