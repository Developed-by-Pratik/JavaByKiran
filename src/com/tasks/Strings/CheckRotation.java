package com.tasks.Strings;

import java.util.Scanner;

public class CheckRotation {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first String :");
		String s1 = sc.nextLine();

		System.out.print("Enter the second String :");
		String s2 = sc.nextLine();

		sc.close();

		if ((s1.length() == s2.length())) {

			String ch = "";
			// reverse a string
			for (int i = s1.length() - 1; i >= 0; i--) {
				ch = ch + s1.charAt(i);
			}

			if (ch.equals(s2)) {
				System.out.println("The String are in rotation !");
			} else {
				System.out.println("The Strings are not in rotation !");
			}

		} else {
			System.out.println("The Strings are not in rotation !");
		}

	}

}
