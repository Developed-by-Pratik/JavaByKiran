package com.tasks.Strings;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {

		int countVowels = 0;
		int countConsts = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string : ");
		String s = sc.next();
		sc.close();

		String x = s.toLowerCase();

		for (int i = 0; i < x.length(); i++) {

			if ('a' == x.charAt(i) || 'e' == x.charAt(i) || 'i' == x.charAt(i) || 'o' == x.charAt(i) || 'u' == x.charAt(i)) {
				countVowels++;
			} else {
				countConsts++;
			}

		}

		System.out.println("Vowels in a String : " + countVowels);
		System.out.println("Consta in a String : " + countConsts);

	}

}
