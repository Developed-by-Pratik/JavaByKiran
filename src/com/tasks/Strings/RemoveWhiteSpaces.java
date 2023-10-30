package com.tasks.Strings;

import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your String : ");
		String s = sc.nextLine();
		sc.close();

		String x = s.replace(" ", "");
		System.out.println("New String is : " + x);

	}

}
