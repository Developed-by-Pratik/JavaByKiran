package com.tasks.Strings;

import java.util.Scanner;

public class CheckAnagrams {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first String :");
		String s1 = sc.nextLine();
		
		System.out.print("Enter the second String :");
		String s2 = sc.nextLine();
		
		sc.close();
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		if (s1.length() == s2.length()) {
			
			int countS1 = 0;
	        int countS2 = 0;
			
			//outer for loop for first string 
			for (int i = 0; i < s1.length(); i++) {
				
				char currentChar = s1.charAt(i);
				
		        //this for second string 
		        for (int j = 0; j < s2.length(); j++) {
		            if (s1.charAt(j) == currentChar) {
		                countS1++;
		            }
		            if (s2.charAt(j) == currentChar) {
		                countS2++;
		            }
		        }
			}
			
			if (countS1 == countS2) {
				System.out.println("Anagram !");
			} else {
				System.out.println("Not an Anagram !");
			}
			
		} else {
			System.out.println("Not an Anagram !");
		}
		
	}
	
}
