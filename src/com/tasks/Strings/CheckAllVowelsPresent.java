package com.tasks.Strings;

import java.util.Scanner;

public class CheckAllVowelsPresent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean allVowelsPresent = checkIfAllVowelsPresent(input);

        System.out.println("Original string: " + input);
        System.out.println("All vowels are present: " + allVowelsPresent);
    }

    public static boolean checkIfAllVowelsPresent(String input) {
        input = input.toLowerCase(); // Convert to lowercase for case-insensitive check

        boolean foundA = false, foundE = false, foundI = false, foundO = false, foundU = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a') {
                foundA = true;
            } else if (c == 'e') {
                foundE = true;
            } else if (c == 'i') {
                foundI = true;
            } else if (c == 'o') {
                foundO = true;
            } else if (c == 'u') {
                foundU = true;
            }
        }

        return foundA && foundE && foundI && foundO && foundU;
    }
}

