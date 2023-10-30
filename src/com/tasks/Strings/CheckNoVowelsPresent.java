package com.tasks.Strings;

import java.util.Scanner;

public class CheckNoVowelsPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean noVowelsPresent = checkIfNoVowelsPresent(input);

        System.out.println("Original string: " + input);
        System.out.println("No vowels are present: " + noVowelsPresent);
    }

    public static boolean checkIfNoVowelsPresent(String input) {
        input = input.toLowerCase(); // Convert to lowercase for case-insensitive check

        boolean noVowels = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                noVowels = false;
                break; // At least one vowel is found, so exit the loop
            }
        }

        return noVowels;
    }
}

