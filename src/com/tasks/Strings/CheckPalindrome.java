package com.tasks.Strings;

import java.util.Scanner;

public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String s = sc.nextLine();
		sc.close();

		String c = s;

		String ch = "";

		// reverse a string
		for (int i = c.length() - 1; i >= 0; i--) {
			ch = ch + c.charAt(i);
		}
		System.out.println("Reversed String : " + ch);

		if (ch.equals(s)) {
			System.out.println("The String is Palindrome !");
		} else {
			System.out.println("The String is Not A Palindrome !");
		}
	}

}
