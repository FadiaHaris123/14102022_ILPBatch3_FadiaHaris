package com.assignment_basic_programming;



import java.util.ArrayList;
import java.util.Scanner;



public class CharacterCountandReplace {



   public static void main(String[] args) {
        // 16. Program to count the occurrence of the given character in a string and
        // replace it with a new character



       Scanner scanner = new Scanner(System.in);



       System.out.println("Enter the String :");
        String element = scanner.nextLine();
        System.out.println("Enter the character of which you need to find the frequency and replace it- ");
        char letter = scanner.next().charAt(0);
        System.out.println("Enter the character to replace it- ");
        char replace = scanner.next().charAt(0);
        StringBuilder string = new StringBuilder(element);



       int count = 0;
        for (int i = 0; i < string.length(); i++) {



           if (string.charAt(i) == letter) {
                count++;
                string.setCharAt(i, replace);
            }



       }
        System.out.println("Occurrence of the character "+letter+ " is " +count);
        System.out.println("String after replacement - " + string);



   }
}