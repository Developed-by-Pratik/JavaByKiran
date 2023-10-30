package com.tasks.Strings;

import java.util.Scanner;

public class StringPermutations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String input = sc.nextLine();
        sc.close();
		generatePermutations(input, "");
	}
	public static void generatePermutations(String remaining, String current) {
		if (remaining.isEmpty()) {
			System.out.println(current);
		} else {
			for (int i = 0; i < remaining.length(); i++) {
				char ch = remaining.charAt(i);
				String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);
				generatePermutations(newRemaining, current + ch);
			}
		}
	}
}
