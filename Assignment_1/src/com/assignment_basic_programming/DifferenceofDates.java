package com.assignment_basic_programming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DifferenceofDates {
	
	//19. Program to enter two dates and print the difference between the two.  

	public static void main(String[] args) throws ParseException {
		
		String dateString1;
		String dateString2;
	
		Date date1;
		Date date2;
		
		long timeDifference;
		long daysDifference;
		long yearsDifference;
		
		Scanner scanner = new Scanner(System.in);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		System.out.println("Enter first date: ");
		dateString1 = scanner.nextLine();
		date1 = dateFormat.parse(dateString1);
		
		System.out.println("Enter Second date: ");
		dateString2 = scanner.nextLine();
		date2 = dateFormat.parse(dateString2);
		
		//Find time Difference in milliseconds
		if(date1.after(date2)) {
			timeDifference = date1.getTime() - date2.getTime(); 
		}else {
			timeDifference = date2.getTime() - date1.getTime(); 
		}
			
		//Find time Difference in days
		daysDifference = (timeDifference/(1000*60*60*24)) % 365;
		
		//Find time Difference in years
		yearsDifference = (timeDifference/ (1000l*60*60*24*365));
		 
		
		System.out.print("Difference between two dates is: ");
		System.out.print(yearsDifference+" years "+daysDifference+" days ");
		

	}

}
