package com.tasks.Strings;

import java.util.Scanner;

public class SumDigitsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int sumOfDigits = sumDigitsInString(input);

        System.out.println("Original string: " + input);
        System.out.println("Sum of digits: " + sumOfDigits);
    }

    public static int sumDigitsInString(String input) {
        int sum = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(c)) {
                int digitValue = Character.getNumericValue(c);
                sum += digitValue;
            }
        }

        return sum;
    }
}

