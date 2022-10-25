package com.assignment_basic_programming;

import java.util.Scanner;

public class PrintSeries2 {
	
//	Write a program to print the following patterns 
//
//	1 
//
//	1  2 
//
//	1   2    3 
//
//	1    2     3     4 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit - ");
		int seriesLimit = scanner.nextInt();
		for(int i=1;i<=seriesLimit;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println("\n");
		}
	}

}
