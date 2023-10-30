package com.tasks.Strings;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String :");
		String s = sc.nextLine();
		sc.close();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {

			count = s.split("\\s").length;

		}

		System.out.println("The words in a String are : " + count);

	}

}
