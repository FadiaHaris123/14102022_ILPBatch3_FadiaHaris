package com.assignment_basic_programming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DifferenceofDates {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		//Program to enter two dates and print the difference between the two.
		System.out.println("Enter two dates in the format MM-dd-yyyy HH:mm:ss -  ");
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat obj = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
		Date secondDate = obj.parse(scanner.nextLine());
		Date firstDate = obj.parse(scanner.nextLine());
		secondDate = new SimpleDateFormat("dd-MM-yyyy").parse(scanner.nextLine());
		System.out.println(firstDate);
		System.out.println(secondDate);
	}

}