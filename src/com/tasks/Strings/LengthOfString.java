package com.tasks.Strings;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String s = sc.next();
		sc.close();

		int len = s.length();
		System.out.println("The length of given string is : " + len);

	}

}
