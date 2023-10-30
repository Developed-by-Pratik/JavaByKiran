package com.tasks.Strings;

import java.util.Scanner;

public class StringCaseConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        sc.close();

        String upperCase = toUpperCase(input);
        String lowerCase = toLowerCase(input);

        System.out.println("Original string: " + input);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
    }

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    public static String toLowerCase(String input) {
        return input.toLowerCase();
    }
}
