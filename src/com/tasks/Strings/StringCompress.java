package com.tasks.Strings;

import java.util.Scanner;

public class StringCompress {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		String compressed = compressString(s);
		System.out.println("Compressed string: " + compressed);
	}

	public static String compressString(String input) {
		if (input == null || input.isEmpty()) {
			return input;
		}

		String compressed = "";
		char currentChar = input.charAt(0);
		int count = 1;

		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == currentChar) {
				count++;
			} else {
				compressed += currentChar;
				if (count > 1) {
					compressed += count;
				}
				currentChar = input.charAt(i);
				count = 1;
			}
		}

		compressed += currentChar;
		if (count > 1) {
			compressed += count;
		}

		return compressed;
	}
}
