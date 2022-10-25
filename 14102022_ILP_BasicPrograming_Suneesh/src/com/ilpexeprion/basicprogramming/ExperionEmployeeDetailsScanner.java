package com.ilpexeprion.basicprogramming;

import java.util.Scanner;

public class ExperionEmployeeDetailsScanner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String trainingName = "*****************  Welcome to ILP Program **************************";
		String employeeName;
		int employeeAge;
		char employeeGender;
		double employeeCgpa;

		System.out.println("Enter your employee name - ");
		employeeName=scanner.nextLine();
		System.out.println("Enter your employee age - ");
		employeeAge=scanner.nextInt();
		System.out.println("Enter your employee gender - ");
		employeeGender=scanner.next().charAt(0);
		System.out.println("Enter your employee CGPA - ");
		employeeCgpa=scanner.nextDouble();

		System.out.println(trainingName);
		System.out.println("Name" + "	 " + "Age" + "	 " + "Gender" + "	 " + "CGPA");
		System.out.println(employeeName + "	 " + employeeAge + "	 " + employeeGender + "	 " + employeeCgpa);

	}

}
